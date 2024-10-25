package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

import javax.swing.ImageIcon;
import java.awt.*;

public class DialogCreadores extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogCreadores dialog = new DialogCreadores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogCreadores() {
		setBounds(100, 100, 615, 406);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(240, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		
		
		JLabel lblAcercaDeNosotros = new JLabel("ACERCA DE NOSOTROS");
		lblAcercaDeNosotros.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblAcercaDeNosotros.setBounds(144, 11, 311, 55);
		contentPanel.add(lblAcercaDeNosotros);
		
		JLabel lblEquipo = new JLabel("EQUIPO DE TRABAJO");
		lblEquipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblEquipo.setBounds(38, 99, 209, 39);
		contentPanel.add(lblEquipo);
		
		JLabel lblJosephInga = new JLabel("1.-  Alex Herbas Leiva");
		lblJosephInga.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblJosephInga.setBounds(56, 148, 179, 21);
		contentPanel.add(lblJosephInga);
		
		JLabel lblJosephInga_1 = new JLabel("2.-  Joseph Inga Mendoza");
		lblJosephInga_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblJosephInga_1.setBounds(56, 180, 179, 21);
		contentPanel.add(lblJosephInga_1);
		
		JLabel lblJosephInga_2 = new JLabel("3.-  Jetli Huanaco De la cruz");
		lblJosephInga_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblJosephInga_2.setBounds(56, 212, 221, 21);
		contentPanel.add(lblJosephInga_2);
		
		JLabel lblJosephInga_3 = new JLabel("4.- Abigail Romero Ferrer");
		lblJosephInga_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblJosephInga_3.setBounds(56, 244, 179, 21);
		contentPanel.add(lblJosephInga_3);
		
		JLabel lblJosephInga_4 = new JLabel("5.-  Ailyn Gamarra Rosas");
		lblJosephInga_4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblJosephInga_4.setBounds(56, 277, 179, 21);
		contentPanel.add(lblJosephInga_4);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(191, 60, 204, 2);
		contentPanel.add(separator);
		
		JLabel lblInformacinDelSistema = new JLabel("INFORMACI\u00D3N DEL SISTEMA");
		lblInformacinDelSistema.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformacinDelSistema.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblInformacinDelSistema.setBounds(288, 99, 272, 39);
		contentPanel.add(lblInformacinDelSistema);
		
		JLabel lblVersinbeta = new JLabel("Versi\u00F3n: 0.0.1 beta");
		lblVersinbeta.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblVersinbeta.setBounds(367, 148, 141, 21);
		contentPanel.add(lblVersinbeta);
		
		JLabel lblElectrohome = new JLabel("ELECTROHOME 2024");
		lblElectrohome.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblElectrohome.setBounds(227, 335, 159, 21);
		contentPanel.add(lblElectrohome);
		
		JLabel lblAilynGamarra = new JLabel("6.-  Diana Quispe Mamani");
		lblAilynGamarra.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblAilynGamarra.setBounds(56, 309, 179, 21);
		contentPanel.add(lblAilynGamarra);
		
        // CAMBIAR ICONO DE VENTANA
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/imgs/logosinfondonegro.png"));
        Image scaledIcon = icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        setIconImage(scaledIcon);
	}
}
