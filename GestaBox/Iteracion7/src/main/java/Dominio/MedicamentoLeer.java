package Dominio;

public class MedicamentoLeer {
	private int id,existencias;
	private String nombre, compuesto, laboratorio, dosis;
	
	public MedicamentoLeer(int i,int ex, String nom, String com, String lab, String dos){
		id=i;
		existencias=ex;
		nombre=nom;
		compuesto=com;
		laboratorio=lab;
		dosis=dos;
		
	}
	public MedicamentoLeer(int ex, String nom, String com, String lab, String dos){
		existencias=ex;
		nombre=nom;
		compuesto=com;
		laboratorio=lab;
		dosis=dos;
		
	}
	public MedicamentoLeer(String s){
		nombre=s;
	}
	public MedicamentoLeer(){
	}
	public String printMed(){
		return nombre + " " + existencias;
	}
}
