package Pers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AgenteBD {
	
	private String cadCon="jdbc:ucanaccess://C:\\Users\\JAVIER OLIVER ASUS\\Desktop\\uni\\1º cuatrimestre (3)\\IngSoft2\\practicas\\GestaBox\\Gestabox.accdb";
	
	private Connection conn;
	private static AgenteBD instancia = null;
	
	private AgenteBD() throws Exception{
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		conn=DriverManager.getConnection(cadCon);
	}
	
	public static AgenteBD GetAgente(){
		if(instancia==null){
			try {
				instancia=new AgenteBD();
			} catch (Exception e) {
				
			}
		}
		return instancia;
	}
	public ResultSet leer(String sql) throws SQLException{
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery(sql);
		return rs;
		
	}
	public int update(String sql) throws SQLException{
		Statement s=conn.createStatement();
		int res=s.executeUpdate(sql);
		return res;
	}
}


