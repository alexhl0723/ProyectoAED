package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Window.Type;

public class Tienda extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JMenuItem mntmSalir;
	private JMenuItem mntmClientes;
	private JMenuItem mntmProductos;
	private JMenuItem mntmAyuda;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmVerAlmacen;
	private JMenuItem mntmVender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Tienda dialog = new Tienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Tienda() {
		setForeground(Color.RED);
		setResizable(false);
		setTitle("PANTALLA PRINCIPAL - EH COMPANY");
		setBounds(100, 100, 1283, 786);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Tienda.class.getResource("/imgs/logoEH.jpg")));
		label.setBounds(0, 0, 1280, 725);
		contentPanel.add(label);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("\uD83D\uDCC2 Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("\u2699 Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmClientes = new JMenuItem("Clientes ");
		mntmClientes.addActionListener(this);
		mnMantenimiento.add(mntmClientes);
		
		mntmProductos = new JMenuItem("Productos");
		mntmProductos.addActionListener(this);
		mnMantenimiento.add(mntmProductos);
		
		JMenu mnVentas = new JMenu("\uD83D\uDED2 Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		JMenu mnAlmacen = new JMenu("\uD83C\uDFEF Almac\u00E9n");
		menuBar.add(mnAlmacen);
		
		mntmVerAlmacen = new JMenuItem("Ver Almacen");
		mntmVerAlmacen.addActionListener(this);
		mnAlmacen.add(mntmVerAlmacen);
		
		JMenu mnReportes = new JMenu("\uD83D\uDCC4 Reportes");
		menuBar.add(mnReportes);
		
		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mntmGenerarReportes.addActionListener(this);
		mnReportes.add(mntmGenerarReportes);
		
		JMenu mnCreadores = new JMenu("Acerca De");
		menuBar.add(mnCreadores);
		
		mntmAyuda = new JMenuItem("Ayuda");
		mntmAyuda.addActionListener(this);
		mnCreadores.add(mntmAyuda);
		
        // CAMBIAR ICONO DE VENTANA
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/imgs/logosinfondonegro.png"));
        Image scaledIcon = icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        setIconImage(scaledIcon);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmVender) {
			do_mntmVender_actionPerformed(e);
		}
		if (e.getSource() == mntmVerAlmacen) {
			do_mntmVerAlmacen_actionPerformed(e);
		}
		if (e.getSource() == mntmGenerarReportes) {
			do_mntmGenerarReportes_actionPerformed(e);
		}
		if (e.getSource() == mntmAyuda) {
			do_mntmAyuda_actionPerformed(e);
		}
		if (e.getSource() == mntmProductos) {
			do_mntmProductos_actionPerformed(e);
		}
		if (e.getSource() == mntmClientes) {
			do_mntmClientes_actionPerformed(e);
		}
		if (e.getSource() == mntmSalir) {
			do_mntmSalir_actionPerformed(e);
		}
	}
	
	//salir
	protected void do_mntmSalir_actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	/*Mantenimiento electrohome*/
	
	//Mantenimiento-cliente
	protected void do_mntmClientes_actionPerformed(ActionEvent e) {
		DialogCliente VentanaVentas = new DialogCliente();
		VentanaVentas.setLocationRelativeTo(this);
		VentanaVentas.setVisible(true);
	}
	//Mantenimiento-productos
	protected void do_mntmProductos_actionPerformed(ActionEvent e) {
		DialogProductos VentanaProductos = new DialogProductos();
		VentanaProductos.setLocationRelativeTo(this);
		VentanaProductos.setVisible(true);
	}
	/*Fin de Mantenimiento*/
	
	
	
	
	
	
	// creadores de este archivo java
	
	protected void do_mntmAyuda_actionPerformed(ActionEvent e) {
		DialogCreadores VentanaCreadores = new DialogCreadores();
		VentanaCreadores.setLocationRelativeTo(this);
		VentanaCreadores.setVisible(true);
	}
	
	//Reportes
	
	protected void do_mntmGenerarReportes_actionPerformed(ActionEvent e) {
		DialogGenerarReportes VentanaReportes = new DialogGenerarReportes();
		VentanaReportes.setLocationRelativeTo(this);
		VentanaReportes.setVisible(true);
	}
	
	//Almacen
	
	protected void do_mntmVerAlmacen_actionPerformed(ActionEvent e) {
		DialogAlmacen VentanaAlmacen = new DialogAlmacen();
		VentanaAlmacen.setLocationRelativeTo(this);
		VentanaAlmacen.setVisible(true);
	}
	
	//Ventas
	
	protected void do_mntmVender_actionPerformed(ActionEvent e) {
		DialogVentas VentanaVentas = new DialogVentas();
		VentanaVentas.setLocationRelativeTo(this);
		VentanaVentas.setVisible(true);
	}
	
}
