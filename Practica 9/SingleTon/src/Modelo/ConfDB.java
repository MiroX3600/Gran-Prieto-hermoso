package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import Controlador.Controlador;

public class ConfDB {
	
	private static Connection conect = null;
	private static ConfDB INSTANCE = null;
	
	private ConfDB() {
		
		try {
			
			Class.forName ("com.mysql.jdbc.Driver");
			conect = DriverManager.getConnection("jdbc:mysql://localhost/conexionsingletone.tabla1"
					+ "user=root & password=MiroXDXDXD 3600");
			System.out.println ("Conectado");
		} catch (Exception e) {
			System.out.println (e);
		}
	}
	
	public static Connection getConexion() {
		if (conect == null) {
			INSTANCE = new ConfDB();
		}
		
		return conect;
	}

}
