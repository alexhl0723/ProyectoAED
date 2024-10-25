package clases;

//corregido faltan los demas lo hago?

public class Inventario {
	
	// ATRIBUTOS PRIVADOS
	
	private int codigoProducto,stockActual, stockMinimo, stockMaximo;
	private String tipo_producto;
	
	
	// CONSTRUCTOR
	
	
	public Inventario(int codigoProducto,int stockActual,int stockMinimo,int stockMaximo,String tipo_producto){
		this.codigoProducto=codigoProducto;
		this.stockActual=stockActual;
		this.stockMaximo=stockMaximo;
		this.stockMaximo=stockMaximo;
		this.tipo_producto=tipo_producto;
	}
	
	
	// METODO GET Y SET
	
	
	// -- CODIGO PRODUCTO --
	
	public int getCodigoProducto() {
		return codigoProducto;
	}
	
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	
	// -- STOCK ACTUAL -- 
	
	public int getStockActual() {
		return stockActual;
	}
	
	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}
	
	// -- STOCK MINIMO -- 
	
	public int getStockMinimo() {
		return stockMinimo;
	}
	
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	
	// -- STOCK MAXIMO -- 
	
	public int getStockMaximo() {
		return stockMaximo;
	}
	
	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}
	
	// -- TIPO PRODUCTO -- 
	
	public String getTipo_producto() {
		return tipo_producto;
	}
	
	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}
	
	
}