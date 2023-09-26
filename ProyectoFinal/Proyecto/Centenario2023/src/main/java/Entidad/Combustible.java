package Entidad;

public class Combustible {
	private String codProdComb;
    private String nomComb;
    private double capacidad;
    private double precio;
    private String estado;
    
	public String getCodProdComb() {
		return codProdComb;
	}
	public void setCodProdComb(String codProdComb) {
		this.codProdComb = codProdComb;
	}
	public String getNomComb() {
		return nomComb;
	}
	public void setNomComb(String nomComb) {
		this.nomComb = nomComb;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Combustible(String codProdComb, String nomComb, double capacidad, double precio, String estado) {
		this.codProdComb = codProdComb;
		this.nomComb = nomComb;
		this.capacidad = capacidad;
		this.precio = precio;
		this.estado = estado;
	}
	
	public Combustible() {

	}
}
