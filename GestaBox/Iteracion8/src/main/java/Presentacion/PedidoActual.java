package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextPane;

import Dominio.GestorLeerPedidos;
import Dominio.PedidoLeer;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class PedidoActual {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String string) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PedidoActual window976 = new PedidoActual();
					window976.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PedidoActual() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 364, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{47, 39, 44, 67, 63, 0, 0};
		gbl_panel.rowHeights = new int[]{45, 0, 41, 50, 0, 42, 37, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblMedicamento = new JLabel("Medicamento");
		GridBagConstraints gbc_lblMedicamento = new GridBagConstraints();
		gbc_lblMedicamento.gridwidth = 2;
		gbc_lblMedicamento.insets = new Insets(0, 0, 5, 5);
		gbc_lblMedicamento.gridx = 0;
		gbc_lblMedicamento.gridy = 0;
		panel.add(lblMedicamento, gbc_lblMedicamento);
		
		JLabel lblUniades = new JLabel("Uniades");
		GridBagConstraints gbc_lblUniades = new GridBagConstraints();
		gbc_lblUniades.insets = new Insets(0, 0, 5, 5);
		gbc_lblUniades.gridx = 2;
		gbc_lblUniades.gridy = 0;
		panel.add(lblUniades, gbc_lblUniades);
		
		final JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.gridheight = 6;
		gbc_textPane.gridwidth = 3;
		gbc_textPane.insets = new Insets(0, 0, 0, 5);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 0;
		gbc_textPane.gridy = 1;
		panel.add(textPane, gbc_textPane);
		
		JButton btnAadirMedicamento = new JButton("A\u00F1adir Medicamento");
		btnAadirMedicamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaAñadirMedicamento.main("");
				try {
					textPane.setText("");
					PedidoLeer[] matriz = GestorLeerPedidos.leer();
					for(int i=0;i<matriz.length;i++){
						textPane.setText(textPane.getText() + matriz[i].printPed()+"\n");
						
					}
				} catch (Exception e2) {
					
				}
			}
		});
		GridBagConstraints gbc_btnAadirMedicamento = new GridBagConstraints();
		gbc_btnAadirMedicamento.gridwidth = 3;
		gbc_btnAadirMedicamento.insets = new Insets(0, 0, 5, 0);
		gbc_btnAadirMedicamento.gridx = 3;
		gbc_btnAadirMedicamento.gridy = 2;
		panel.add(btnAadirMedicamento, gbc_btnAadirMedicamento);
		
		JButton btnEliminar = new JButton("Eliminar medicamento");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelEliminarMed.main("");
				try {
					textPane.setText("");
					PedidoLeer[] matriz = GestorLeerPedidos.leer();
					for(int i=0;i<matriz.length;i++){
						textPane.setText(textPane.getText() + matriz[i].printPed()+"\n");
						
					}
				} catch (Exception e2) {
					
				}
			}
		});
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.gridwidth = 3;
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 0);
		gbc_btnEliminar.gridx = 3;
		gbc_btnEliminar.gridy = 3;
		panel.add(btnEliminar, gbc_btnEliminar);
		
		JLabel lblCorreoProveedor = new JLabel("Correo Proveedor");
		GridBagConstraints gbc_lblCorreoProveedor = new GridBagConstraints();
		gbc_lblCorreoProveedor.anchor = GridBagConstraints.EAST;
		gbc_lblCorreoProveedor.insets = new Insets(0, 0, 0, 5);
		gbc_lblCorreoProveedor.gridx = 3;
		gbc_lblCorreoProveedor.gridy = 6;
		panel.add(lblCorreoProveedor, gbc_lblCorreoProveedor);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 6;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnEnviarPedido = new JButton("Enviar pedido");
		btnEnviarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//No hemos implementado el envio, por lo que se imprimira por pantalla el correo
				if (textField.getText()==null || textField.getText().equals("")){
					System.out.println("Correo para empresa@proveedor.com");
				}else{
					System.out.println("Correo para "+ textField.getText());
				}
				System.out.println(textPane.getText());
				try {
					GestorLeerPedidos.enviarPedido();
					
				} catch (SQLException e1) {
					
				}
				try {
					textPane.setText("");
					PedidoLeer[] matriz = GestorLeerPedidos.leer();
					for(int i=0;i<matriz.length;i++){
						textPane.setText(textPane.getText() + matriz[i].printPed()+"\n");
						
					}
				} catch (Exception e2) {
					
				}
				frame.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnEnviarPedido = new GridBagConstraints();
		gbc_btnEnviarPedido.gridwidth = 3;
		gbc_btnEnviarPedido.insets = new Insets(0, 0, 5, 0);
		gbc_btnEnviarPedido.gridx = 3;
		gbc_btnEnviarPedido.gridy = 5;
		panel.add(btnEnviarPedido, gbc_btnEnviarPedido);
		
		
		try {
			textPane.setText("");
			PedidoLeer[] matriz = GestorLeerPedidos.leer();
			for(int i=0;i<matriz.length;i++){
				textPane.setText(textPane.getText() + matriz[i].printPed()+"\n");
				
			}
		} catch (Exception e) {
			
		}
	}

}
