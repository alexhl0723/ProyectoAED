package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arreglos.ArregloProductos;
import clases.Producto;

import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;

public class DialogAlmacen extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodProd;
	private JTextField txtStockA;
	private JButton btnCeerrar;
	private JButton btnAumentar;
	private JButton btnBuscar;
	private JTextField txtAumentar;
	private JTextField txtStockMax;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogAlmacen dialog = new DialogAlmacen();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogAlmacen() {
		setBounds(100, 100, 830, 500);
		getContentPane().setLayout(null);
		contentPanel.setForeground(new Color(255, 0, 51));
		contentPanel.setBackground(new Color(240, 255, 255));
		contentPanel.setBounds(0, 0, 814, 461);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblAlmacenDeLos = new JLabel("ALMACEN DE LOS PRODUCTOS");
		lblAlmacenDeLos.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblAlmacenDeLos.setBounds(208, 26, 464, 37);
		contentPanel.add(lblAlmacenDeLos);
		
		JLabel lblCodigoDelProducto = new JLabel("Codigo del producto:");
		lblCodigoDelProducto.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblCodigoDelProducto.setBounds(24, 103, 122, 16);
		contentPanel.add(lblCodigoDelProducto);
		
		txtCodProd = new JTextField();
		txtCodProd.setBounds(176, 100, 124, 22);
		contentPanel.add(txtCodProd);
		txtCodProd.setColumns(10);
		
		JLabel lblStockActual = new JLabel("Stock actual:");
		lblStockActual.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblStockActual.setBounds(24, 133, 76, 16);
		contentPanel.add(lblStockActual);
		
		txtStockA = new JTextField();
		txtStockA.setEditable(false);
		txtStockA.setColumns(10);
		txtStockA.setBounds(176, 127, 124, 22);
		contentPanel.add(txtStockA);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 255, 776, 190);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setFocusPainted(false);
		btnBuscar.setBorder(null);
		btnBuscar.setBackground(new Color(0, 153, 204));
		btnBuscar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(354, 100, 97, 25);
		contentPanel.add(btnBuscar);
		
		btnCeerrar = new JButton("X");
		btnCeerrar.setFocusPainted(false);
		btnCeerrar.setFocusTraversalKeysEnabled(false);
		btnCeerrar.setFocusable(false);
		btnCeerrar.setForeground(new Color(255, 0, 51));
		btnCeerrar.setOpaque(false);
		btnCeerrar.setBorder(null);
		btnCeerrar.setBackground(new Color(255, 0, 0));
		btnCeerrar.addActionListener(this);
		btnCeerrar.setBounds(745, 11, 56, 30);
		contentPanel.add(btnCeerrar);
		
		btnAumentar = new JButton("AUMENTAR");
		btnAumentar.setFocusPainted(false);
		btnAumentar.setBorder(null);
		btnAumentar.setBackground(new Color(0, 153, 204));
		btnAumentar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnAumentar.addActionListener(this);
		btnAumentar.setBounds(354, 153, 97, 25);
		contentPanel.add(btnAumentar);
		
		JLabel lblAumentar = new JLabel("Aumentar:");
		lblAumentar.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblAumentar.setBounds(24, 160, 56, 16);
		contentPanel.add(lblAumentar);
		
		txtAumentar = new JTextField();
		txtAumentar.setBounds(176, 154, 124, 22);
		contentPanel.add(txtAumentar);
		txtAumentar.setColumns(10);
		
		JLabel lblStockMaximo = new JLabel("Stock maximo");
		lblStockMaximo.setBounds(24, 185, 90, 16);
		contentPanel.add(lblStockMaximo);
		
		txtStockMax = new JTextField();
		txtStockMax.setEditable(false);
		txtStockMax.setBounds(176, 182, 124, 22);
		contentPanel.add(txtStockMax);
		txtStockMax.setColumns(10);
		
        // CAMBIAR ICONO DE VENTANA
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/imgs/logosinfondonegro.png"));
        Image scaledIcon = icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        setIconImage(scaledIcon);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnAumentar) {
			do_btnAumentar_actionPerformed(e);
		}
		if (e.getSource() == btnCeerrar) {
			do_btnCeerrar_actionPerformed(e);
		}
	}
	
	
	// VARIABLES GLOBALES
	
	ArregloProductos ap = new ArregloProductos();
	
	
	
	protected void do_btnCeerrar_actionPerformed(ActionEvent e) {
		this.dispose();
	}
	
	protected void do_btnAumentar_actionPerformed(ActionEvent e) {
	    try {
	        // 
	    	
	        String codigoStr = txtCodProd.getText().trim();
	        if (codigoStr.isEmpty()) {
	            mensaje("| Por favor, ingrese el codigo del producto.");
	            return;
	        }

	        int codigo = Integer.parseInt(codigoStr);
	        Producto producto = ap.buscar(codigo);
	        if (producto == null) {
	            mensaje("| Producto no encontrado. Por favor, busque un producto valido primero.");
	            return;
	        }

	        // 
	        
	        String aumentarStr = txtAumentar.getText().trim();
	        if (aumentarStr.isEmpty()) {
	            mensaje("| Por favor, ingrese la cantidad a aumentar.");
	            return;
	        }

	        int aumentar = Integer.parseInt(aumentarStr);
	        if (aumentar <= 0) {
	            mensaje("| El aumento debe ser un numero positivo.");
	            return;
	        }

	        // 
	        
	        int nuevoStock = producto.getStockActual() + aumentar;
	        if (nuevoStock > producto.getStockMaximo()) {
	            mensaje("| El nuevo stock excede el stock maximo permitido.");
	            return;
	        }

	        // 
	        
	        producto.setStockActual(nuevoStock);
	        txtStockA.setText(String.valueOf(nuevoStock));
	        ap.grabarProductos(); // Grabar cambios en el archivo

	        // 

	        
	        mensaje("| Stock aumentado exitosamente.");
	        imprimir(String.format("| Producto: %s - Codigo: %d - Nuevo stock: %d",
	                producto.getNombre(), producto.getCodigoProducto(), nuevoStock));
	        actualizarInterfazProductos();

	    } catch (NumberFormatException ex) {
	        mensaje("| Por favor ingrese valores numericos validos.");
	    } finally {
	        limpieza(); // Limpiar campos incluso si ocurre un error
	    }
	}
	private void actualizarInterfazProductos() {
		
	    // SE BUSCA LA INSTACION DE (DIALOGPRODUCTOS) SI ESTÃ� ABIERTA 
		
	    for (Window window : Window.getWindows()) {
	        if (window instanceof DialogProductos) {
	            DialogProductos dialogProductos = (DialogProductos) window;
	            dialogProductos.listar();
	            dialogProductos.editarFila();
	            break;
	        }
	    }

    }

	
	
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		try{
		int codigo = leerCodigo();
		Producto p = ap.buscar(codigo);
		if(p != null){
			txtCodProd.setText(String.valueOf(p.getCodigoProducto()));
			txtStockA.setText(String.valueOf(p.getStockActual()));
			txtStockMax.setText(String.valueOf(p.getStockMaximo()));
		}else{
			mensaje("| Por favor ponga un codigo valido");
		}}catch(NumberFormatException ea ){
			mensaje("| Por favor ingrese un code");
		}
		
	}
	
	int leerCodigo() {
		return Integer.parseInt(txtCodProd.getText().trim());
	}
	
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
		}
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void imprimir() {
		imprimir("");
	}
	void limpieza(){
		txtCodProd.setText("");
		txtStockA.setText("");
		txtAumentar.setText("");
		txtStockMax.setText("");
		
	}
}