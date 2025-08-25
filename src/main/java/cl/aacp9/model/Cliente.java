package cl.aacp9.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="clientes")
public class Cliente {

	@Id
	@Column(name = "id_cliente", columnDefinition = "char(5)")
	private String idCliente;
	
	@Column(name = "nombre_compania")
	private String nombreCompania;
	
	@Column(name = "nombre_contacto")
	private String nombreContacto;
	
	@Column(name = "titulo_contacto")
	private String tituloContacto;
	
	private String direccion;
	private String ciudad;
	private String region;
	
	@Column(name = "codigo_postal")
	private String codigoPostal;
	
	private String pais;
	private String telefono;
	private String mail;
	private String clave;
	
}
