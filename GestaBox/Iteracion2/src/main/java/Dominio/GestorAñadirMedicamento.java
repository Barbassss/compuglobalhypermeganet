package Dominio;

import java.sql.SQLException;

import Persistenci.AgenteBD;

public class GestorA�adirMedicamento {
	
	private static AgenteBD ag= AgenteBD.GetAgente();
	
	public static void insertar(Medicamento med) throws SQLException{
		ag.update("INSERT INTO Medicamentos VALUES('" + med.toString() + "');");
	}
}
