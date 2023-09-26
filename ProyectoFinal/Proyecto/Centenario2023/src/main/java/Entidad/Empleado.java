package Entidad;

public class Empleado {
	private String codEmpleado;
	private String nomEmpleado;
	private String apeEmpleado;
	private String dniEmpleado;
	private String correoEmpleado;
	private String estacion;
	private String usuario;
	private String clave;
	private String cargo;
	
	public String getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	public String getNomEmpleado() {
		return nomEmpleado;
	}
	public void setNomEmpleado(String nomEmpleado) {
		this.nomEmpleado = nomEmpleado;
	}
	public String getApeEmpleado() {
		return apeEmpleado;
	}
	public void setApeEmpleado(String apeEmpleado) {
		this.apeEmpleado = apeEmpleado;
	}
	public String getDniEmpleado() {
		return dniEmpleado;
	}
	public void setDniEmpleado(String dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}
	public String getCorreoEmpleado() {
		return correoEmpleado;
	}
	public void setCorreoEmpleado(String correoEmpleado) {
		this.correoEmpleado = correoEmpleado;
	}
	public String getEstacion() {
		return estacion;
	}
	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public Empleado(String codEmpleado, String nomEmpleado, String apeEmpleado, String dniEmpleado,
			String correoEmpleado, String estacion, String usuario, String clave, String cargo) {
		this.codEmpleado = codEmpleado;
		this.nomEmpleado = nomEmpleado;
		this.apeEmpleado = apeEmpleado;
		this.dniEmpleado = dniEmpleado;
		this.correoEmpleado = correoEmpleado;
		this.estacion = estacion;
		this.usuario = usuario;
		this.clave = clave;
		this.cargo = cargo;
	}
	
	public Empleado() {
	
	}
}
