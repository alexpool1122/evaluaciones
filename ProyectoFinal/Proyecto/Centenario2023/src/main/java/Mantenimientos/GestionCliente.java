package Mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entidad.Cliente;
import Util.ConexionBD;

public class GestionCliente {
	ConexionBD con = new ConexionBD();
	Connection cn = null;
	PreparedStatement pstm = null;
	Statement stm = null;
	ResultSet rs = null;
	
	public Cliente buscarCliente(String dniCliente) {
		Cliente cli = new Cliente();
		String mysql = "select * from cliente where dniCliente="+dniCliente;
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			rs = pstm.executeQuery();
			while(rs.next()) {
				cli.setCodCliente(rs.getString(1));
				cli.setNomCliente(rs.getString(2));
				cli.setApeCliente(rs.getString(3));
				cli.setDniCliente(rs.getString(4));
				cli.setTelfCliente(rs.getString(5));
				cli.setDirCliente(rs.getString(6));
				cli.setEstado(rs.getString(7));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cli;
	}
	public List<Cliente> Listar(){
		List<Cliente> lista = new ArrayList<>();
		String mysql = "select * from cliente";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				Cliente cli = new Cliente();
				cli.setCodCliente(rs.getString(1));
				cli.setNomCliente(rs.getString(2));
				cli.setApeCliente(rs.getString(3));
				cli.setDniCliente(rs.getString(4));
				cli.setTelfCliente(rs.getString(5));
				cli.setDirCliente(rs.getString(6));
				cli.setEstado(rs.getString(7));
				lista.add(cli);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public void agregar(Cliente cli) throws Exception {
		String mysql = "insert into cliente values(?,?,?,?,?,?,?)";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setString(1, cli.getCodCliente());
			pstm.setString(2, cli.getNomCliente());
			pstm.setString(3, cli.getApeCliente());
			pstm.setString(4, cli.getDniCliente());
			pstm.setString(5, cli.getTelfCliente());
			pstm.setString(6, cli.getDirCliente());
			pstm.setString(7, cli.getEstado());
			pstm.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Cliente listarCod(String codCliente) {
		Cliente cli = new Cliente();
		String mysql = "select * from cliente where codCliente=?";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setString(1, codCliente);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				cli.setCodCliente(rs.getString(1));
				cli.setNomCliente(rs.getString(2));
				cli.setApeCliente(rs.getString(3));
				cli.setDniCliente(rs.getString(4));
				cli.setTelfCliente(rs.getString(5));
				cli.setDirCliente(rs.getString(6));
				cli.setEstado(rs.getString(7));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cli;
	}
	
	public void actualizar(Cliente cli) {
		String mysql = "update cliente set nomCliente=?, apeCliente=?, dniCliente=?, telfCliente=?, dirCliente=?, estado=? where codCliente=?";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setString(1, cli.getNomCliente());
			pstm.setString(2, cli.getApeCliente());
			pstm.setString(3, cli.getDniCliente());
			pstm.setString(4, cli.getTelfCliente());
			pstm.setString(5, cli.getDirCliente());
			pstm.setString(6, cli.getEstado());
			pstm.setString(7, cli.getCodCliente());
			pstm.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void eliminar(String codCliente) {
		String mysql = "delete from cliente where codCliente=?";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setString(1, codCliente);
			pstm.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
