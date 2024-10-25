	package clases;
	
	public class Venta {
		
		// ATRIBUTOS PRIVADOS
		
		private int codigoVenta, codigoCliente, codigoProducto, cantidad;
		private double precio,precioSubTotal,precioIGV,precioTotal;
		private String fecha,nombreProducto;
		

		// CONSTRUCTOR
		
		public Venta(int codigoVenta,int codigoCliente,int codigoProducto,int cantidad,double precio,double precioSubTotal,
				double precioIGV,double precioTotal,String fecha,String nombreProducto){
			this.codigoVenta=codigoVenta;
			this.codigoCliente=codigoCliente;
			this.codigoProducto=codigoProducto;
			this.cantidad=cantidad;
			this.precio=precio;
			this.precioSubTotal=precioSubTotal;
			this.precioIGV=precioIGV;
			this.precioTotal=precioTotal;
			this.fecha=fecha;
			this.nombreProducto=nombreProducto;
			
		}
		
		// METODO GET Y SET
		
		
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
		
		// -- CODIGO PRODUCTO -- 
		
		public int getCodigoProducto() {
			return codigoProducto;
		}
		
		public void setCodigoProducto(int codigoProducto) {
			this.codigoProducto = codigoProducto;
		}
		
		// -- CANTIDAD -- 
		
		public int getCantidad() {
			return cantidad;
		}
		
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		
		// -- PRECIO UNITARIO -- 
		
		public double getPrecio() {
			return precio;
		}
		
		public void setPrecio(double precio) {
			this.precio = precio;
		}

		//
		
		public double impSubTotal(){
			return precio*cantidad;
		}
		
		//
		
		public double getPrecioSubTotal() {
			return precioSubTotal;
		}
		
		public void setPrecioSubTotal(double precioSubTotal) {
			this.precioSubTotal = precioSubTotal;
		}
		
		//
		
		public double getPrecioIGV() {
			return precioIGV;
		}
		
		public void setPrecioIGV(double precioIGV) {
			this.precioIGV = precioIGV;
		}
		
		//
		public String getNombreProducto() {
			return nombreProducto;
		}
		
		public void setNombreProducto(String nombreProducto) {
			this.nombreProducto = nombreProducto;
		}
		
		//
		
		public double getPrecioTotal() {
			return precioTotal;
		}
		
		public void setPrecioTotal(double precioTotal) {
			this.precioTotal = precioTotal;
		}
		
		
		//
		
		public String getFecha() {
			return fecha;
		}
		
		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
		
		
		
		
	
	}
