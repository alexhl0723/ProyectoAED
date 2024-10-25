package clases;

public class Factura {
	
	// ATRIBUTOS PRIVADOS
	
	private int codigoFactura, codigoVenta, codigoCliente;
	private String fechaEmision;
    private double total;
    
	// CONSTRUCTOR
    
    public Factura(int codigoFactura,int codigoVenta,int codigoCliente,String fechaEmision,double total){
    	this.codigoFactura=codigoFactura;
    	this.codigoVenta=codigoVenta;
    	this.codigoCliente=codigoCliente;
    	this.fechaEmision=fechaEmision;
    	this.total=total;
    }
    
	// METODO GET Y SET
    
    
	// -- CODIGO FACTURA -- 
    
	public int getCodigoFactura() {
		return codigoFactura;
	}
	
	public void setCodigoFactura(int codigoFactura) {
		this.codigoFactura = codigoFactura;
	}
	
	// -- CODIGO VENTA -- 
	
	public int getCodigoVenta() {
		return codigoVenta;
	}
	
	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}
	
	// -- CODIGO CLIENTE -- 
	
	public int getCodigoCliente() {
		return codigoCliente;
	}
	
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	// -- FECHA EMISION -- 
	
	public String getFechaEmision() {
		return fechaEmision;
	}
	
	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	
	// -- TOTAL -- 
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
}