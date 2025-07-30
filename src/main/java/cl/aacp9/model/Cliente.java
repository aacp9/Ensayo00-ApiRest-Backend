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

	//constructor vacio
	public Cliente() {
		super();
	}

		
	//Getter y Setter
	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getTituloContacto() {
		return tituloContacto;
	}

	public void setTituloContacto(String tituloContacto) {
		this.tituloContacto = tituloContacto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	
	
	
}
