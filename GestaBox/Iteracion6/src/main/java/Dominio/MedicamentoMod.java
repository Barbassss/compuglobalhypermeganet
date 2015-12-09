package Dominio;

import java.sql.SQLException;

public class MedicamentoMod {
	private int id,existencias;
	private String nombre, compuesto, laboratorio, dosis;
	
	public MedicamentoMod(int i,int ex, String nom, String com, String lab, String dos){
		id=i;
		existencias=ex;
		nombre=nom;
		compuesto=com;
		laboratorio=lab;
		dosis=dos;
		
	}
	public MedicamentoMod(int ex, String nom, String com, String lab, String dos){
		existencias=ex;
		nombre=nom;
		compuesto=com;
		laboratorio=lab;
		dosis=dos;
		
	}
	public MedicamentoMod(String s){
		nombre=s;
	}
	public MedicamentoMod(){
	}

	public String getLab(){
		return laboratorio;
	}
	public String getComp(){
		return compuesto;
	}
	public String getNom(){
		return nombre;
	}
	public String getDos(){
		return dosis;
	}
	public int getUn(){
		return existencias;
	}
	public void modificar() throws SQLException{
		GestorModificarMedicamento.actualizar(this);
	}

}
