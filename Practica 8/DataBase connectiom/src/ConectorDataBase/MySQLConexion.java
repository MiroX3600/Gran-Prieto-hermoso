package ConectorDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConexion {

	public static Connection getConexion() {
		
		Connection c = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/conexionldoo.conexion";
			String usuario = "root";
			String contraseña = "MiroXDXDXD 3600";
			
			c = DriverManager.getConnection (url, usuario, contraseña);
			
		} catch (ClassNotFoundException e) {
			System.out.println ("Error :C");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println ("Error :C");
			e.printStackTrace();
		}
		
		return c;
	}
}