package Dominio;

import java.sql.SQLException;

public class PedidoElim {
	private int id;
	private String nom;
	private int num;
	private GestorEliminarDelPedido gestor = new GestorEliminarDelPedido();
	
	public PedidoElim(String n, int nu) throws SQLException{
		
		id = gestor.leerMaxId()+1;
		
		nom=n;
		num=nu;
	}
	public PedidoElim() throws SQLException{
		id=gestor.leerMaxId()+1;
	}
	public PedidoElim(String n) {
		nom=n;
	}
	public void eliminar() throws SQLException{
		GestorEliminarDelPedido.eliminar(this);
	}
	public String getNom(){
		return nom;
	}
}
