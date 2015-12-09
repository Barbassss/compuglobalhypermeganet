package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import Dominio.Pedido;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAñadirMedicamento {

	private JFrame frame;
	private JTextField textNom;
	private JTextField textUn;

	/**
	 * Launch the application.
	 */
	public static void main(String string) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAñadirMedicamento window33 = new VentanaAñadirMedicamento();
					window33.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaAñadirMedicamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 134);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{134, 72, 0, 144, 0};
		gbl_panel.rowHeights = new int[]{48, 47, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNombreMedicamento = new JLabel("Nombre Medicamento");
		GridBagConstraints gbc_lblNombreMedicamento = new GridBagConstraints();
		gbc_lblNombreMedicamento.anchor = GridBagConstraints.EAST;
		gbc_lblNombreMedicamento.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreMedicamento.gridx = 0;
		gbc_lblNombreMedicamento.gridy = 0;
		panel.add(lblNombreMedicamento, gbc_lblNombreMedicamento);
		
		textNom = new JTextField();
		GridBagConstraints gbc_textNom = new GridBagConstraints();
		gbc_textNom.gridwidth = 2;
		gbc_textNom.insets = new Insets(0, 0, 5, 5);
		gbc_textNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNom.gridx = 1;
		gbc_textNom.gridy = 0;
		panel.add(textNom, gbc_textNom);
		textNom.setColumns(10);
		
		JLabel lblUnidades = new JLabel("Unidades");
		GridBagConstraints gbc_lblUnidades = new GridBagConstraints();
		gbc_lblUnidades.anchor = GridBagConstraints.EAST;
		gbc_lblUnidades.insets = new Insets(0, 0, 0, 5);
		gbc_lblUnidades.gridx = 0;
		gbc_lblUnidades.gridy = 1;
		panel.add(lblUnidades, gbc_lblUnidades);
		
		textUn = new JTextField();
		GridBagConstraints gbc_textUn = new GridBagConstraints();
		gbc_textUn.insets = new Insets(0, 0, 0, 5);
		gbc_textUn.fill = GridBagConstraints.HORIZONTAL;
		gbc_textUn.gridx = 1;
		gbc_textUn.gridy = 1;
		panel.add(textUn, gbc_textUn);
		textUn.setColumns(10);
		
		final JLabel lblNot = new JLabel("");
		lblNot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNot = new GridBagConstraints();
		gbc_lblNot.gridx = 3;
		gbc_lblNot.gridy = 1;
		panel.add(lblNot, gbc_lblNot);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Pedido ped = new Pedido(textNom.getText(), Integer.parseInt(textUn.getText()));
					ped.insertar();
					lblNot.setText("Insertado");
					frame.setVisible(false);
				}catch(Exception e1){
					JOptionPane.showMessageDialog(frame, "Error al catalogar, intentelo de nuevo");
				}
			}
		});
		GridBagConstraints gbc_btnInsertar = new GridBagConstraints();
		gbc_btnInsertar.insets = new Insets(0, 0, 5, 0);
		gbc_btnInsertar.gridx = 3;
		gbc_btnInsertar.gridy = 0;
		panel.add(btnInsertar, gbc_btnInsertar);
		

	}

}
