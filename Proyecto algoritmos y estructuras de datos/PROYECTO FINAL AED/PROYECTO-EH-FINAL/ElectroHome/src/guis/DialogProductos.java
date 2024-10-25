package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//obligatorio
import clases.Producto;
import arreglos.ArregloProductos;
//
import javax.swing.UIManager;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class DialogProductos extends JDialog implements ActionListener, AncestorListener, MouseListener {
	// no se porque puse esto : 

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigoProducto;
	private JTextField txtNomProd;
	private JTextField txtPrecio;
	private JTextField txtStockA;
	private JTextField txtStockMini;
	private JTextField txtStockMaxi;
	private JButton btnCerrar;
	private JTable Productos;
	private DefaultTableModel producto;
	private JButton btnConsultar;
	private JButton btnIngresar;
	private JButton btnEliminar;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogProductos dialog = new DialogProductos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogProductos() {
		setBounds(100, 100, 1067, 537);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(240, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel label = new JLabel("C\u00F3digo del producto:");
		label.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		label.setBounds(31, 67, 128, 16);
		contentPanel.add(label);

		JLabel label_1 = new JLabel("Nombre del producto:");
		label_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		label_1.setBounds(31, 96, 128, 16);
		contentPanel.add(label_1);

		txtCodigoProducto = new JTextField();
		txtCodigoProducto.setColumns(10);
		txtCodigoProducto.setBounds(242, 67, 106, 22);
		contentPanel.add(txtCodigoProducto);

		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblPrecio.setBounds(31, 125, 56, 16);
		contentPanel.add(lblPrecio);

		JLabel lblStockActual = new JLabel("Stock Actual:");
		lblStockActual.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblStockActual.setBounds(31, 154, 106, 16);
		contentPanel.add(lblStockActual);

		JLabel lblStockMinimo = new JLabel("Stock M\u00EDnimo:");
		lblStockMinimo.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblStockMinimo.setBounds(31, 183, 106, 16);
		contentPanel.add(lblStockMinimo);

		JLabel lblStockMaximo = new JLabel("stock Maximo:");
		lblStockMaximo.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblStockMaximo.setBounds(31, 212, 106, 16);
		contentPanel.add(lblStockMaximo);

		txtNomProd = new JTextField();
		txtNomProd.setColumns(10);
		txtNomProd.setBounds(242, 96, 230, 22);
		contentPanel.add(txtNomProd);

		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(242, 125, 230, 22);
		contentPanel.add(txtPrecio);

		txtStockA = new JTextField();
		txtStockA.setColumns(10);
		txtStockA.setBounds(242, 154, 230, 22);
		contentPanel.add(txtStockA);

		txtStockMini = new JTextField();
		txtStockMini.setColumns(10);
		txtStockMini.setBounds(242, 183, 230, 22);
		contentPanel.add(txtStockMini);

		txtStockMaxi = new JTextField();
		txtStockMaxi.setColumns(10);
		txtStockMaxi.setBounds(242, 212, 230, 22);
		contentPanel.add(txtStockMaxi);

		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnIngresar.setBackground(new Color(0, 153, 204));
		btnIngresar.setFocusPainted(false);
		btnIngresar.setBorder(null);
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(785, 67, 103, 25);
		contentPanel.add(btnIngresar);

		btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnModificar.setBackground(new Color(0, 153, 204));
		btnModificar.setFocusPainted(false);
		btnModificar.setBorder(null);
		btnModificar.addActionListener(this);
		btnModificar.setBounds(911, 67, 109, 25);
		contentPanel.add(btnModificar);

		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnEliminar.setBackground(new Color(0, 153, 204));
		btnEliminar.setFocusPainted(false);
		btnEliminar.setBorder(null);
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(785, 95, 103, 25);
		contentPanel.add(btnEliminar);

		btnListar = new JButton("LISTAR");
		btnListar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnListar.setBackground(new Color(0, 153, 204));
		btnListar.setFocusPainted(false);
		btnListar.setBorder(null);
		btnListar.addActionListener(this);
		btnListar.setBounds(911, 95, 109, 25);
		contentPanel.add(btnListar);

		JLabel lblProductos = new JLabel("PANEL - PRODUCTOS");
		lblProductos.setForeground(new Color(0, 0, 0));
		lblProductos.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblProductos.setBounds(325, 11, 357, 37);
		contentPanel.add(lblProductos);

		btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnConsultar.setBackground(new Color(0, 153, 204));
		btnConsultar.setFocusPainted(false);
		btnConsultar.setBorder(null);
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(362, 66, 110, 25);
		contentPanel.add(btnConsultar);

		btnCerrar = new JButton("X");
		btnCerrar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnCerrar.setBackground(new Color(0, 153, 204));
		btnCerrar.setFocusPainted(false);
		btnCerrar.setBorder(null);
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(911, 124, 109, 25);
		contentPanel.add(btnCerrar);

		JScrollPane scpPane = new JScrollPane();
		scpPane.setBounds(10, 265, 733, 219);
		contentPanel.add(scpPane);

		Productos = new JTable();
		Productos.addMouseListener(this);
		Productos.addAncestorListener(this);
		Productos.setFillsViewportHeight(true);
		scpPane.setViewportView(Productos);
		
        // CAMBIAR ICONO DE VENTANA
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/imgs/logosinfondonegro.png"));
        Image scaledIcon = icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        setIconImage(scaledIcon);

		producto = new DefaultTableModel();
		producto.addColumn("Codigo de producto");
		producto.addColumn("Nombre del producto");
		producto.addColumn("Precio");
		producto.addColumn("Stock actual");
		producto.addColumn("Stock minimo");
		producto.addColumn("Stock maximo");

		Productos.setModel(producto);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(755, 265, 286, 219);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		// OBLIGATORIO
		
		listar();
	}

	// VARIABLE GLOBAL ( ojo llamar al arrai list oseea los arreglos )
	
	ArregloProductos ap = new ArregloProductos();
	private JButton btnModificar;
	private JButton btnListar;

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnListar) {
			do_btnListar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnIngresar) {
			do_btnIngresar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			do_btnConsultar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(arg0);
		}
	}

	// CIERRE
	
	protected void do_btnCerrar_actionPerformed(ActionEvent arg0) {
		this.dispose();
	}

	// 
	protected void do_btnConsultar_actionPerformed(ActionEvent arg0) {
		try {
	        int codigo = leerCodigo();
	        Producto p = ap.buscar(codigo);
	        if (p != null) {
	        	
	            // LLENAR LOS CAMPOS DE FORMULARIO
	        	
	            txtCodigoProducto.setText(String.valueOf(p.getCodigoProducto()));
	            txtNomProd.setText(p.getNombre());
	            txtPrecio.setText(String.valueOf(p.getPrecio()));
	            txtStockA.setText(String.valueOf(p.getStockActual()));
	            txtStockMini.setText(String.valueOf(p.getStockMinimo()));
	            txtStockMaxi.setText(String.valueOf(p.getStockMaximo()));

	            // IMPRIMIR
	            
	            txtS.setText("");
	            imprimir("	DETALLE DEL PRODUCTO");
	            imprimir("	-------------------------");
	            imprimir("Código del producto: " + p.getCodigoProducto());
	            imprimir("Nombre del producto: " + p.getNombre());
	            imprimir("Precio: " + p.getPrecio());
	            imprimir("Stock actual: " + p.getStockActual());     
	            imprimir("Stock Mínimo: " + p.getStockMinimo());     
	            imprimir("Stock Máximo: " + p.getStockMaximo());

	            	limpieza();
	            	mensaje("| Consultado correctamente");
	            
	        } else {
	            mensaje("| No hay ese producto");
	            limpieza(); 
	        }
	    } catch (NumberFormatException p) {
	        mensaje("| El codigo debe ser valido");
	    }
	}

	// INGRESO DE DATOS A LA TABLA
	
	protected void do_btnIngresar_actionPerformed(ActionEvent arg0) {
	    try {
	    	
	        // SE GENERAR UN CODIGO CORRELATIVO AUTO
	    	
	        int codigoProducto = ap.codigoCorrelativo();
	        
	        String nombre = leerNombre();
	        int stockActual = leerStockActual();
	        int stockMinimo = leerStockMinimo();
	        int stockMaximo = leerStockMaximo();
	        double precio = leerPrecio();
	        
	     // VALIDACIONES DE TEXTOS DE ENTRADA
	        
	        if (nombre.isEmpty()) {
	            throw new IllegalArgumentException("| El producto debe tener un nombre.");
	        }
	        if (stockActual < 0 || stockMinimo < 0 || stockMaximo < 0) {
	            throw new IllegalArgumentException("| Los valores de stock no pueden ser negativos.");
	        }
	        if (stockActual > stockMaximo) {
	            throw new IllegalArgumentException("| El stock actual no puede superar el stock máximo.");
	        }
	        if (stockMinimo > stockMaximo) {
	            throw new IllegalArgumentException("| El stock mínimo no puede ser mayor que el stock máximo.");
	        }
	        if (stockActual < stockMinimo) {
	            throw new IllegalArgumentException("| El stock actual no puede ser menor que el stock mínimo.");
	        }
	        if (precio <= 0) {
	            throw new IllegalArgumentException("| El precio debe ser mayor que cero.");
	        }
	       
	        Producto nuevo = new Producto(codigoProducto, nombre, stockActual, stockMinimo, stockMaximo, precio);
	        ap.adicionar(nuevo);
	        
	        listar();
	        limpieza();
	        mensaje("| Producto agregado exitosamente con código " + codigoProducto);
	        
	    } catch (NumberFormatException e) {
	        mensaje("| Por favor, ingrese valores numéricos apropiados.");
	    } catch (IllegalArgumentException e) {
	        mensaje(e.getMessage());
	    }
	}

	//

	protected void do_btnEliminar_actionPerformed(ActionEvent arg0) {
	    if (ap.tamaño() == 0) {
	        mensaje("| No existen productos para eliminar.");
	        return;
	    }
	    int codigoProducto;
	    Producto p = null;
	    int filaSeleccionada = Productos.getSelectedRow();
	    if (filaSeleccionada != -1) {
	        codigoProducto = (int) Productos.getValueAt(filaSeleccionada, 0);
	    } else {
	        try {
	            codigoProducto = Integer.parseInt(txtCodigoProducto.getText());
	        } catch (NumberFormatException e) {
	            mensaje("| Ingrese un código de producto válido o seleccione un producto de la tabla.");
	            return;
	        }
	    }
	    try {
	    	
	        p = ap.buscar(codigoProducto);
	        
	        if (p != null) {
	            int confirmacion = confirmar("¿Está seguro de eliminar este producto?");
	            if (confirmacion == JOptionPane.YES_OPTION) {
	                ap.eliminarProducto(p);
	                listar();
	                
	                // LIMPIA
	                
	                limpieza();
	                
	                // ACTUALIZA
	                
	                if (ap.tamaño() > 0) {
	                    if (filaSeleccionada >= ap.tamaño()) {
	                        filaSeleccionada = ap.tamaño() - 1;
	                    }
	                    editarFila();
	                }
	                
	                mensaje("| Producto eliminado exitosamente");
	            }
	        } else {
	            mensaje("| No se encontró el producto");
	        }
	    } catch (Exception e) {
	        mensaje("| Error al eliminar el producto: " + e.getMessage());
	    }
	}
	
	//
	
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	// RESALTAR FILA
	
	//
	
	void listar() {
		producto.setRowCount(0); // LIMPIAR LA TABLA ANTES DE LISTAR
		for (int i = 0; i < ap.tamaño(); i++) {
			Producto p = ap.obtener(i);
			Object[] fila = {
					p.getCodigoProducto(),
					p.getNombre(),
					p.getPrecio(),
					p.getStockActual(),
					p.getStockMinimo(),
					p.getStockMaximo()
			};
			producto.addRow(fila); // SE AGREGA LOS DATOS DELA TABLA
		}
	}

	void limpieza() {
		txtCodigoProducto.setText("");
		txtNomProd.setText("");
		txtStockA.setText("");
		txtStockMini.setText("");
		txtStockMaxi.setText("");
		txtPrecio.setText("");
	}
	
	// EDITAR FILAS

	void editarFila(){
		if(ap.tamaño() ==0){
			limpieza();
		}else{
			Producto p = ap.obtener(Productos.getSelectedRow());
			txtCodigoProducto.setText(""+p.getCodigoProducto());
			txtNomProd.setText(""+p.getNombre());
			txtStockA.setText(""+p.getStockActual());
			txtStockMini.setText(""+p.getStockMinimo());
			txtStockMaxi.setText(""+p.getStockMaximo());
			txtPrecio.setText(""+p.getPrecio());
		}
	}
	
	//
	
	void imprimir(){
		imprimir("");
	}
	
	void imprimir(String s){
		txtS.append(s + "\n");
	}
	
	// 
	int leerCodigo() {
		return Integer.parseInt(txtCodigoProducto.getText().trim());
	}

	// 
	String leerNombre() {
		return txtNomProd.getText().trim();
	}

	// 
	int leerStockActual() {
		return Integer.parseInt(txtStockA.getText().trim());
	}

	//
	int leerStockMinimo() {
		return Integer.parseInt(txtStockMini.getText().trim());
	}

	//
	int leerStockMaximo() {
		return Integer.parseInt(txtStockMaxi.getText().trim());
	}

	//
	double leerPrecio() {
		return Double.parseDouble(txtPrecio.getText().trim());
	}
	
	//
	
	int confirmar(String s) {
		return JOptionPane.showConfirmDialog(this, s, "Alerta", 0, 1, null);
	}
	
	//
	

	@Override
	public void ancestorAdded(AncestorEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ancestorMoved(AncestorEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ancestorRemoved(AncestorEvent event) {
		// TODO Auto-generated method stub
		
	}
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == Productos) {
			editarFila();
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
	//
	protected void do_Productos_mouseClicked(MouseEvent arg0) {
		editarFila();
	}
	///
	protected void do_btnModificar_actionPerformed(ActionEvent arg0) {
        try {
            int codigo = leerCodigo();
            Producto p = ap.buscar(codigo);
            if (p != null) {
                String nombre = leerNombre();
                int stockActual = leerStockActual();
                int stockMinimo = leerStockMinimo();
                int stockMaximo = leerStockMaximo();
                double precio = leerPrecio();

                // REALIZAR VALIDACIONES AQUI....

                p.setNombre(nombre);
                p.setStockActual(stockActual);
                p.setStockMinimo(stockMinimo);
                p.setStockMaximo(stockMaximo);
                p.setPrecio(precio);
                
                ap.grabarProductos();
                listar();
                
                // SELECCIONAR LA FILA MODIFICADA
                
                for (int i = 0; i < Productos.getRowCount(); i++) {
                    if ((int)Productos.getValueAt(i, 0) == codigo) {
                        Productos.setRowSelectionInterval(i, i);
                        break;
                    }
                }
                
                editarFila();
                mensaje("| Producto modificado con éxito");
            } else {
                mensaje("| Producto no encontrado");
            }
        } catch (NumberFormatException e) {
            mensaje("| Error: Asegúrate de ingresar valores numéricos válidos en los campos correspondientes.");
        } catch (IllegalArgumentException e) {
            mensaje("| Error: " + e.getMessage());
        }
    }
	
	
	
	
	protected void do_btnListar_actionPerformed(ActionEvent arg0) {
		
		txtS.setText("");
		
	    if (ap.tamaño() == 0) {
	        imprimir("| No hay productos registrados");
	    } else {
	        imprimir("LISTADO DE PRODUCTOS");
	        imprimir("====================");
	        for (int i = 0; i < ap.tamaño(); i++) {
	            Producto p = ap.obtener(i);
	            imprimir(" Código del producto: " + p.getCodigoProducto());
	            imprimir(" Nombre del producto: " + p.getNombre());
	            imprimir(" Precio: " + p.getPrecio());
	            imprimir(" Stock actual: " + p.getStockActual());     
	            imprimir(" Stock Mínimo: " + p.getStockMinimo());     
	            imprimir(" Stock Máximo: " + p.getStockMaximo());
	            imprimir("");
	        }
	    }
	}
	
	
	
}
