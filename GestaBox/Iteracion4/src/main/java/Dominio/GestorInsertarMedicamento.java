package Dominio;

import java.sql.ResultSet;
import java.sql.SQLException;

import Pers.AgenteBD;

public class GestorInsertarMedicamento {
	
	public GestorInsertarMedicamento(){
	}
	public int leerMaxId() throws SQLException{

		AgenteBD ag = AgenteBD.GetAgente();
		ResultSet res= ag.leer("SELECT MAX(Id) FROM Pedido;");
		res.next();
		return res.getInt(1);	
	}

	public void insertar(Pedido ped) throws SQLException{

		AgenteBD ag = AgenteBD.GetAgente();
		System.out.println(ped.toString());
		ag.update("INSERT INTO Pedido VALUES(" + ped.toString() + ");");
	}
	
}
