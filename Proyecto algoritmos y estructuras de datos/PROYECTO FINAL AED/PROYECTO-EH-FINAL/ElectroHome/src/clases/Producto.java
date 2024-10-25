package clases;

public class Producto {
	
	// ATRIBUTOS PRIVADOS
	
	private int codigoProducto;
	private String nombre;
	private int stockActual, stockMinimo, stockMaximo;
	private double precio;

	// CONSTRUCTOR
	
	public Producto(int codigoProducto,String nombre, int stockActual, int stockMinimo, int stockMaximo,
		double precio) {
		this.codigoProducto = codigoProducto;
		this.nombre=nombre;
		this.stockActual = stockActual;
		this.stockMinimo = stockMinimo;
		this.stockMaximo = stockMaximo;
		this.precio=precio;
		
	}

	// METODOS GETS
	
	public int getCodigoProducto() {
		return codigoProducto;
	}

	public int getStockActual() {
		return stockActual;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public int getStockMaximo() {
		return stockMaximo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	// METODOS SETS
	
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}