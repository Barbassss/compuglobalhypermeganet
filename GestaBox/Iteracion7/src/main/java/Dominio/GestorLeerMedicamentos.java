package Dominio;

import java.sql.ResultSet;
import java.sql.SQLException;

import Persistenc.AgenteBD;

public class GestorLeerMedicamentos {
	static AgenteBD ag = AgenteBD.GetAgente();

	public static MedicamentoLeer[] leerTod() throws SQLException{
		MedicamentoLeer [] matriz=new MedicamentoLeer[100];
		ResultSet res= ag.leer("SELECT * FROM Medicamentos;");
		int i=0;
		while(res.next()){
			matriz[i]=new MedicamentoLeer(res.getInt(1),res.getInt(6),res.getString(2),res.getString(3),res.getString(4),res.getString(5));
			i++;
		}
		return matriz;
	}
}
