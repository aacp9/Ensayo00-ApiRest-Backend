package cl.aacp9.service;

import java.util.List;

import cl.aacp9.model.Cliente;

public interface ClienteService {
	
	// Declarar métodos a utilzar
	
	public List<Cliente> findAllClientes();
	public Cliente findByIdCliente(String idCliente);

}
