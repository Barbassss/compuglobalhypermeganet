package Dominio;

import java.sql.ResultSet;
import java.sql.SQLException;

import persistenciaa.AgenteBD;

public class GestorEliminarDelPedido {
	public GestorEliminarDelPedido(){
	}
	public int leerMaxId() throws SQLException{

		AgenteBD ag = AgenteBD.GetAgente();
		ResultSet res= ag.leer("SELECT MAX(Id) FROM Pedido;");
		res.next();
		return res.getInt(1);	
	}

	public static void eliminar(PedidoElim ped) throws SQLException{

		AgenteBD ag = AgenteBD.GetAgente();
		ag.update("DELETE FROM Pedido WHERE Nombre_medicamento='"+ ped.getNom() +"';");
	}
}
