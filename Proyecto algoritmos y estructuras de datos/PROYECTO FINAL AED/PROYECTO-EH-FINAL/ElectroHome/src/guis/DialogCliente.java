package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import arreglos.ArregloClientes;
import clases.Cliente;
import clases.Producto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class DialogCliente extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtDni;
	private JTable tbltabla;
	private JButton btnIngresar;
	private JButton btnConsultar;
	private JButton btnModificacion;
	private JButton btnEliminar;
	private JButton btnListado;
	private JButton btnCerrar;
    private JTextArea txtS;
    private JScrollPane scrollPaneA;
    private DefaultTableModel modelo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogCliente frame = new DialogCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DialogCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1140, 598);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo :");
		lblCodigo.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblCodigo.setBounds(30, 81, 66, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNombres.setBounds(30, 109, 66, 14);
		contentPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblApellidos.setBounds(30, 134, 66, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblDireccion.setBounds(30, 162, 66, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblTelefono.setBounds(30, 189, 66, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblDni.setBounds(30, 218, 66, 14);
		contentPane.add(lblDni);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(95, 79, 250, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(95, 107, 367, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(95, 132, 367, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(95, 160, 367, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(95, 187, 367, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setBounds(95, 214, 367, 20);
		contentPane.add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblPanelCliente = new JLabel("PANEL - CLIENTE");
		lblPanelCliente.setForeground(new Color(0, 0, 0));
		lblPanelCliente.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblPanelCliente.setBounds(464, 11, 288, 37);
		contentPane.add(lblPanelCliente);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBorder(null);
		btnIngresar.setFocusPainted(false);
		btnIngresar.setBackground(new Color(0, 153, 204));
		btnIngresar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(832, 81, 128, 23);
		contentPane.add(btnIngresar);
		
		btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setBorder(null);
		btnConsultar.setFocusPainted(false);
		btnConsultar.setBackground(new Color(0, 153, 204));
		btnConsultar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(355, 77, 107, 23);
		contentPane.add(btnConsultar);
		
		btnModificacion = new JButton("MODIFICAR");
		btnModificacion.setBorder(null);
		btnModificacion.setFocusPainted(false);
		btnModificacion.setBackground(new Color(0, 153, 204));
		btnModificacion.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnModificacion.addActionListener(this);
		btnModificacion.setBounds(832, 109, 128, 23);
		contentPane.add(btnModificacion);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBorder(null);
		btnEliminar.setFocusPainted(false);
		btnEliminar.setBackground(new Color(0, 153, 204));
		btnEliminar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(832, 138, 128, 23);
		contentPane.add(btnEliminar);
		
		btnListado = new JButton("LISTAR");
		btnListado.setBorder(null);
		btnListado.setFocusPainted(false);
		btnListado.setBackground(new Color(0, 153, 204));
		btnListado.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnListado.addActionListener(this);
		btnListado.setBounds(970, 81, 117, 23);
		contentPane.add(btnListado);
		
		btnCerrar = new JButton("X");
		btnCerrar.setBorder(null);
		btnCerrar.setFocusPainted(false);
		btnCerrar.setBackground(new Color(0, 153, 204));
		btnCerrar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(970, 109, 117, 23);
		contentPane.add(btnCerrar);
		
		scrollPaneA = new JScrollPane();
		scrollPaneA.setBounds(10, 257, 803, 298);
		contentPane.add(scrollPaneA);
		
		tbltabla = new JTable();
		tbltabla.setFillsViewportHeight(true);
		scrollPaneA.setViewportView(tbltabla);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Nombres");
		modelo.addColumn("Apellidos");
		modelo.addColumn("Código");
		modelo.addColumn("Dirección");
		modelo.addColumn("Teléfono");
		modelo.addColumn("DNI");
		tbltabla.setModel(modelo); 
		JScrollPane scrollPaneB = new JScrollPane();
		scrollPaneB.setBounds(819, 257, 295, 298);
		contentPane.add(scrollPaneB);
		
        // CAMBIAR ICONO DE VENTANA
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/imgs/logosinfondonegro.png"));
        Image scaledIcon = icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        setIconImage(scaledIcon);
		
		 txtS = new JTextArea();
		scrollPaneB.setViewportView(txtS);
		listar();
		
		
	}
	
	// VARIABLES GLOBALES
	
    ArregloClientes ac = new ArregloClientes();
    
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(e);
		}
		if (e.getSource() == btnListado) {
			do_btnListado_actionPerformed(e);
		}
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnModificacion) {
			do_btnModificacion_actionPerformed(e);
		}
		if (e.getSource() == btnConsultar) {
			do_btnConsultar_actionPerformed(e);
		}
		if (e.getSource() == btnIngresar) {
			do_btnIngresar_actionPerformed(e);
		}
	}
	
	protected void do_btnIngresar_actionPerformed(ActionEvent e) {
        try {
        	
        	if (leerNombre().isEmpty() || leerApellido().isEmpty() || leerDireccion().isEmpty() ||
                    leerTelefono().isEmpty() || leerDni().isEmpty()) {
                    mensaje("| Error: Todos los campos son obligatorios. Por favor, complete todos los campos.");
                    return; // Salir del método si hay un error
                }
        	
            int codigoCliente =ac.codigoCorrelativo();;
            String nombres = leerNombre();
            String apellido = leerApellido();
            String direccion = leerDireccion();
            String telefono = leerTelefono();
            String dni = leerDni();
            Cliente nuevoCliente = new Cliente(codigoCliente, nombres, apellido, direccion, telefono, dni);
            ac.adicionar(nuevoCliente);
            listar();
            limpieza();
            txtS.setText("");

        } catch (NumberFormatException ex) {
            mensaje("| Error: El código del cliente, el teléfono o el DNI deben ser números válidos.");
        } catch (IllegalArgumentException ex) {
            mensaje("| Error: " + ex.getMessage());
        
	}
	}
	        
	 
	protected void do_btnConsultar_actionPerformed(ActionEvent e) {
		try{ int codigoCliente=leerCodigo();
			Cliente clie=ac.buscar(codigoCliente);
			
			if(clie!=null){
				txtCodigo.setText(String.valueOf(clie.getCodigoCliente()));
				txtNombre.setText(String.valueOf(clie.getNombres()));
				txtApellido.setText(String.valueOf(clie.getApellidos()));
				txtDireccion.setText(String.valueOf(clie.getDireccion()));
				txtTelefono.setText(String.valueOf(clie.getTelefono()));
				txtDni.setText(String.valueOf(clie.getDni()));
				txtS.setText("");
				imprimir("-------------------------------------------------");
				imprimir("CODIGO:"+ clie.getCodigoCliente());
				imprimir("NOMBRES:"+ clie.getNombres());
				imprimir("APELLIDOS:"+ clie.getApellidos());
				imprimir("DIRECCION:"+ clie.getDireccion());
				imprimir("TELEFONO:"+ clie.getTelefono());
				imprimir("DNI:"+ clie.getDni());
				imprimir("");
				
			}else{
				 mensaje("|  No se encontró nada");
				 limpieza();
			}
		}catch(NumberFormatException xd){
			mensaje("| Error: Ingrese el numero correctamente");
		}
	}
	
	protected void do_btnModificacion_actionPerformed(ActionEvent e) {
	    try {
	        // Leer el código del cliente
	        int codigoCliente = leerCodigo();
	        Cliente clie = ac.buscar(codigoCliente);
	        
	        // Verificar si el cliente existe
	        if (clie != null) {
	            // Leer los nuevos datos del cliente
	            int codigo = leerCodigo();
	            String nombres = leerNombre();
	            String apellidos = leerApellido();
	            String direccion = leerDireccion();
	            String telefono = leerTelefono();
	            String dni = leerDni();
	            
	            // Validaciones para verificar que los campos no estén vacíos
	            if (nombres.isEmpty() || apellidos.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || dni.isEmpty()) {
	                mensaje("| Todos los campos deben completarse.");
	                return; // Terminar el método si falta algún campo
	            }
	            
	            // Actualizar los datos del cliente
	            clie.setCodigoCliente(codigoCliente);
	            clie.setNombres(nombres);
	            clie.setApellidos(apellidos);
	            clie.setDireccion(direccion);
	            clie.setTelefono(telefono);
	            clie.setDni(dni);
	            
	            mensaje("| CLIENTE CORRECTAMENTE MODIFICADO");
	            ac.grabarCliente();
	            listar();
	            
	            // Seleccionar la fila correspondiente en la tabla
	            for (int i = 0; i < tbltabla.getRowCount(); i++) {
	                if ((int) tbltabla.getValueAt(i, 0) == codigo) {
	                    tbltabla.setRowSelectionInterval(i, i);
	                    break;
	                }
	            }
	            editarFila();
	        } else {
	            mensaje("| El código no existe");
	        }
	    } catch (Exception x) {
	        mensaje("| Error en ingreso de datos");
	    }
	    limpieza();
	}
	
	void editarFila(){
		if(ac.tamaño() ==0){
			limpieza();
		}else{
			Cliente clie = ac.obtener(tbltabla.getSelectedRow());
			txtCodigo.setText(""+clie.getCodigoCliente());
			txtNombre.setText(""+clie.getNombres());
			txtApellido.setText(""+clie.getApellidos());
			txtDireccion.setText(""+clie.getDireccion());
			txtTelefono.setText(""+clie.getTelefono());
			txtDni.setText(""+clie.getDni());
		}
	}
	
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		try{
			int codigo=leerCodigo();
			Cliente clie=ac.buscar(codigo);
			if(clie!=null){
				ac.eliminar(clie);
				listar();
			}else{
				mensaje("| El codigo no existe");
			}
		}catch(Exception x){
			mensaje("| Error en ingreso de datos");
		}
	}
	protected void do_btnListado_actionPerformed(ActionEvent e) {
		txtS.setText("");
		
	    if (ac.tamaño() == 0) {
	        imprimir("No hay productos registrados");
	    } else {
	        imprimir("LISTADO DE CLIENTES");
	        imprimir("--------------------------------------");
	        for (int i = 0; i < ac.tamaño(); i++) {
	            Cliente clie = ac.obtener(i);
	            imprimir("Codigo de cliente : 	"+clie.getCodigoCliente());
	            imprimir("Nombres : 		"+clie.getNombres());
	            imprimir("Apellidos : 		"+clie.getApellidos());
	            imprimir("Dirección  : 		"+clie.getDireccion());
	            imprimir("Teléfono : 		"+clie.getDireccion());
	            imprimir("DNI : 		"+clie.getDni());
	            imprimir("");
	        }
	        }
	}
	protected void do_btnCerrar_actionPerformed(ActionEvent e) {
		dispose();
	}
	
	//Métodos tipo void (sin parámetros)
	
	void imprimir() {
		imprimir("");
	}
	void limpieza() {
		txtCodigo.setText("");
		txtNombre.setText("");
		txtApellido.setText("");
		txtDireccion.setText("");
		txtTelefono.setText("");
		txtDni.setText("");
		txtCodigo.requestFocus();
	}
   	void listar() {
		modelo.setRowCount(0);
		for (int i=0; i<ac.tamaño(); i++) {
			Object[] fila = { ac.obtener(i).getNombres(),
					          ac.obtener(i).getApellidos(),
					          ac.obtener(i).getCodigoCliente(),
					          ac.obtener(i).getDireccion(),
					          ac.obtener(i).getTelefono(),
					          ac.obtener(i).getDni(),
								};
			modelo.addRow(fila);


		}
	}

	//  Métodos tipo void (con parámetros)
   	
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}

	int leerCodigo() {
	    return Integer.parseInt(txtCodigo.getText().trim());
	}

	String leerNombre() {
	    return txtNombre.getText().trim();
	}

	String leerApellido() {
	    return txtApellido.getText().trim();
	}

	String leerTelefono() {
	    return txtTelefono.getText().trim();
	}

	String leerDni() {
	    return txtDni.getText().trim();
	}
	String leerDireccion() {
	    return txtDireccion.getText().trim();
	}
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == tbltabla) {
			do_tblTabla_mouseClicked(arg0);
		}
	}
	
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void do_tblTabla_mouseClicked(MouseEvent arg0) {
	}
    
}

