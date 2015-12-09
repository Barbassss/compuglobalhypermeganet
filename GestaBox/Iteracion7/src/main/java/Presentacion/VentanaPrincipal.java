package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextPane;

import Dominio.GestorLeerMedicamentos;
import Dominio.MedicamentoLeer;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String string) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window28 = new VentanaPrincipal();
					window28.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 313, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{51, 48, 53, 47, 46, 44, 0};
		gbl_panel.rowHeights = new int[]{48, 47, 47, 50, 40, 39, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblMedicamento = new JLabel("Medicamento");
		GridBagConstraints gbc_lblMedicamento = new GridBagConstraints();
		gbc_lblMedicamento.gridwidth = 2;
		gbc_lblMedicamento.insets = new Insets(0, 0, 5, 5);
		gbc_lblMedicamento.gridx = 0;
		gbc_lblMedicamento.gridy = 0;
		panel.add(lblMedicamento, gbc_lblMedicamento);
		
		JLabel lblUnidades = new JLabel("Unidades");
		GridBagConstraints gbc_lblUnidades = new GridBagConstraints();
		gbc_lblUnidades.insets = new Insets(0, 0, 5, 5);
		gbc_lblUnidades.gridx = 2;
		gbc_lblUnidades.gridy = 0;
		panel.add(lblUnidades, gbc_lblUnidades);
		
		final JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.gridwidth = 3;
		gbc_textPane.gridheight = 5;
		gbc_textPane.insets = new Insets(0, 0, 0, 5);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 0;
		gbc_textPane.gridy = 1;
		panel.add(textPane, gbc_textPane);
		
		JButton btnModificarMedicamento = new JButton("Modificar");
		btnModificarMedicamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaModificar.main("");
				
				try {
					textPane.setText("");
					MedicamentoLeer [] matriz = GestorLeerMedicamentos.leerTod();
					for(int i=0;i<matriz.length;i++){
						textPane.setText(textPane.getText() + matriz[i].printMed()+"\n");
						
					}
				} catch (Exception e2) {
					
				}
			}
		});
		GridBagConstraints gbc_btnModificarMedicamento = new GridBagConstraints();
		gbc_btnModificarMedicamento.gridwidth = 2;
		gbc_btnModificarMedicamento.insets = new Insets(0, 0, 5, 0);
		gbc_btnModificarMedicamento.gridx = 4;
		gbc_btnModificarMedicamento.gridy = 1;
		panel.add(btnModificarMedicamento, gbc_btnModificarMedicamento);
		
		JButton btnInsertar = new JButton("Catalogar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CatalogarMedicamento.main("");
				try {
					textPane.setText("");
					MedicamentoLeer [] matriz = GestorLeerMedicamentos.leerTod();
					for(int i=0;i<matriz.length;i++){
						textPane.setText(textPane.getText() + matriz[i].printMed()+"\n");
						
					}
				} catch (Exception e1) {
					
				}
			}
		});
		GridBagConstraints gbc_btnInsertar = new GridBagConstraints();
		gbc_btnInsertar.gridwidth = 2;
		gbc_btnInsertar.insets = new Insets(0, 0, 5, 0);
		gbc_btnInsertar.gridx = 4;
		gbc_btnInsertar.gridy = 2;
		panel.add(btnInsertar, gbc_btnInsertar);
		
		JButton btnDescatalogar = new JButton("Descatalogar");
		btnDescatalogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EliminarMedicamento.main("");
				try {
					textPane.setText("");
					MedicamentoLeer [] matriz = GestorLeerMedicamentos.leerTod();
					for(int i=0;i<matriz.length;i++){
						textPane.setText(textPane.getText() + matriz[i].printMed()+"\n");
						
					}
				} catch (Exception e1) {
					
				}
			}
		});
		GridBagConstraints gbc_btnDescatalogar = new GridBagConstraints();
		gbc_btnDescatalogar.gridwidth = 2;
		gbc_btnDescatalogar.insets = new Insets(0, 0, 5, 0);
		gbc_btnDescatalogar.gridx = 4;
		gbc_btnDescatalogar.gridy = 3;
		panel.add(btnDescatalogar, gbc_btnDescatalogar);
		
		JButton btnEnvios = new JButton("Pedido Actual");
		btnEnvios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PedidoActual.main("");
			}
		});
		GridBagConstraints gbc_btnEnvios = new GridBagConstraints();
		gbc_btnEnvios.gridwidth = 2;
		gbc_btnEnvios.insets = new Insets(0, 0, 5, 0);
		gbc_btnEnvios.gridx = 4;
		gbc_btnEnvios.gridy = 4;
		panel.add(btnEnvios, gbc_btnEnvios);
		
		try {
			textPane.setText("");
			MedicamentoLeer [] matriz = GestorLeerMedicamentos.leerTod();
			for(int i=0;i<matriz.length;i++){
				textPane.setText(textPane.getText() + matriz[i].printMed()+"\n");
				
			}
		} catch (Exception e) {
			
		}
		
	}

}
