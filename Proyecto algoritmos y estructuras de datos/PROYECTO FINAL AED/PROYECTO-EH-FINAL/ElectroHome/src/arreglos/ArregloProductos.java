package arreglos;

import java.io.*;

//obligatorio
import java.util.ArrayList;
import clases.Producto;
//

public class ArregloProductos {
	
	// ARRAY LIST PRIVADA
	
    private ArrayList<Producto> prod;

    //
    
    public ArregloProductos() {
        prod = new ArrayList<Producto>();
        cargarProductos();
    }

    // OPERACIONES BASICAS
    
    public void adicionar(Producto p) {
        prod.add(p);
        grabarProductos();
        actualizarArchivo();
        
    }

    //
    
    public int tamaño() {
        return prod.size();
    }

    //
    
    public Producto obtener(int i) {
        return prod.get(i);
    }

    // METODO BUSCAR PERSONA
    
    public Producto buscar(int codigo) {
        Producto p;
        for (int i = 0; i < tamaño(); i++) {
            p = obtener(i);
            if (p.getCodigoProducto() == codigo)
                return p;
        }
        return null;
    }	

    // METODO ELIMINAR UN PRODUCTO
    
    public void eliminarProducto(Producto p) {
        prod.remove(p);
        grabarProductos();
    }
    
    //
    
    public void actualizarArchivo(){
    	grabarProductos();
    }
    
    //
    
    public void grabarProductos(){
        try{
            PrintWriter pw;
            Producto p;
            String linea;
            pw = new PrintWriter(new FileWriter("src/archivos_txt/productos.txt"));
            for(int  i=0;i<tamaño();i++){
                p= obtener(i);
                linea = p.getCodigoProducto() + " | "+
                             p.getNombre()+" | "+
                             p.getPrecio()+" | "+
                             p.getStockActual()+" | "+
                             p.getStockMinimo()+" | "+
                             p.getStockMaximo();
                pw.println(linea);
            }
            pw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void cargarProductos(){
        try{
            BufferedReader br;
            String linea,nombre;
            String[] a;
            int codigoProducto,stockActual,stockMinimo,stockMaximo;
            double precio;
            br = new BufferedReader(new FileReader("src/archivos_txt/productos.txt"));
            while ((  linea = br.readLine() ) !=null ){
                a = linea.split(" \\| "); 
                codigoProducto = Integer.parseInt(a[0].trim());
                nombre = a[1].trim();
                precio = Double.parseDouble(a[2].trim());
                stockActual = Integer.parseInt(a[3].trim());
                stockMinimo = Integer.parseInt(a[4].trim());
                stockMaximo = Integer.parseInt(a[5].trim());
                prod.add (new Producto(codigoProducto, nombre, stockActual, stockMinimo, stockMaximo, precio));
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    // CODIGO CRRELATIVO
    
    public int codigoCorrelativo(){
    	if(tamaño() == 0)
    		return 2001;
    	else
    			return obtener(tamaño()-1).getCodigoProducto()+1;
    }
    public void actualizarStock(int codigoProducto, int cantidad) {
        Producto p = buscar(codigoProducto);
        if (p != null) {
            p.setStockActual(p.getStockActual() - cantidad);
            grabarProductos();
        }
    }
    
}
