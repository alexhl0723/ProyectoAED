package clases;

public class Cliente {
	
	// ATRIBUTOS PRIVADOS
	
	private int codigoCliente;
	private String nombres;
	private String apellidos;
	private String direccion;
	private String telefono;
	private String dni;
	
	// CONSTRUCTOR
	
	public Cliente(int codigoCliente,String nombres,String apellidos,String direccion,String telefono,String dni){
		this.codigoCliente=codigoCliente;
		this.nombres=nombres;
		this.apellidos=apellidos;
		this.direccion=direccion;
		this.telefono=telefono;
		this.dni=dni;
		
	}
	
	// METODO GET Y SET
	
	// -- CODIGO CLIENTE -- 
	
	public int getCodigoCliente() {
		return codigoCliente;
	}
	
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	// -- NOMBRE --
	
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	
	// -- APELLIDOS --
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	// -- DIRECCION --

	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	// -- TELEFONO --
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	// -- DNI --
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}