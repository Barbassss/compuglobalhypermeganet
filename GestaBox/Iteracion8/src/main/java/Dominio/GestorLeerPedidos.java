package Dominio;

import java.sql.ResultSet;
import java.sql.SQLException;

import persis.AgenteBD;

public class GestorLeerPedidos {
	public GestorLeerPedidos(){
	}
	public int leerMaxId() throws SQLException{

		AgenteBD ag = AgenteBD.GetAgente();
		ResultSet res= ag.leer("SELECT MAX(Id) FROM Pedido;");
		res.next();
		return res.getInt(1);	
	}
	public static PedidoLeer[] leer() throws SQLException{

		AgenteBD ag = AgenteBD.GetAgente();
		ResultSet res= ag.leer("SELECT * FROM Pedido;");
		PedidoLeer [] matriz = new PedidoLeer[10];
		int i = 0;
		while(res.next()){
			matriz[i]=new PedidoLeer(res.getString(2), res.getInt(3));
			i++;
		}
		return matriz;
	}
	public static void enviarPedido() throws SQLException{
		AgenteBD ag = AgenteBD.GetAgente();
		int res= ag.update("DELETE FROM Pedido");
	}
	
}
