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

import Dominio.MedicamentoElim;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarMedicamento {

	private JFrame frmDescatalogarMedicamento;
	private JTextField textNom;

	/**
	 * Launch the application.
	 */
	public static void main(String string) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarMedicamento window3 = new EliminarMedicamento();
					window3.frmDescatalogarMedicamento.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EliminarMedicamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDescatalogarMedicamento = new JFrame();
		frmDescatalogarMedicamento.setResizable(false);
		frmDescatalogarMedicamento.setTitle("Descatalogar Medicamento");
		frmDescatalogarMedicamento.setBounds(100, 100, 447, 114);
		frmDescatalogarMedicamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmDescatalogarMedicamento.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{48, 116, 98, 34, 0};
		gbl_panel.rowHeights = new int[]{42, 57, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNombreDelMedicamento = new JLabel("Nombre del medicamento a descatalogar");
		GridBagConstraints gbc_lblNombreDelMedicamento = new GridBagConstraints();
		gbc_lblNombreDelMedicamento.anchor = GridBagConstraints.EAST;
		gbc_lblNombreDelMedicamento.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreDelMedicamento.gridx = 1;
		gbc_lblNombreDelMedicamento.gridy = 0;
		panel.add(lblNombreDelMedicamento, gbc_lblNombreDelMedicamento);
		
		textNom = new JTextField();
		GridBagConstraints gbc_textNom = new GridBagConstraints();
		gbc_textNom.insets = new Insets(0, 0, 5, 5);
		gbc_textNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNom.gridx = 2;
		gbc_textNom.gridy = 0;
		panel.add(textNom, gbc_textNom);
		textNom.setColumns(10);
		
		final JLabel lblNot = new JLabel("");
		lblNot.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblNot = new GridBagConstraints();
		gbc_lblNot.insets = new Insets(0, 0, 0, 5);
		gbc_lblNot.gridx = 2;
		gbc_lblNot.gridy = 1;
		panel.add(lblNot, gbc_lblNot);
		
		JButton btnDescatalogar = new JButton("Descatalogar");
		btnDescatalogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					MedicamentoElim med = new MedicamentoElim(textNom.getText());
					med.eliminar();
					lblNot.setText("Descatalogado");
					frmDescatalogarMedicamento.setVisible(false);
				}catch(Exception e){
					
					JOptionPane.showMessageDialog(frmDescatalogarMedicamento, e.getMessage(), "Fallo descatalogar", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btnDescatalogar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnDescatalogar = new GridBagConstraints();
		gbc_btnDescatalogar.insets = new Insets(0, 0, 0, 5);
		gbc_btnDescatalogar.gridx = 1;
		gbc_btnDescatalogar.gridy = 1;
		panel.add(btnDescatalogar, gbc_btnDescatalogar);
		

	}

}
