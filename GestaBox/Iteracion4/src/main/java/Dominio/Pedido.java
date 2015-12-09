package Dominio;

import java.sql.SQLException;

public class Pedido {
	
	private int id;
	private String nom;
	private int num;
	private GestorInsertarMedicamento gestor = new GestorInsertarMedicamento();
	
	public Pedido(String n, int nu) throws SQLException{
		
		id = gestor.leerMaxId()+1;
		
		nom=n;
		num=nu;
	}
	public Pedido() throws SQLException{
		id=gestor.leerMaxId()+1;
	}
	public Pedido(String n) {
		nom=n;
	}
	
	public void insertar() throws SQLException{
		gestor.insertar(this);
	}

	public String toString(){
		return id+",'"+nom+"',"+num;
	}

}
