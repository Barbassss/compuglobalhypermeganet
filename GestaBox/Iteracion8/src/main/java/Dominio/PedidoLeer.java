package Dominio;

import java.sql.SQLException;

public class PedidoLeer {
	private int id;
	private String nom;
	private int num;
	private GestorLeerPedidos gestor = new GestorLeerPedidos();
	
	public PedidoLeer(String n, int nu) throws SQLException{
		
		id = gestor.leerMaxId()+1;
		
		nom=n;
		num=nu;
	}
	public PedidoLeer() throws SQLException{
		id=gestor.leerMaxId()+1;
	}
	public PedidoLeer(String n) {
		nom=n;
	}


	public PedidoLeer[] leer() throws SQLException{
		return GestorLeerPedidos.leer();
	}
	public int getId(){
		return id;
	}
	
	public void setNom(String n){
		nom=n;
	}
	public void setCant(int c){
		num=c;
	}

	public String printPed(){
		return nom + " " + num;
	}
}
