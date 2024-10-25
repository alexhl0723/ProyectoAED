package arreglos;
import clases.Cliente;

import java.io.*;
import java.util.ArrayList;

public class ArregloClientes {
	
	
	//  ATRIBUTOS PRIVADOS
	
	private ArrayList <Cliente> cl;
	
	
	// CONSTRUCTOR
	
	
    public ArregloClientes() {
    	cl = new ArrayList <Cliente> ();
    	cargarCliente();
    }
    
	// OPERACIONES PUBLICAS BASICAS
    
	public void adicionar(Cliente clie) {
		cl.add(clie);
		grabarCliente();
		actuArchivo();
		
	}
	
	public int tamaño() {
		return cl.size();
	}
	public Cliente obtener(int i) {
		return cl.get(i);
	}
	public void eliminar(Cliente cliente){
		cl.remove(cliente);
		grabarCliente();
	}
    public Cliente buscar(int codigoCliente){
    	Cliente clie;
    	for(int i=0;i<tamaño();i++){
    		clie=obtener(i);
    		if(clie.getCodigoCliente()==codigoCliente){
    			return clie;
    		}
    	}
    	return null;
    }
    public void actuArchivo(){
    	grabarCliente();
    }
    
    // 
    
    
    public void grabarCliente(){
    	try{
    		PrintWriter pw;
    		String linea;
    		pw=new PrintWriter(new FileWriter("src/archivos_txt/cliente.txt"));
    			for(int i=0;i<tamaño();i++){
    				Cliente clie=obtener(i);
    				
    				//
    				
    				linea=clie.getCodigoCliente()+" | "+
    						clie.getNombres()+" | "+
    						clie.getApellidos()+" | "+
    						clie.getDireccion()+" | "+
    						clie.getTelefono()+" | "+
    						clie.getDni();
    				pw.println(linea);
    			}
    			pw.close();
    		
    		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
    public void cargarCliente(){
    	try {BufferedReader br;
    	String linea;
    	String[] cliente;
    		br=new BufferedReader(new FileReader("src/archivos_txt/cliente.txt"));
    		while((linea=br.readLine())!=null){
    			cliente=linea.split("\\|");
    			int cod= Integer.parseInt(cliente[0].trim());
    			String nombre=cliente[1].trim();
    			String apellido=cliente[2].trim();
    			String direccion=cliente[3].trim();
    			String telefono=cliente[4].trim();
    			String dni=cliente[5].trim();
    			cl.add(new Cliente( cod,nombre,apellido, direccion, telefono, dni));
    		}
    		br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    
    public int codigoCorrelativo(){
        if(tamaño() == 0)
            return 1001;
        else
                return obtener(tamaño()-1).getCodigoCliente()+1;
    }
}

