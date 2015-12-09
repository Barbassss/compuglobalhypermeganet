package Presentacion;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import Dominio.GestorAutenticar;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelLogin {
	

	private JFrame frame;
	private JTextField txtUsr;
	private JTextField txtCon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelLogin window = new PanelLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PanelLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 429, 257);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\JAVIER OLIVER ASUS\\Dropbox\\Lab_ISO2\\CompuGlobalHyperMegaNet\\Imagenes\\Logo.png"));
		frame.getContentPane().add(label, BorderLayout.NORTH);
		
		JPanel UsrPass = new JPanel();
		frame.getContentPane().add(UsrPass, BorderLayout.CENTER);
		
		JLabel lblUsuario = new JLabel("Usuario");
		UsrPass.add(lblUsuario);
		
		txtUsr = new JTextField();
		UsrPass.add(txtUsr);
		txtUsr.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		UsrPass.add(lblContrasea);
		
		txtCon = new JTextField();
		UsrPass.add(txtCon);
		txtCon.setColumns(10);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnIniciarSesion = new JButton("Iniciar sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(GestorAutenticar.autenticar(txtUsr.getText(), txtCon.getText())){
					VentanaPrincipal.main("");
				}else{
					JOptionPane.showMessageDialog(frame, "Inserte usuario y contraseña correctos", "Fallo de autenticacion", JOptionPane.PLAIN_MESSAGE);
				}
				
			}
		});
		btnIniciarSesion.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panel.add(btnIniciarSesion);
	}

}
