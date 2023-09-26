package Mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Entidad.Venta;
import Util.ConexionBD;

public class GestionVentas {
	ConexionBD con = new ConexionBD();
	Connection cn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	int r;
	
	public String GenerarCodigo() {
		String numSerie = "";
		String mysql = "select max(numSerie) from boleta";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			rs = pstm.executeQuery();
			while(rs.next()) {
				numSerie = rs.getString(1);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return numSerie;
	}
	public String codBoleta() {
		String codBoleta = "";
		String mysql = "select max(codBoleta) from boleta";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			rs = pstm.executeQuery();
			while(rs.next()) {
				codBoleta = rs.getString(1);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return codBoleta;
	}
	public int GuargarVenta(Venta v) {
		String mysql= "insert into boleta (codCliente, codEmpleado, numSerie, montoTotal) values (?,?,?,?)";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setString(1, v.getCodCliente());
			pstm.setString(2, v.getCodEmpleado());
			pstm.setString(3, v.getNumSerie());
			pstm.setDouble(4, v.getMontoTotal());
			pstm.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
	
	public int GuardadDetalle(Venta ve) {
		String mysql = "insert into detalleVenta(codBoleta, codProdTie, codProdComb, cantidad, precioVenta)values(?,?,?,?,?)";
		try {
			cn = con.conectar();
			pstm = cn.prepareStatement(mysql);
			pstm.setInt(1, ve.getCodBoleta());
			pstm.setString(2, ve.getCodProdTie());
			pstm.setString(3, ve.getCodProdComb());
			pstm.setInt(4, ve.getCantidad());
			pstm.setDouble(5, ve.getPrecio());
			pstm.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return r;
	}
}
