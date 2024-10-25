package guis;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import arreglos.ArregloProductos;
import clases.Producto;
import clases.Venta;
import clases.Cliente;
import arreglos.ArregloClientes;
import javax.swing.JTable;
import clases.Venta;
import arreglos.ArregloVentas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;

public class DialogVentas extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodClie;
	private JTextField txtNomApe;
	private JButton btnCerrar;
	private JButton btnBuscar;
	private JTextField txtCodigoProducto;
	private JTextField txtNomProd;
	private JTextField txtPrecio;
	private JTextField txtImpTotal;
	private JComboBox cboBox;
	private JTextField txtSubTotal;
	private JTextField txtIGV;
	private JButton btnBuscarProducto;
	private JTextArea txtS;
	private JButton btnVender;
	private JLabel lblTipoDeFactura;
	private JLabel lblFormaDePago;
	private JComboBox cboGarantia;
	private JComboBox cboFactura;
	private JScrollPane scrollPane;
	private JTable Ventas;
	private JComboBox cboFormaPago;
	private double precioBasesinGarantia;
	private DefaultTableModel ventas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogVentas dialog = new DialogVentas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogVentas() {
		setBounds(100, 100, 1444, 582);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(240, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCodigoDelCliente = new JLabel("Codigo del cliente:");
		lblCodigoDelCliente.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblCodigoDelCliente.setBounds(22, 63, 109, 16);
		contentPanel.add(lblCodigoDelCliente);
		
		btnBuscar = new JButton("BUSCAR CLIENTE");
		btnBuscar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnBuscar.setBackground(new Color(0, 153, 204));
		btnBuscar.setBorder(null);
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(267, 59, 125, 25);
		contentPanel.add(btnBuscar);
		
		txtCodClie = new JTextField();
		txtCodClie.setBounds(155, 61, 102, 22);
		contentPanel.add(txtCodClie);
		txtCodClie.setColumns(10);
		
		JLabel lblNombreYApellidos = new JLabel("Nombre y apellidos:");
		lblNombreYApellidos.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNombreYApellidos.setBounds(22, 94, 109, 16);
		contentPanel.add(lblNombreYApellidos);
		
		txtNomApe = new JTextField();
		txtNomApe.setEditable(false);
		txtNomApe.setBounds(155, 92, 237, 22);
		contentPanel.add(txtNomApe);
		txtNomApe.setColumns(10);
		
		btnCerrar = new JButton("X");
		btnCerrar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnCerrar.setBackground(new Color(0, 153, 204));
		btnCerrar.setBorder(null);
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(1029, 25, 97, 25);
		contentPanel.add(btnCerrar);
		
		JScrollPane scpPane = new JScrollPane();
		scpPane.setBounds(1158, 11, 260, 523);
		contentPanel.add(scpPane);
		
		txtS = new JTextArea();
		scpPane.setViewportView(txtS);
		
		JLabel lblCodigoDelProducto = new JLabel("Codigo del Producto:");
		lblCodigoDelProducto.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblCodigoDelProducto.setBounds(22, 140, 119, 16);
		contentPanel.add(lblCodigoDelProducto);
		
		txtCodigoProducto = new JTextField();
		txtCodigoProducto.setBounds(155, 138, 102, 22);
		contentPanel.add(txtCodigoProducto);
		txtCodigoProducto.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre del producto:");
		lblNombre.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNombre.setBounds(22, 172, 132, 16);
		contentPanel.add(lblNombre);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblPrecio.setBounds(22, 198, 56, 16);
		contentPanel.add(lblPrecio);
		
		txtNomProd = new JTextField();
		txtNomProd.setEditable(false);
		txtNomProd.setBounds(154, 167, 238, 22);
		contentPanel.add(txtNomProd);
		txtNomProd.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(155, 196, 102, 22);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblCantidad.setBounds(499, 141, 56, 16);
		contentPanel.add(lblCantidad);
		
		cboBox = new JComboBox();
		cboBox.setBackground(new Color(204, 255, 255));
		cboBox.addActionListener(this);
		cboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cboBox.setBounds(567, 138, 125, 22);
		contentPanel.add(cboBox);
		
		JLabel lblSubtotal = new JLabel("SubTotal:");
		lblSubtotal.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblSubtotal.setBounds(499, 170, 56, 16);
		contentPanel.add(lblSubtotal);
		
		JLabel lblIgv = new JLabel("IGV:");
		lblIgv.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblIgv.setBounds(499, 199, 56, 16);
		contentPanel.add(lblIgv);
		
		JLabel lblPrecioTotalA = new JLabel("Precio total a pagar");
		lblPrecioTotalA.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblPrecioTotalA.setBounds(22, 243, 125, 16);
		contentPanel.add(lblPrecioTotalA);
		
		txtImpTotal = new JTextField();
		txtImpTotal.setEditable(false);
		txtImpTotal.setBounds(155, 241, 136, 22);
		contentPanel.add(txtImpTotal);
		txtImpTotal.setColumns(10);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setEditable(false);
		txtSubTotal.setBounds(567, 167, 125, 22);
		contentPanel.add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		txtIGV = new JTextField();
		txtIGV.setEditable(false);
		txtIGV.setBounds(567, 196, 125, 22);
		contentPanel.add(txtIGV);
		txtIGV.setColumns(10);
		
		btnBuscarProducto = new JButton("BUSCAR PRODUCTO");
		btnBuscarProducto.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnBuscarProducto.setBackground(new Color(0, 153, 204));
		btnBuscarProducto.setBorder(null);
		btnBuscarProducto.addActionListener(this);
		btnBuscarProducto.setBounds(267, 137, 125, 25);
		contentPanel.add(btnBuscarProducto);
		
		btnVender = new JButton("VENDER");
		btnVender.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnVender.setBackground(new Color(0, 153, 204));
		btnVender.setBorder(null);
		btnVender.addActionListener(this);
		btnVender.setBounds(996, 240, 150, 25);
		contentPanel.add(btnVender);
		
		JLabel lblGarantia = new JLabel("Garantia:");
		lblGarantia.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblGarantia.setBounds(813, 143, 56, 16);
		contentPanel.add(lblGarantia);
		
		lblTipoDeFactura = new JLabel("Tipo de factura:");
		lblTipoDeFactura.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblTipoDeFactura.setBounds(813, 172, 87, 16);
		contentPanel.add(lblTipoDeFactura);
		
		lblFormaDePago = new JLabel("Forma de pago:");
		lblFormaDePago.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblFormaDePago.setBounds(813, 201, 87, 16);
		contentPanel.add(lblFormaDePago);
		
		cboGarantia = new JComboBox();
		cboGarantia.setBackground(new Color(204, 255, 255));
		cboGarantia.addActionListener(this);
		cboGarantia.setModel(new DefaultComboBoxModel(new String[] {"1 a\u00F1o", "2 a\u00F1os /  15%", "3 a\u00F1os /  22%"}));
		cboGarantia.setBounds(912, 140, 153, 22);
		contentPanel.add(cboGarantia);
		
		cboFactura = new JComboBox();
		cboFactura.setBackground(new Color(204, 255, 255));
		cboFactura.setModel(new DefaultComboBoxModel(new String[] {"Factura electr\u00F3nica", "Boleta elect\u00F3nica"}));
		cboFactura.setBounds(912, 169, 152, 22);
		contentPanel.add(cboFactura);
		
		cboFormaPago = new JComboBox();
		cboFormaPago.setBackground(new Color(204, 255, 255));
		cboFormaPago.setModel(new DefaultComboBoxModel(new String[] {"Efectivo", "Tarjeta"}));
		cboFormaPago.setBounds(912, 198, 152, 22);
		contentPanel.add(cboFormaPago);
		
        // CAMBIAR ICONO DE VENTANA
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/imgs/logosinfondonegro.png"));
        Image scaledIcon = icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        setIconImage(scaledIcon);
	    
	    scrollPane = new JScrollPane();
	    scrollPane.setBounds(12, 293, 1139, 241);
	    contentPanel.add(scrollPane);
	    
	    Ventas = new JTable();
	    scrollPane.setViewportView(Ventas);
	    
	    btnAgregarProductos = new JButton("AGREGAR PRODUCTO");
	    btnAgregarProductos.setFont(new Font("Segoe UI", Font.BOLD, 11));
	    btnAgregarProductos.setBackground(new Color(0, 153, 204));
	    btnAgregarProductos.setBorder(null);
	    btnAgregarProductos.addActionListener(this);
	    btnAgregarProductos.setBounds(543, 239, 144, 25);
	    contentPanel.add(btnAgregarProductos);
		
	    ventas = new DefaultTableModel();
	    ventas.addColumn("Codigo de Venta");
	    ventas.addColumn("Codigo de Cliente");
	    ventas.addColumn("Codigo de producto");
	    ventas.addColumn("Cantidad");
	    ventas.addColumn("Precio");
	    ventas.addColumn("subTotal");
	    ventas.addColumn("IGV");
	    ventas.addColumn("Total a pagar");
	    ventas.addColumn("Nombre del producto");
	    ventas.addColumn("Fecha");
	    
	    
	    Ventas.setModel(ventas);
	    
	    lblSistemaDeVentas = new JLabel("SISTEMA DE VENTAS");
	    lblSistemaDeVentas.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
	    lblSistemaDeVentas.setBounds(416, 9, 357, 42);
	    contentPanel.add(lblSistemaDeVentas);
	    
	    btnCancelar = new JButton("Cancelar");
	    btnCancelar.addActionListener(this);
	    btnCancelar.setBounds(741, 239, 97, 25);
	    contentPanel.add(btnCancelar);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			do_btnCancelar_actionPerformed(e);
		}
		if (e.getSource() == btnAgregarProductos) {
			do_btnAgregarProductos_actionPerformed(e);
		}
		if (e.getSource() == cboGarantia) {
			do_cboGarantia_actionPerformed(e);
		}
		if (e.getSource() == btnVender) {
			do_btnVender_actionPerformed(e);
		}
		if (e.getSource() == cboBox) {
			do_cboBox_actionPerformed(e);
		}
		if (e.getSource() == btnBuscarProducto) {
			do_btnBuscarProducto_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(e);
		}
	}
	
	// VARIABLE GLOBAL  
	
	ArregloProductos aVentas = new ArregloProductos();
	ArregloVentas aVentas3 = new ArregloVentas();
	ArregloClientes aVentas2 = new ArregloClientes();
	private JButton btnAgregarProductos;
	private JLabel lblSistemaDeVentas;
	private JButton btnCancelar;
	 
	
	protected void do_btnCerrar_actionPerformed(ActionEvent e) {
		this.dispose();
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		try{
	    int codigoCliente = leerCodigoCliente();
	    Cliente clie = aVentas2.buscar(codigoCliente); 
	    if (clie != null) {
	        txtCodClie.setText(String.valueOf(clie.getCodigoCliente()));
	        txtNomApe.setText(clie.getNombres() + " " + clie.getApellidos());
	    } else {
	        mensaje("| Cliente no encontrado.");
	    }}catch(Exception ea){
	    	mensaje("| Primero ponga el codigo de cliente");
	    }
	}
	
	protected void do_btnBuscarProducto_actionPerformed(ActionEvent e) {
		try{
		int codigo = leerCodigoProducto();
	    Producto p = aVentas.buscar(codigo);
	    if (p != null) {
	        txtCodigoProducto.setText(String.valueOf(p.getCodigoProducto()));
	        txtNomProd.setText(p.getNombre());
	        txtPrecio.setText(String.valueOf(p.getPrecio()));
	        
	        // RESET EL COMBOBOX A LA PRIMERA OPCION
	        
	        cboBox.setSelectedIndex(0);
	        
	        // LLAMAR AL METODO DE CALCULO
	        
	        do_cboBox_actionPerformed(null);
	    } else {
	        mensaje("| Producto no encontrado.");
	    }}catch(Exception eaa){
	    	mensaje("| Ponga el codigo del producto");
	    }
	}
	
	
	
	protected void do_cboBox_actionPerformed(ActionEvent e) {
		
		try {
	        int cantidad = Integer.parseInt(cboBox.getSelectedItem().toString());
	        double precio = Double.parseDouble(txtPrecio.getText());
	        
	        // Verificar que haya stock suficiente
	        int codigoProducto = Integer.parseInt(txtCodigoProducto.getText());
	        Producto producto = aVentas.buscar(codigoProducto);
	        
	        if (producto == null) {
	            mensaje("| Producto no encontrado");
	            return;
	        }
	        
	        if (cantidad > producto.getStockActual()) {
	            mensaje("| No hay suficiente stock. Stock actual: " + producto.getStockActual());
	            cboBox.setSelectedIndex(0);
	            return;
	        }
	        
	        double subtotal = cantidad * precio;
	        double igv = subtotal * 0.18;
	        double total = subtotal + igv;
	        
	        txtSubTotal.setText(String.format("%.2f", subtotal));
	        txtIGV.setText(String.format("%.2f", igv));
	        txtImpTotal.setText(String.format("%.2f", total));
	        
	        precioBasesinGarantia = total;
	        cboGarantia.setSelectedIndex(0);
	        
	    } catch (NumberFormatException ex) {
	        mensaje("| Por favor, asegúrese de que el precio sea un número válido y que haya listado el producto");
	    }
	}
	private void actualizarInterfazProductos() {
	    for (Window window : Window.getWindows()) {
	        if (window instanceof DialogProductos) {
	            DialogProductos dialogProductos = (DialogProductos) window;
	            dialogProductos.listar();
	            dialogProductos.editarFila();
	            break;
	        }
	    }
	}

	protected void do_cboGarantia_actionPerformed(ActionEvent e) {
		try {
            String selectedGarantia = (String) cboGarantia.getSelectedItem();
            double precioFinal = precioBasesinGarantia;

            if (selectedGarantia.contains("2 años")) {
                precioFinal *= 1.15; // 15% 
            } else if (selectedGarantia.contains("3 años")) {
                precioFinal *= 1.22; // 22%
            }


            txtImpTotal.setText(String.format("%.2f", precioFinal));
        } catch (NumberFormatException ex) {
            mensaje("| Error al calcular el precio con garantía. Asegúrese de que el precio total sea un número válido.");
        }
        }
	
	protected void do_btnVender_actionPerformed(ActionEvent e) {
		if (aVentas3.tamañoTemporal() == 0) {
	        mensaje("| No hay productos agregados a la venta");
	        return;
	    }

	    try {
	        // Imprimir detalle de venta
	        imprimir("=========================================");
	        imprimir(" DETALLE DE VENTA           ");
	        imprimir("=========================================");
	        imprimir(" Codigo del Cliente: " + txtCodClie.getText());
	        imprimir(" Nombres y Apellidos: " + txtNomApe.getText());
	        
	        double totalVenta = 0;
	        for (int i = 0; i < aVentas3.tamañoTemporal(); i++) {
	            Venta v = aVentas3.obtenerTemporal(i);
	            imprimir("\n Producto " + (i + 1) + ":");
	            imprimir(" Codigo del Producto: " + v.getCodigoProducto());
	            imprimir(" Nombre del Producto: " + v.getNombreProducto());
	            imprimir(" Precio del Producto: " + v.getPrecio());
	            imprimir(" Cantidad: " + v.getCantidad());
	            imprimir(" Subtotal: " + v.getPrecioSubTotal());
	            imprimir(" IGV: " + v.getPrecioIGV());
	            imprimir(" Total: " + v.getPrecioTotal());
	            totalVenta += v.getPrecioTotal();
	        }
	        
	        imprimir("\n Total de la venta: " + String.format("%.2f", totalVenta));
	        imprimir(" Garantía: " + cboGarantia.getSelectedItem().toString());
	        imprimir(" Tipo de factura: " + cboFactura.getSelectedItem().toString());
	        imprimir(" Forma de pago: " + cboFormaPago.getSelectedItem().toString());
	        imprimir("=========================================");
	        imprimir("");
	        
	        // Confirmar la venta
	        aVentas3.confirmarVenta();
	        
	        // Limpiar interfaz
	        limpieza();
	        ventas.setRowCount(0);
	        
	    } catch (Exception ex) {
	        mensaje("| Error al procesar la venta: " + ex.getMessage());
	        // Revertir cambios de stock si hay error
	        for (int i = 0; i < aVentas3.tamañoTemporal(); i++) {
	            Venta v = aVentas3.obtenerTemporal(i);
	            Producto p = aVentas.buscar(v.getCodigoProducto());
	            if (p != null) {
	                p.setStockActual(p.getStockActual() + v.getCantidad());
	            }
	        }
	        }
	        aVentas.grabarProductos();
	        
	    }
	
	void limpiezaCompleta() {
	    txtCodClie.setText("");
	    txtNomApe.setText("");
	    limpieza();
	}
	
	void imprimir() {
		imprimir("");
	}
	void limpieza() {
		txtCodigoProducto.setText("");
		txtNomProd.setText("");
		txtPrecio.setText("");
		txtSubTotal.setText("");
		txtImpTotal.setText("");
		txtIGV.setText("");
		cboBox.setToolTipText("");		
		cboGarantia.setToolTipText("");		
		cboFactura.setToolTipText("");
		cboFormaPago.setToolTipText("");
		txtCodClie.requestFocus();
	}

