package Mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entidad.Combustible;
import Util.ConexionBD;

public class GestionCombustible {
	ConexionBD con = new ConexionBD();
	Connection cn = null;
	PreparedStatement pstm = null;
	Statement stm = null;
	ResultSet rs = null;
	
	public List<Combustible> Listar(){
		List<Combustible> lista = new ArrayList<>();
		String mysql = "select * from productoCombustible";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				Combustible com = new Combustible();
				com.setCodProdComb(rs.getString(1));
				com.setNomComb(rs.getString(2));
				com.setCapacidad(rs.getDouble(3));
				com.setPrecio(rs.getDouble(4));
				com.setEstado(rs.getString(5));
				lista.add(com);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public void agregar(Combustible comb) throws Exception {
		String mysql = "insert into productoCombustible values(?,?,?,?,?)";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setString(1, comb.getCodProdComb());
			pstm.setString(2, comb.getNomComb());
			pstm.setDouble(3, comb.getCapacidad());
			pstm.setDouble(4, comb.getPrecio());
			pstm.setString(5, comb.getEstado());
			pstm.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Combustible listarCod(String codProdComb) {
		Combustible comb = new Combustible();
		String mysql = "select * from productoCombustible where codProdComb=?";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setString(1, codProdComb);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				comb.setCodProdComb(rs.getString(1));
				comb.setNomComb(rs.getString(2));
				comb.setCapacidad(rs.getDouble(3));
				comb.setPrecio(rs.getDouble(4));
				comb.setEstado(rs.getString(5));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return comb;
	}
	
	public void actualizar(Combustible comb) {
		String mysql = "update productoCombustible set nomComb=?, capacidad=?, precio=?, estado=? where codProdComb=?";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setString(1, comb.getNomComb());
			pstm.setDouble(2, comb.getCapacidad());
			pstm.setDouble(3, comb.getPrecio());
			pstm.setString(4, comb.getEstado());
			pstm.setString(5, comb.getCodProdComb());
			pstm.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void eliminar(String codProdComb) {
		String mysql = "delete from productoCombustible where codProdComb=?";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setString(1, codProdComb);
			pstm.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
