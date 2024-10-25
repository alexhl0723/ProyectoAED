package arreglos;
import java.io.*;
import java.util.ArrayList;
import clases.Venta;

public class ArregloVentas {
    private ArrayList<Venta> venta;
    private ArrayList<Venta> ventaTemporal;
    
    public ArregloVentas() {
        venta = new ArrayList<Venta>();
        ventaTemporal = new ArrayList<Venta>();
        cargarVenta();
    }
    
    public void adicionarTemporal(Venta v) {
        ventaTemporal.add(v);
    }
    
    public void confirmarVenta() {
        for(Venta v : ventaTemporal) {
            venta.add(v);
        }
        grabarVenta();
        ventaTemporal.clear();
    }
    
    public void cancelarVentaTemporal() {
        ventaTemporal.clear();
    }
    
    public int tamañoTemporal() {
        return ventaTemporal.size();
    }
    
    public Venta obtenerTemporal(int i) {
        return ventaTemporal.get(i);
    }
    
    public int tamaño() {
        return venta.size();
    }
    
    public Venta obtener(int i) {
        return venta.get(i);
    }
    
    private void grabarVenta() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("src/archivos_txt/ventas.txt", true));
            for(int i = venta.size() - ventaTemporal.size(); i < venta.size(); i++) {
                Venta v = venta.get(i);
                String linea = v.getCodigoVenta() + " | " +
                        v.getCodigoCliente() + " | " +
                        v.getCodigoProducto() + " | " +
                        v.getCantidad() + " | " +
                        v.getPrecio() + " | " +
                        v.getPrecioSubTotal() + " | " +
                        v.getPrecioIGV() + " | " +
                        v.getPrecioTotal() + " | " +
                        v.getFecha() + " | " +
                        v.getNombreProducto() + "\n" +
                        "-----------------------------------------------------------------------------------------------";
                pw.println(linea);
            }
            pw.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void cargarVenta() {
        try {
            File archivo = new File("src/archivos_txt/ventas.txt");
            if (!archivo.exists()) {
                archivo.createNewFile();
                return;
            }
            
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("---")) continue;
                
                String[] a = linea.split(" \\| ");
                if (a.length >= 10) {
                    int codigoVenta = Integer.parseInt(a[0].trim());
                    int codigoCliente = Integer.parseInt(a[1].trim());
                    int codigoProducto = Integer.parseInt(a[2].trim());
                    int cantidad = Integer.parseInt(a[3].trim());
                    double precio = Double.parseDouble(a[4].trim());
                    double precioSubTotal = Double.parseDouble(a[5].trim());
                    double precioIGV = Double.parseDouble(a[6].trim());
                    double PrecioTotal = Double.parseDouble(a[7].trim());
                    String fecha = a[8].trim();
                    String nombreProducto = a[9].trim();
                    
                    venta.add(new Venta(codigoVenta, codigoCliente, codigoProducto, 
                                      cantidad, precio, precioSubTotal, precioIGV, 
                                      PrecioTotal, fecha, nombreProducto));
                }
            }
            br.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public int codigoCorrelativoV() {
        if(tamaño() == 0)
            return 9512;
        else
            return obtener(tamaño()-1).getCodigoProducto() + 1;
    }
}