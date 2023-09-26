package Entidad;

public class Cliente {
	private String codCliente;
	private String nomCliente;
	private String apeCliente;
	private String dniCliente;
	private String telfCliente;
	private String dirCliente;
	private String estado;
	
	public String getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}
	public String getNomCliente() {
		return nomCliente;
	}
	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}
	public String getApeCliente() {
		return apeCliente;
	}
	public void setApeCliente(String apeCliente) {
		this.apeCliente = apeCliente;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public String getTelfCliente() {
		return telfCliente;
	}
	public void setTelfCliente(String telfCliente) {
		this.telfCliente = telfCliente;
	}
	public String getDirCliente() {
		return dirCliente;
	}
	public void setDirCliente(String dirCliente) {
		this.dirCliente = dirCliente;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Cliente(String codCliente, String nomCliente, String apeCliente, String dniCliente, String telfCliente,
			String dirCliente, String estado) {
		this.codCliente = codCliente;
		this.nomCliente = nomCliente;
		this.apeCliente = apeCliente;
		this.dniCliente = dniCliente;
		this.telfCliente = telfCliente;
		this.dirCliente = dirCliente;
		this.estado = estado;
	}
	
	public Cliente() {

	}
}