void limpiarCamposProducto() {
    txtCodigoProducto.setText("");
    txtNomProd.setText("");
    txtPrecio.setText("");
    txtSubTotal.setText("");
    txtIGV.setText("");
    txtImpTotal.setText("");
    cboBox.setSelectedIndex(0);
    cboGarantia.setSelectedIndex(0);
    cboFactura.setSelectedIndex(0);
    cboFormaPago.setSelectedIndex(0);
    txtCodigoProducto.requestFocus();
}
void limpiezaProducto() {
    txtCodigoProducto.setText("");
    txtNomProd.setText("");
    txtPrecio.setText("");
    txtSubTotal.setText("");
    txtImpTotal.setText("");
    txtIGV.setText("");
    cboBox.setSelectedIndex(0);
    cboGarantia.setSelectedIndex(0);
    txtCodigoProducto.requestFocus();
}
	

	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
		}
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	protected void do_btnAgregarProductos_actionPerformed(ActionEvent e) {
	    try {


	    	
	        if (txtCodigoProducto.getText().isEmpty() || txtPrecio.getText().isEmpty()) {
	            mensaje("| Por favor complete todos los campos");
	            return;
	        }
	        
	        int cantidad = Integer.parseInt(cboBox.getSelectedItem().toString());
	        if (cantidad <= 0) {
	            mensaje("| Seleccione una cantidad válida");
	            return;
	        }

	        
	        double precio = 0, subTotal = 0, igv = 0, impTotal = 0;
	        try {
	            precio = Double.parseDouble(txtPrecio.getText().trim().replace(",", "."));
	            subTotal = Double.parseDouble(txtSubTotal.getText().trim().replace(",", "."));
	            igv = Double.parseDouble(txtIGV.getText().trim().replace(",", "."));
	            impTotal = Double.parseDouble(txtImpTotal.getText().trim().replace(",", "."));
	        } catch (NumberFormatException ex) {
	            mensaje("| Error en los valores numéricos. Use formato: 99.99");
	            return;
	        }
	        
	        // Crear nueva venta
	        Venta v = new Venta(
	            aVentas3.codigoCorrelativoV(),
	            leerCodigoCliente(),
	            Integer.parseInt(txtCodigoProducto.getText()),
	            cantidad,
	            precio,
	            subTotal,
	            igv,
	            impTotal,
	            obtenerFechaActual(),
	            txtNomProd.getText()
	        );
	        
	        // Agregar a ventas temporales
	        aVentas3.adicionarTemporal(v);
	        
	        // Actualizar stock
	        Producto p = aVentas.buscar(v.getCodigoProducto());
	        if (p != null) {
	            p.setStockActual(p.getStockActual() - cantidad);
	            aVentas.grabarProductos();
	        }
	        
	        // Actualizar interfaz
	        actualizarTablaVentas();
	        actualizarInterfazProductos();
	        limpieza();
	        
	    } catch (Exception ex) {
	        mensaje("| Error al agregar el producto: " + ex.getMessage());
	    }
	}
	void actualizarTablaVentas() {
	    // Clear existing table data
	    ventas.setRowCount(0);
	    
	    // Add temporary sales to the table
	    for (int i = 0; i < aVentas3.tamañoTemporal(); i++) {
	        Venta v = aVentas3.obtenerTemporal(i);
	        Object[] fila = {
	            v.getCodigoVenta(),
	            v.getCodigoCliente(),
	            v.getCodigoProducto(),
	            v.getCantidad(),
	            v.getPrecio(),
	            v.getPrecioSubTotal(),
	            v.getPrecioIGV(),
	            v.getPrecioTotal(),
	            v.getNombreProducto(),
	            v.getFecha()
	        };
	        ventas.addRow(fila);
	    }
	    
	    // Update table display
	    Ventas.revalidate();
	    Ventas.repaint();
	}
	private String obtenerFechaActual() {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    return sdf.format(new Date());
	}
	
	
	void listar() {
	    ventas.setRowCount(0); // LIMPIAR LA TABLA ANTES DE LISTAR
	    for (int i = 0; i < aVentas3.tamaño(); i++) {
	        Venta v = aVentas3.obtener(i);
	        Object[] fila = {
	        		v.getCodigoVenta(),
	                v.getCodigoCliente(),
	                v.getCodigoProducto(),
	                v.getCantidad(),
	                v.getPrecio(),
	                v.getPrecioSubTotal(),
	                v.getPrecioIGV(),
	                v.getPrecioTotal(),
	                v.getNombreProducto(),
	                v.getFecha()
	        };
	        ventas.addRow(fila); // AGREGAR LOS DATOS DE LA TABLA
	        
	    }
	}
	String leerFecha() {
	    return java.time.LocalDate.now().toString(); 
	}
	
	int leerCantidadAdquirida(){
		return Integer.parseInt(cboBox.getToolTipText().trim());
	}
	int leerCodigoProducto() {
		return Integer.parseInt(txtCodigoProducto.getText().trim());
	}
	String leerNombreProducto(){
		return  txtNomProd.getText().trim();
	}
	double leerPrecio(){
		return Double.parseDouble(txtPrecio.getText().trim());
	}
	double leerPrecioSubTotal(){
		return Double.parseDouble(txtSubTotal.getText().trim());
	}
	double leerPrecioIGV(){
		return Double.parseDouble(txtIGV.getText().trim());
	}
	double txtImpTotal(){
		return Double.parseDouble(txtPrecio.getText().trim());
	}
	int leerCodigoCliente(){
		return Integer.parseInt(txtCodClie.getText().trim());
	}
	protected void do_btnCancelar_actionPerformed(ActionEvent e) {
		try {
	        // Revertir cambios de stock
	        for (int i = 0; i < aVentas3.tamañoTemporal(); i++) {
	            Venta v = aVentas3.obtenerTemporal(i);
	            Producto p = aVentas.buscar(v.getCodigoProducto());
	            if (p != null) {
	                p.setStockActual(p.getStockActual() + v.getCantidad());
	            }
	        }
	        aVentas.grabarProductos();
	        
	        // Cancelar venta temporal
	        aVentas3.cancelarVentaTemporal();
	        
	        // Limpiar interfaz
	        limpieza();
	        ventas.setRowCount(0);
	        
	        mensaje("| Venta cancelada. Stock restaurado.");
	        actualizarInterfazProductos();
	        
	    } catch (Exception ex) {
	        mensaje("| Error al cancelar la venta: " + ex.getMessage());
	    }
	}
}
	