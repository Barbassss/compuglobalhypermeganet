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

import Dominio.Medicamento;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CatalogarMedicamento {

	private JFrame frmCatalogarMedicamento;
	private JTextField textId;
	private JTextField textNom;
	private JTextField textComp;
	private JTextField textLab;
	private JTextField textUnid;
	private JTextField textDos;

	/**
	 * Launch the application.
	 */
	public static void main(String args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CatalogarMedicamento window2 = new CatalogarMedicamento();
					window2.frmCatalogarMedicamento.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CatalogarMedicamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCatalogarMedicamento = new JFrame();
		frmCatalogarMedicamento.setResizable(false);
		frmCatalogarMedicamento.setTitle("Catalogar medicamento");
		frmCatalogarMedicamento.setBounds(100, 100, 434, 285);
		frmCatalogarMedicamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmCatalogarMedicamento.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {65, 40, 107, 44, 30, 0, 0, 7};
		gbl_panel.rowHeights = new int[] {18, 0, 0, 0, 0, 0, 0, 0, 0, 9};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblIdentificador = new JLabel("Identificador");
		GridBagConstraints gbc_lblIdentificador = new GridBagConstraints();
		gbc_lblIdentificador.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentificador.gridx = 0;
		gbc_lblIdentificador.gridy = 1;
		panel.add(lblIdentificador, gbc_lblIdentificador);
		
		textId = new JTextField();
		GridBagConstraints gbc_textId = new GridBagConstraints();
		gbc_textId.gridwidth = 2;
		gbc_textId.insets = new Insets(0, 0, 5, 5);
		gbc_textId.fill = GridBagConstraints.HORIZONTAL;
		gbc_textId.gridx = 1;
		gbc_textId.gridy = 1;
		panel.add(textId, gbc_textId);
		textId.setColumns(10);
		
		JLabel lblNombreMedicamento = new JLabel("Nombre medicamento");
		GridBagConstraints gbc_lblNombreMedicamento = new GridBagConstraints();
		gbc_lblNombreMedicamento.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreMedicamento.gridx = 0;
		gbc_lblNombreMedicamento.gridy = 2;
		panel.add(lblNombreMedicamento, gbc_lblNombreMedicamento);
		
		textNom = new JTextField();
		GridBagConstraints gbc_textNom = new GridBagConstraints();
		gbc_textNom.gridwidth = 3;
		gbc_textNom.insets = new Insets(0, 0, 5, 5);
		gbc_textNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNom.gridx = 1;
		gbc_textNom.gridy = 2;
		panel.add(textNom, gbc_textNom);
		textNom.setColumns(10);
		
		JLabel lblPrincipioActivoO = new JLabel("Principio activo o compuesto");
		GridBagConstraints gbc_lblPrincipioActivoO = new GridBagConstraints();
		gbc_lblPrincipioActivoO.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrincipioActivoO.gridx = 0;
		gbc_lblPrincipioActivoO.gridy = 3;
		panel.add(lblPrincipioActivoO, gbc_lblPrincipioActivoO);
		
		textComp = new JTextField();
		GridBagConstraints gbc_textComp = new GridBagConstraints();
		gbc_textComp.gridwidth = 3;
		gbc_textComp.insets = new Insets(0, 0, 5, 5);
		gbc_textComp.fill = GridBagConstraints.HORIZONTAL;
		gbc_textComp.gridx = 1;
		gbc_textComp.gridy = 3;
		panel.add(textComp, gbc_textComp);
		textComp.setColumns(10);
		
		JLabel lblLaboratorio = new JLabel("Laboratorio");
		GridBagConstraints gbc_lblLaboratorio = new GridBagConstraints();
		gbc_lblLaboratorio.insets = new Insets(0, 0, 5, 5);
		gbc_lblLaboratorio.gridx = 0;
		gbc_lblLaboratorio.gridy = 4;
		panel.add(lblLaboratorio, gbc_lblLaboratorio);
		
		textLab = new JTextField();
		GridBagConstraints gbc_textLab = new GridBagConstraints();
		gbc_textLab.gridwidth = 3;
		gbc_textLab.insets = new Insets(0, 0, 5, 5);
		gbc_textLab.fill = GridBagConstraints.HORIZONTAL;
		gbc_textLab.gridx = 1;
		gbc_textLab.gridy = 4;
		panel.add(textLab, gbc_textLab);
		textLab.setColumns(10);
		
		JLabel lblUnidadesDisponibles = new JLabel("Unidades  disponibles");
		GridBagConstraints gbc_lblUnidadesDisponibles = new GridBagConstraints();
		gbc_lblUnidadesDisponibles.insets = new Insets(0, 0, 5, 5);
		gbc_lblUnidadesDisponibles.gridx = 0;
		gbc_lblUnidadesDisponibles.gridy = 5;
		panel.add(lblUnidadesDisponibles, gbc_lblUnidadesDisponibles);
		
		textUnid = new JTextField();
		GridBagConstraints gbc_textUnid = new GridBagConstraints();
		gbc_textUnid.gridwidth = 2;
		gbc_textUnid.insets = new Insets(0, 0, 5, 5);
		gbc_textUnid.fill = GridBagConstraints.HORIZONTAL;
		gbc_textUnid.gridx = 1;
		gbc_textUnid.gridy = 5;
		panel.add(textUnid, gbc_textUnid);
		textUnid.setColumns(10);
		
		JLabel lblFormaDeLa = new JLabel("Forma de la dosis");
		GridBagConstraints gbc_lblFormaDeLa = new GridBagConstraints();
		gbc_lblFormaDeLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblFormaDeLa.gridx = 0;
		gbc_lblFormaDeLa.gridy = 6;
		panel.add(lblFormaDeLa, gbc_lblFormaDeLa);
		
		textDos = new JTextField();
		GridBagConstraints gbc_textDos = new GridBagConstraints();
		gbc_textDos.gridwidth = 2;
		gbc_textDos.insets = new Insets(0, 0, 5, 5);
		gbc_textDos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDos.gridx = 1;
		gbc_textDos.gridy = 6;
		panel.add(textDos, gbc_textDos);
		textDos.setColumns(10);
		
		final JLabel labelNot = new JLabel("");
		labelNot.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_labelNot = new GridBagConstraints();
		gbc_labelNot.gridheight = 2;
		gbc_labelNot.gridwidth = 7;
		gbc_labelNot.gridx = 0;
		gbc_labelNot.gridy = 7;
		panel.add(labelNot, gbc_labelNot);
		

		JButton btnInsertar = new JButton("Catalogar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Medicamento med=new Medicamento(Integer.parseInt(textId.getText()),Integer.parseInt(textUnid.getText()), textNom.getText(), textComp.getText(), textLab.getText(), textDos.getText());
					med.insertar();
					labelNot.setText("Medicamento catalogado con exito");
					frmCatalogarMedicamento.setVisible(false);
				}catch(Exception e){
					e.printStackTrace();
					JOptionPane.showMessageDialog(frmCatalogarMedicamento, "Error al catalogar el medicamento, introduzca de nuevo los datos y asegurese de que son correctos", "error catalogar", JOptionPane.PLAIN_MESSAGE);
				}
				
			}
		});
		GridBagConstraints gbc_btnInsertar = new GridBagConstraints();
		gbc_btnInsertar.gridwidth = 2;
		gbc_btnInsertar.insets = new Insets(0, 0, 5, 0);
		gbc_btnInsertar.gridx = 5;
		gbc_btnInsertar.gridy = 3;
		panel.add(btnInsertar, gbc_btnInsertar);
	}

}
