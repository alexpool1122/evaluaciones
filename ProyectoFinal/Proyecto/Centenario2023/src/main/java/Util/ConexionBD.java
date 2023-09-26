package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	public static Connection conectar() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/BDCentenario23";
			String usuario = "root";
			String clave = "mysql";
			
			con = DriverManager.getConnection(url,usuario,clave);
			System.out.println("Su conexion fue exitosa");
		}
		catch(ClassNotFoundException e) {
			System.out.println("No se encontro ningun Drive en su liberia" + e);
		}
		catch(SQLException ex) {
			System.out.println("No se pudo conectar con la Base de Datos" + ex);
		}
		return con;
	}
	
	public void closeConexion(Connection con) {
		try {
			con.close();
		}
		catch(Exception e) {
			System.out.println("Error al cerrar la conexion" + e);
		}
	}
}
