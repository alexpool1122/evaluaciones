package Entidad;

public class Tienda {
	private String codProdTie;
    private String nomProdTie;
    private String proveedor;
    private String categoria;
    private double precio;
    private int stock;
    
	public String getCodProdTie() {
		return codProdTie;
	}
	public void setCodProdTie(String codProdTie) {
		this.codProdTie = codProdTie;
	}
	public String getNomProdTie() {
		return nomProdTie;
	}
	public void setNomProdTie(String nomProdTie) {
		this.nomProdTie = nomProdTie;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public Tienda(String codProdTie, String nomProdTie, String proveedor, String categoria, double precio, int stock) {
		this.codProdTie = codProdTie;
		this.nomProdTie = nomProdTie;
		this.proveedor = proveedor;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}
	
	public Tienda() {

	}
}
