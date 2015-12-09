package Dominio;

import java.sql.SQLException;

public class Medicamento {
	private int id,existencias;
	private String nombre, compuesto, laboratorio, dosis;
	
	public Medicamento(int i,int ex, String nom, String com, String lab, String dos){
		id=i;
		existencias=ex;
		nombre=nom;
		compuesto=com;
		laboratorio=lab;
		dosis=dos;
		
	}
	public Medicamento(int ex, String nom, String com, String lab, String dos){
		existencias=ex;
		nombre=nom;
		compuesto=com;
		laboratorio=lab;
		dosis=dos;
		
	}
	public Medicamento(String s){
		nombre=s;
	}
	public Medicamento(){
	}
	
	public void insertar() throws SQLException{
		GestorAñadirMedicamento.insertar(this);
	}
	public String toString(){
		return id+"','"+nombre+"','"+compuesto+"','"+laboratorio+"','"+dosis+"','"+existencias;
	}
	
	
}
