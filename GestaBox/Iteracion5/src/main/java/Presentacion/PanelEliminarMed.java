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

import Dominio.PedidoElim;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class PanelEliminarMed {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String string) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelEliminarMed window54 = new PanelEliminarMed();
					window54.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PanelEliminarMed() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 119);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{103, 163, 176, 0};
		gbl_panel.rowHeights = new int[]{42, 42, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNombreMedicamentoA = new JLabel("Nombre medicamento a eliminar");
		GridBagConstraints gbc_lblNombreMedicamentoA = new GridBagConstraints();
		gbc_lblNombreMedicamentoA.gridwidth = 2;
		gbc_lblNombreMedicamentoA.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreMedicamentoA.gridx = 0;
		gbc_lblNombreMedicamentoA.gridy = 0;
		panel.add(lblNombreMedicamentoA, gbc_lblNombreMedicamentoA);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		final JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridx = 2;
		gbc_label.gridy = 1;
		panel.add(label, gbc_label);
		
		JButton btnEliminarDelPedido = new JButton("Eliminar del pedido");
		btnEliminarDelPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PedidoElim ped = new PedidoElim(textField.getText());
					ped.eliminar();
					label.setText("Eliminado del pedido");
					frame.setVisible(false);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(frame, "Error de eliminacion, inserte el nombre correcto");
				}
			}
		});
		GridBagConstraints gbc_btnEliminarDelPedido = new GridBagConstraints();
		gbc_btnEliminarDelPedido.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminarDelPedido.gridx = 1;
		gbc_btnEliminarDelPedido.gridy = 1;
		panel.add(btnEliminarDelPedido, gbc_btnEliminarDelPedido);
		

	}

}
