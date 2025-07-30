package cl.aacp9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.aacp9.model.Cliente;
import cl.aacp9.service.ClienteService;

@RestController
@RequestMapping("api/v1")
public class ClienteController {

	@Autowired
	public ClienteService clienteService;
	
	@GetMapping("/clientes")
	public ResponseEntity<List<Cliente>> findAll(){
		try {
			List<Cliente> listaClientes = clienteService.findAllClientes();
			if(!listaClientes.isEmpty()) {
				//retornamos la lista y un estatus de ok.
				return new ResponseEntity<>(listaClientes,HttpStatus.OK);
			}else {
				//retornamos un estatus de no encontrado
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/cliente/{id_cliente}")
	public ResponseEntity<Cliente> findByIdCliente(@PathVariable(name="id_cliente") String id){
		try {
			Cliente cliente=clienteService.findByIdCliente(id);
			//consultamos valor obtenido
			if (cliente!=null) {
				//retornamos el cliente y un estatus de ok.
				return new ResponseEntity<>(cliente, HttpStatus.OK);
			}else {
				//retornamos un estatus de no encontrado
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			// en este caso habrá un error en el sevidor
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
