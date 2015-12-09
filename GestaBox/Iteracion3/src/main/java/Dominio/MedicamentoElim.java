package Dominio;

import java.sql.SQLException;

public class MedicamentoElim {
	@SuppressWarnings("unused")
	private int id,existencias;
	@SuppressWarnings("unused")
	private String nombre, compuesto, laboratorio, dosis;
	
	public MedicamentoElim(int i,int ex, String nom, String com, String lab, String dos){
		id=i;
		existencias=ex;
		nombre=nom;
		compuesto=com;
		laboratorio=lab;
		dosis=dos;
		
	}
	public MedicamentoElim(int ex, String nom, String com, String lab, String dos){
		existencias=ex;
		nombre=nom;
		compuesto=com;
		laboratorio=lab;
		dosis=dos;
		
	}
	public MedicamentoElim(String s){
		nombre=s;
	}
	public MedicamentoElim(){
	}
	public String getNom(){
		return nombre;
	}
	public void eliminar() throws SQLException{
		GestorEliminarMedicamento.eliminar(this);
	}
}
