package guis;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Window;

import arreglos.ArregloVentas;
import arreglos.ArregloClientes;
import clases.Cliente;
import clases.Producto;
import arreglos.ArregloProductos;
import clases.Venta;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

public class DialogGenerarReportes extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodCliente;
	private JButton btnCerrar;
	private JButton btnBuscar;
	private JButton btnTodosLosReportes;
    private JButton btnUnidadAcumuladaPor;
    private JButton btnStockPorDebajo;
    private JButton btnImptotalAcumuladoPor;	
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogGenerarReportes dialog = new DialogGenerarReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogGenerarReportes() {
		setBounds(100, 100, 1073, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(240, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCodigoDeCliente = new JLabel("Codigo de cliente:\r\n");
		lblCodigoDeCliente.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblCodigoDeCliente.setBounds(28, 88, 114, 16);
		contentPanel.add(lblCodigoDeCliente);
		
		txtCodCliente = new JTextField();
		txtCodCliente.setBounds(152, 86, 158, 22);
		contentPanel.add(txtCodCliente);
		txtCodCliente.setColumns(10);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(this);
		btnBuscar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnBuscar.setBackground(new Color(0, 153, 204));
		btnBuscar.setBorder(null);
		btnBuscar.setFocusPainted(false);
		btnBuscar.setBounds(320, 84, 97, 25);
		contentPanel.add(btnBuscar);
		
		btnTodosLosReportes = new JButton("TODOS LOS RESPORTES");
		btnTodosLosReportes.addActionListener(this);
		btnTodosLosReportes.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnTodosLosReportes.setBackground(new Color(0, 153, 204));
		btnTodosLosReportes.setBorder(null);
		btnTodosLosReportes.setFocusPainted(false);
		btnTodosLosReportes.setBounds(427, 84, 139, 25);
		contentPanel.add(btnTodosLosReportes);
		
		JScrollPane scpPane = new JScrollPane();
		scpPane.setBounds(12, 139, 1035, 311);
		contentPanel.add(scpPane);
		
		txtS = new JTextArea();
		scpPane.setViewportView(txtS);
		
		btnCerrar = new JButton("X");
		btnCerrar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnCerrar.setBackground(new Color(0, 153, 204));
		btnCerrar.setBorder(null);
		btnCerrar.setFocusPainted(false);
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(707, 11, 97, 25);
		contentPanel.add(btnCerrar);
		
		JLabel lblNewLabel = new JLabel("REPORTES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblNewLabel.setBounds(310, 11, 194, 47);
		contentPanel.add(lblNewLabel);
		
		btnUnidadAcumuladaPor = new JButton("unidad acumulada por producto");
		btnUnidadAcumuladaPor.addActionListener(this);
		btnUnidadAcumuladaPor.setBounds(732, 86, 139, 23);
		contentPanel.add(btnUnidadAcumuladaPor);
		
		btnStockPorDebajo = new JButton("Stock por debajo del minimo");
		btnStockPorDebajo.addActionListener(this);
		btnStockPorDebajo.setBounds(614, 88, 89, 23);
		contentPanel.add(btnStockPorDebajo);
		
		btnImptotalAcumuladoPor = new JButton("ImpTotal acumulado por producto");
		btnImptotalAcumuladoPor.addActionListener(this);
		btnImptotalAcumuladoPor.setBounds(892, 86, 132, 23);
		contentPanel.add(btnImptotalAcumuladoPor);
		
        // CAMBIAR ICONO DE VENTANA
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/imgs/logosinfondonegro.png"));
        Image scaledIcon = icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        setIconImage(scaledIcon);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnImptotalAcumuladoPor) {
			do_btnImptotalAcumuladoPor_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnStockPorDebajo) {
			do_btnStockPorDebajo_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnUnidadAcumuladaPor) {
			do_btnUnidadAcumuladaPor_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnTodosLosReportes) {
			do_btnTodosLosReportes_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(arg0);
		}
	}
	protected void do_btnCerrar_actionPerformed(ActionEvent arg0) {
		this.dispose();
	}
	private String obtenerFechaActual() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(new Date());
    }
    
    void mensaje(String s) {
        JOptionPane.showMessageDialog(this, s);
    }
    
    void imprimir(String s) {
        txtS.append(s + "\n");
    }
    //
    	//varibles globales
    ArregloVentas aVentas = new ArregloVentas();
    ArregloClientes aClientes = new ArregloClientes();
    ArregloProductos aProducto = new ArregloProductos();
    
    
	protected void do_btnBuscar_actionPerformed(ActionEvent arg0) {
		try {
            int codigoCliente = Integer.parseInt(txtCodCliente.getText().trim());
            Cliente cliente = aClientes.buscar(codigoCliente);
            
            if (cliente == null) {
                mensaje("Cliente no encontrado");
                return;
            }
            
            // Limpiar el área de texto
            txtS.setText("");
            
            // Cabecera del reporte
            imprimir("=================================================");
            imprimir("             REPORTE DE VENTAS POR CLIENTE        ");
            imprimir("=================================================");
            imprimir("Cliente: " + cliente.getNombres() + " " + cliente.getApellidos());
            imprimir("Código: " + cliente.getCodigoCliente());
            imprimir("-------------------------------------------------");
            
            boolean encontroVentas = false;
            double totalCompras = 0.0;
            
            // Buscar todas las ventas del cliente
            for (int i = 0; i < aVentas.tamaño(); i++) {
                Venta v = aVentas.obtener(i);
                if (v.getCodigoCliente() == codigoCliente) {
                    encontroVentas = true;
                    imprimir("\nVenta #" + v.getCodigoVenta());
                    imprimir("Fecha: " + v.getFecha());
                    imprimir("Producto: " + v.getNombreProducto());
                    imprimir("Cantidad: " + v.getCantidad());
                    imprimir("Precio unitario: S/." + String.format("%.2f", v.getPrecio()));
                    imprimir("Subtotal: S/." + String.format("%.2f", v.getPrecioSubTotal()));
                    imprimir("IGV: S/." + String.format("%.2f", v.getPrecioIGV()));
                    imprimir("Total: S/." + String.format("%.2f", v.getPrecioTotal()));
                    imprimir("-------------------------------------------------");
                    
                    totalCompras += v.getPrecioTotal();
                }
            }
            
            if (!encontroVentas) {
                imprimir("\nNo se encontraron ventas para este cliente");
            } else {
                imprimir("\nTotal de compras realizadas: S/." + String.format("%.2f", totalCompras));
            }
            
            imprimir("=================================================");
            
        } catch (NumberFormatException e) {
            mensaje("Por favor ingrese un código de cliente válido");
        
    }
		
	}
	
	protected void do_btnTodosLosReportes_actionPerformed(ActionEvent arg0) {
		try{
			txtS.setText("");
        
        // Cabecera del reporte general
        imprimir("=================================================");
        imprimir("             REPORTE GENERAL DE VENTAS            ");
        imprimir("=================================================");
        imprimir("Fecha de generación: " + obtenerFechaActual());
        imprimir("-------------------------------------------------");
        
        if (aVentas.tamaño() == 0) {
            imprimir("\nNo hay ventas registradas en el sistema");
            return;
        }
        
        double totalVentas = 0.0;
        int totalProductosVendidos = 0;
        
        // Generar resumen por cliente
        for (int i = 0; i < aClientes.tamaño(); i++) {
            Cliente cliente = aClientes.obtener(i);
            double totalClienteCompras = 0.0;
            int productosComprados = 0;
            
            // Buscar ventas del cliente
            for (int j = 0; j < aVentas.tamaño(); j++) {
                Venta v = aVentas.obtener(j);
                if (v.getCodigoCliente() == cliente.getCodigoCliente()) {
                    totalClienteCompras += v.getPrecioTotal();
                    productosComprados += v.getCantidad();
                }
            }
            
            if (totalClienteCompras > 0) {
                imprimir("\nCliente: " + cliente.getNombres() + " " + cliente.getApellidos());
                imprimir("Código: " + cliente.getCodigoCliente());
                imprimir("Total comprado: S/." + String.format("%.2f", totalClienteCompras));
                imprimir("Productos adquiridos: " + productosComprados);
                imprimir("-------------------------------------------------");
                
                totalVentas += totalClienteCompras;
                totalProductosVendidos += productosComprados;
            }
        }
        
        
        // Estadísticas generales
        imprimir("\nESTADÍSTICAS GENERALES");
        imprimir("-------------------------------------------------");
        imprimir("Total ventas realizadas: " + aVentas.tamaño());
        imprimir("Total productos vendidos: " + totalProductosVendidos);
        imprimir("Monto total de ventas: S/." + String.format("%.2f", totalVentas));
        imprimir("Promedio de venta: S/." + String.format("%.2f", totalVentas / aVentas.tamaño()));
        imprimir("=================================================");
    }
		catch(Exception e){
        	mensaje(" no se mostro los reporte ");
        }
	}
	protected void do_btnUnidadAcumuladaPor_actionPerformed(ActionEvent arg0) {
		txtS.setText("");
	    
	    imprimir("=================================================");
	    imprimir("        PRODUCTOS POR UNIDADES VENDIDAS           ");
	    imprimir("=================================================");
	    imprimir(String.format("%-8s %-20s %-15s",
	            "Código", "Nombre", "Unid. Vendidas"));
	    imprimir("-------------------------------------------------");
	    
	    // Crear mapa para acumular ventas por producto
	    Map<Integer, Integer> ventasPorProducto = new HashMap<>();
	    Map<Integer, String> nombresPorProducto = new HashMap<>();
	    
	    // Acumular ventas
	    for (int i = 0; i < aVentas.tamaño(); i++) {
	        Venta v = aVentas.obtener(i);
	        int codProd = v.getCodigoProducto();
	        ventasPorProducto.put(codProd, 
	            ventasPorProducto.getOrDefault(codProd, 0) + v.getCantidad());
	        nombresPorProducto.put(codProd, v.getNombreProducto());
	    }
	    
	    // Mostrar resultados
	    for (Map.Entry<Integer, Integer> entry : ventasPorProducto.entrySet()) {
	        imprimir(String.format("%-8d %-20s %-15d",
	                entry.getKey(),
	                nombresPorProducto.get(entry.getKey()),
	                entry.getValue()));
	    }
	    imprimir("=================================================");
	}
	
	protected void do_btnStockPorDebajo_actionPerformed(ActionEvent arg0) {
		try{
		txtS.setText("");
	    
	    imprimir("=================================================");
	    imprimir("        PRODUCTOS CON STOCK BAJO MÍNIMO           ");
	    imprimir("=================================================");
	    imprimir(String.format("%-8s %-20s %-12s %-12s",
	            "Código", "Nombre", "Stock Act.", "Stock Mín."));
	    imprimir("-------------------------------------------------");
	    
	    boolean hayProductosBajos = false;
	    
	    for (int i = 0; i < aVentas.tamaño(); i++) {
	        Producto p = aProducto.obtener(i);
	        if (p.getStockActual() < p.getStockMinimo()) {
	            hayProductosBajos = true;
	            imprimir(String.format("%-8d %-20s %-12d %-12d",
	                    p.getCodigoProducto(),
	                    p.getNombre(),
	                    p.getStockActual(),
	                    p.getStockMinimo()));
	        }
	    }
	    
	    if (!hayProductosBajos) {
	        imprimir("\nNo hay productos con stock por debajo del mínimo");
	    }
	    imprimir("================================================="); 
	    }catch(Exception e){
	    	mensaje("no se encontro el stock");
	    }
	}
	
	
	
	
	
	
	protected void do_btnImptotalAcumuladoPor_actionPerformed(ActionEvent arg0) {
		try{
		txtS.setText("");
	    
	    imprimir("=================================================");
	    imprimir("      PRODUCTOS POR IMPORTE TOTAL ACUMULADO       ");
	    imprimir("=================================================");
	    imprimir(String.format("%-8s %-20s %-15s",
	            "Código", "Nombre", "Importe Total"));
	    imprimir("-------------------------------------------------");
	    
	    // Crear mapa para acumular importes por producto
	    Map<Integer, Double> importePorProducto = new HashMap<>();
	    Map<Integer, String> nombresPorProducto = new HashMap<>();
	    
	    // Acumular importes
	    for (int i = 0; i < aVentas.tamaño(); i++) {
	        Venta v = aVentas.obtener(i);
	        int codProd = v.getCodigoProducto();
	        importePorProducto.put(codProd, 
	            importePorProducto.getOrDefault(codProd, 0.0) + v.getPrecioTotal());
	        nombresPorProducto.put(codProd, v.getNombreProducto());
	    }
	    
	    // Mostrar resultados
	    for (Map.Entry<Integer, Double> entry : importePorProducto.entrySet()) {
	        imprimir(String.format("%-8d %-20s S/.%-12.2f",
	                entry.getKey(),
	                nombresPorProducto.get(entry.getKey()),
	                entry.getValue()));
	    }
	    imprimir("=================================================");
	

	}catch(Exception e){
		mensaje("no se encontro");
	}
}
}
