package guis;

import java.awt.BorderLayout;

import utils.GradientPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;


public class Login extends JDialog implements ActionListener {

    private final JPanel contentPanel = new JPanel();
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnSalir;

    public static void main(String[] args) {
        try {
            Login dialog = new Login();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Login() {
    	setBackground(new Color(153, 204, 255));
        setTitle("Autenticaci\u00F3n - EH Company");
        setBounds(100, 100, 830, 500);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setForeground(Color.BLACK);
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
                
                JPanel panel = new JPanel();
                panel.setBackground(Color.WHITE);
                panel.setForeground(Color.BLACK);
                panel.setBounds(414, 0, 400, 461);
                contentPanel.add(panel);
                panel.setLayout(null);
                
                
                JLabel label = new JLabel("_______________________________________");
                label.setBounds(66, 280, 321, 14);
                panel.add(label);
                
                JLabel label_1 = new JLabel("_______________________________________");
                label_1.setBounds(66, 179, 321, 14);
                panel.add(label_1);
                
                JLabel lblUsername = new JLabel("Usuario:");
                lblUsername.setBounds(66, 126, 135, 25);
                panel.add(lblUsername);
                lblUsername.setFont(new Font("Segoe UI", Font.BOLD, 20));
                lblUsername.setForeground(Color.BLACK);
                lblUsername.setBackground(Color.WHITE);
                
                JLabel lblPassword = new JLabel("Contrase\u00F1a:");
                lblPassword.setBounds(66, 224, 135, 25);
                panel.add(lblPassword);
                lblPassword.setFont(new Font("Segoe UI", Font.BOLD, 20));
                lblPassword.setForeground(Color.BLACK);
                
                JLabel lblIniciarSesin = new JLabel("\tINICIAR SESI\u00D3N\r\n");
                lblIniciarSesin.setForeground(new Color(0, 0, 0));
                lblIniciarSesin.setBounds(108, 37, 218, 35);
                panel.add(lblIniciarSesin);
                lblIniciarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
                
                JButton btnLogin = new JButton("INGRESAR");
                btnLogin.setBorder(null);
                btnLogin.setFocusPainted(false);
                btnLogin.setBounds(108, 385, 111, 23);
                panel.add(btnLogin);
                btnLogin.setBackground(new Color(0, 153, 204));
                btnLogin.setFont(new Font("Segoe UI", Font.BOLD, 11));
                btnLogin.setActionCommand("Login");
                getRootPane().setDefaultButton(btnLogin); 
                
                btnSalir = new JButton("SALIR");
                btnSalir.setBorder(null);
                btnSalir.setFocusPainted(false);
                btnSalir.setBounds(224, 385, 75, 23);
                panel.add(btnSalir);
                btnSalir.setBackground(new Color(0, 153, 204));
                btnSalir.setFont(new Font("Segoe UI", Font.BOLD, 11));
                
                txtUsername = new JTextField();
                txtUsername.setForeground(new Color(0, 153, 204));
                txtUsername.setBounds(86, 162, 213, 22);
                panel.add(txtUsername);
                txtUsername.setBackground(Color.WHITE);
                txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
                txtUsername.setBorder(null);//desaparecer los bordes
                
                txtPassword = new JPasswordField();
                txtPassword.setForeground(new Color(0, 153, 204));
                txtPassword.setBounds(86, 260, 213, 22);
                panel.add(txtPassword);
                txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
                
                txtPassword.setBackground(Color.WHITE);
                txtPassword.setBorder(null);
                
                JLabel lblNewLabel = new JLabel("");
                lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/imgs/usuario.png")));
                lblNewLabel.setBounds(61, 162, 24, 25);
                panel.add(lblNewLabel);
                
                JLabel label_5 = new JLabel("");
                label_5.setIcon(new ImageIcon(Login.class.getResource("/imgs/candado.png")));
                label_5.setBounds(61, 260, 24, 25);
                panel.add(label_5);
                btnSalir.addActionListener(this);
                
                        btnLogin.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                String username = txtUsername.getText();
                                String password = new String(txtPassword.getPassword());
                
                                // Simulación de autenticación básica
                                if(username.equals("alex") && password.equals("1234")) {
                                    JOptionPane.showMessageDialog(Login.this, "Inicio de sesión exitoso", "Login", JOptionPane.INFORMATION_MESSAGE);
                                    dispose();
                                    //para que aparezca la tienda cuando se verifique la cosa
                                    Tienda ztita = new Tienda();
                                    ztita.setVisible(true);
                                }
                                else if(username.equals("chop") && password.equals("1234")) {
                                	JOptionPane.showMessageDialog(Login.this, "Inicio de sesión exitoso", "Login", JOptionPane.INFORMATION_MESSAGE);
                                    dispose();
                                    //para que aparezca la tienda cuando se verifique la cosa
                                    Tienda ztita = new Tienda();
                                    ztita.setVisible(true);
                                }
                                else if(username.equals("joseph") && password.equals("1234")) {
                                	JOptionPane.showMessageDialog(Login.this, "Inicio de sesión exitoso", "Login", JOptionPane.INFORMATION_MESSAGE);
                                    dispose();
                                    //para que aparezca la tienda cuando se verifique la cosa
                                    Tienda ztita = new Tienda();
                                    ztita.setVisible(true);
                                }
                                else if(username.equals("abigail") && password.equals("1234")) {
                                	JOptionPane.showMessageDialog(Login.this, "Inicio de sesión exitoso", "Login", JOptionPane.INFORMATION_MESSAGE);
                                    dispose();
                                    //para que aparezca la tienda cuando se verifique la cosa
                                    Tienda ztita = new Tienda();
                                    ztita.setVisible(true);
                                }
                                else if(username.equals("diana") && password.equals("1234")) {
                                	JOptionPane.showMessageDialog(Login.this, "Inicio de sesión exitoso", "Login", JOptionPane.INFORMATION_MESSAGE);
                                    dispose();
                                    //para que aparezca la tienda cuando se verifique la cosa
                                    Tienda ztita = new Tienda();
                                    ztita.setVisible(true);
                                }
                                else if(username.equals("ailyn") && password.equals("1234")) {
                                	JOptionPane.showMessageDialog(Login.this, "Inicio de sesión exitoso", "Login", JOptionPane.INFORMATION_MESSAGE);
                                    dispose();
                                    //para que aparezca la tienda cuando se verifique la cosa
                                    Tienda ztita = new Tienda();
                                    ztita.setVisible(true);
                                }
                                
                                else {
                                    JOptionPane.showMessageDialog(Login.this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        });
        
        GradientPanel gradientPanel = new GradientPanel(new Color(0, 118, 184), new Color(255, 255, 255));
        gradientPanel.setBounds(0, 0, 416, 504);
        contentPanel.add(gradientPanel);
        gradientPanel.setLayout(null);
        
        JLabel label_3 = new JLabel("");
        label_3.setBounds(151, 96, 120, 120);
        gradientPanel.add(label_3);
        label_3.setIcon(new ImageIcon(Login.class.getResource("/imgs/logosinfondonegrox120.png")));
        label_3.setBackground(new Color(102, 204, 255));
        
        JLabel lblElectrohome = new JLabel("ELECTROHOME");
        lblElectrohome.setBounds(93, 201, 257, 38);
        gradientPanel.add(lblElectrohome);
        lblElectrohome.setForeground(Color.BLACK);
        lblElectrohome.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
        
        JLabel label_2 = new JLabel("Compa\u00F1ia EletroHome - Todos los derechos reservados\r\n");
        label_2.setForeground(new Color(0, 0, 0));
        label_2.setVerticalAlignment(SwingConstants.TOP);
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        label_2.setFont(new Font("Segoe UI", Font.BOLD, 10));
        label_2.setDisplayedMnemonic(KeyEvent.VK_NONCONVERT);
        label_2.setBounds(10, 425, 380, 27);
        gradientPanel.add(label_2);
        
        JLabel label_4 = new JLabel("\"Bienvenido a la plataforma de autenticaci\u00F3n\"");
        label_4.setVerticalAlignment(SwingConstants.TOP);
        label_4.setHorizontalAlignment(SwingConstants.CENTER);
        label_4.setFont(new Font("Segoe UI Light", Font.PLAIN, 17));
        label_4.setDisplayedMnemonic(KeyEvent.VK_NONCONVERT);
        label_4.setBounds(26, 250, 380, 54);
        gradientPanel.add(label_4);
        
        // CAMBIAR ICONO DE VENTANA
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/imgs/logosinfondonegro.png"));
        Image scaledIcon = icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        setIconImage(scaledIcon);
    }
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(arg0);
		}
	}
	protected void do_btnSalir_actionPerformed(ActionEvent arg0) {
		System.exit(0);
	}
}
