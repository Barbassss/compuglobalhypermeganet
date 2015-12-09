package Dominio;

import java.sql.SQLException;

import persistencia.AgenteBD;

public class GestorEliminarMedicamento {
	private static AgenteBD ag= AgenteBD.GetAgente();
	
	public static void eliminar(MedicamentoElim medicamentoElim) throws SQLException{
		ag.update("DELETE FROM Medicamentos WHERE Nombre='"+ medicamentoElim.getNom() +"';");
	}
}
