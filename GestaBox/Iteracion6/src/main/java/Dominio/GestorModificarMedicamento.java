package Dominio;

import java.sql.SQLException;

import Pesisten.AgenteBD;

public class GestorModificarMedicamento {
private static AgenteBD ag= AgenteBD.GetAgente();
	
	public static void actualizar(MedicamentoMod medicamentoMod) throws SQLException{
		ag.update("UPDATE Medicamentos SET Compuesto='" + medicamentoMod.getComp() + "',Laboratorio='"+medicamentoMod.getLab()+"',Forma_dosis='"+medicamentoMod.getDos()+"',Unidades="+medicamentoMod.getUn()+" WHERE Nombre='"+ medicamentoMod.getNom() +"';");
	}
}
