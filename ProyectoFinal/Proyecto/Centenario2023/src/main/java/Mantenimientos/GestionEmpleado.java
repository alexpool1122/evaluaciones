package Mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entidad.Empleado;
import Util.ConexionBD;

public class GestionEmpleado {
	ConexionBD con = new ConexionBD();
	Connection cn = null;
	PreparedStatement pstm = null;
	Statement stm = null;
	ResultSet rs = null;
	
	public Empleado validar(String usuario, String clave) {
		Empleado emp = new Empleado();
		String mysql = "select * from empleado where usuario=? and clave=?";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setString(1, usuario);
			pstm.setString(2, clave);
			rs = pstm.executeQuery();
			while(rs.next()) {
				emp.setCodEmpleado(rs.getString(1));
				emp.setNomEmpleado(rs.getString(2));
				emp.setApeEmpleado(rs.getString(3));
				emp.setDniEmpleado(rs.getString(4));
				emp.setCorreoEmpleado(rs.getString(5));
				emp.setEstacion(rs.getString(6));
				emp.setUsuario(rs.getString(7));
				emp.setClave(rs.getString(8));
				emp.setCargo(rs.getString(9));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	
	public List<Empleado> Listar(){
		List<Empleado> lista = new ArrayList<>();
		String mysql = "select * from empleado";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				Empleado emp = new Empleado();
				emp.setCodEmpleado(rs.getString(1));
				emp.setNomEmpleado(rs.getString(2));
				emp.setApeEmpleado(rs.getString(3));
				emp.setDniEmpleado(rs.getString(4));
				emp.setCorreoEmpleado(rs.getString(5));
				emp.setEstacion(rs.getString(6));
				emp.setUsuario(rs.getString(7));
				emp.setClave(rs.getString(8));
				emp.setCargo(rs.getString(9));
				lista.add(emp);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public void agregar(Empleado emp) throws Exception {
		String mysql = "insert into empleado values(?,?,?,?,?,?,?,?,?)";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setString(1, emp.getCodEmpleado());
			pstm.setString(2, emp.getNomEmpleado());
			pstm.setString(3, emp.getApeEmpleado());
			pstm.setString(4, emp.getDniEmpleado());
			pstm.setString(5, emp.getCorreoEmpleado());
			pstm.setString(6, emp.getEstacion());
			pstm.setString(7, emp.getUsuario());
			pstm.setString(8, emp.getClave());
			pstm.setString(9, emp.getCargo());
			pstm.execute();
			
			System.out.println("Se pudo resigstrar");
		}
		catch(Exception e) {
			System.out.println("Ocurrio un problema al registrar"+e);
		}
	}
	
	public Empleado listarCod(String codEmpleado) {
		Empleado emp = new Empleado();
		String mysql = "select * from empleado where codEmpleado=?";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setString(1, codEmpleado);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				emp.setCodEmpleado(rs.getString(1));
				emp.setNomEmpleado(rs.getString(2));
				emp.setApeEmpleado(rs.getString(3));
				emp.setDniEmpleado(rs.getString(4));
				emp.setCorreoEmpleado(rs.getString(5));
				emp.setEstacion(rs.getString(6));
				emp.setUsuario(rs.getString(7));
				emp.setClave(rs.getString(8));
				emp.setCargo(rs.getString(9));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	public void actualizar(Empleado emp) {
		String mysql = "update empleado set nomEmpleado=?, apeEmpleado=?, dniEmpleado=?, correoEmpleado=?, estacion=?, usuario=?, clave=?, cargo=? where codEmpleado=?";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setString(1, emp.getNomEmpleado());
			pstm.setString(2, emp.getApeEmpleado());
			pstm.setString(3, emp.getDniEmpleado());
			pstm.setString(4, emp.getCorreoEmpleado());
			pstm.setString(5, emp.getEstacion());
			pstm.setString(6, emp.getUsuario());
			pstm.setString(7, emp.getClave());
			pstm.setString(8, emp.getCargo());
			pstm.setString(9, emp.getCodEmpleado());
			pstm.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void eliminar(String codEmpleado) {
		String mysql = "delete from empleado where codEmpleado=?";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setString(1, codEmpleado);
			pstm.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
