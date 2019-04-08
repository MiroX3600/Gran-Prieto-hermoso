package mtto;

import Bean.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import ConectorDataBase.MySQLConexion;

public class GestionUsers {
	
	public Usuario obtenUser (Usuario us) {
		
		Usuario usuario = null;
		
		Connection co = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			co = MySQLConexion.getConexion();
			String sql = "SELECT * FROM conexionldoo.conexion where idUsername =? and idContraseña =?";
			
			pst = co.prepareStatement(sql);
			pst.setString(1, us.getIdUsername());
			pst.setString(2, us.getIdContraseña());
			
			rs=pst.executeQuery();
			
			while (rs.next()) {
				usuario = new Usuario (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
				rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString (8));
			}
			
		}catch (Exception e) {
			System.out.println ("Ups, no fue encontrado");
		}
		
		return usuario;
		
	}

}
