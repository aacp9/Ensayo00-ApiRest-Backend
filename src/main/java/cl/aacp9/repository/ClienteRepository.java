package cl.aacp9.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.aacp9.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {
	
	//Ejemplos de metodos incluidos en JPA
	//save
	//findAll
	//findById
	//findAllById
	//delete
	
	Cliente findByIdCliente(String id);

}
