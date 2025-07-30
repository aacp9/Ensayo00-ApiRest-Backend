package cl.aacp9.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.aacp9.model.Cliente;
import cl.aacp9.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> findAllClientes(){
		return clienteRepository.findAll();
	}

	@Override
	public Cliente findByIdCliente(String idCliente) {
		// TODO Auto-generated method stub
		return clienteRepository.findByIdCliente(idCliente);
	}

}
