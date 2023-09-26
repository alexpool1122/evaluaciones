package Entidad;

public class Venta {
	private int codBoleta;
	private int item;
	private String codCliente;
	private String codEmpleado;
	private String codProdComb;
	private String codProdTie;
	private String numSerie;
	private String descripcion;
	private String fecha;
	private double precio;
	private int cantidad;
	private double subTotal;
	private double montoTotal;
	private String estado;
	
	public int getCodBoleta() {
		return codBoleta;
	}
	public void setCodBoleta(int codBoleta) {
		this.codBoleta = codBoleta;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public String getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}
	public String getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	public String getCodProdComb() {
		return codProdComb;
	}
	public void setCodProdComb(String codProdComb) {
		this.codProdComb = codProdComb;
	}
	public String getCodProdTie() {
		return codProdTie;
	}
	public void setCodProdTie(String codProdTie) {
		this.codProdTie = codProdTie;
	}
	public String getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Venta(int codBoleta, int item, String codCliente, String codEmpleado, String codProdComb,
			String codProdTie, String numSerie, String descripcion, String fecha, double precio, int cantidad,
			double subTotal, double montoTotal, String estado) {
		this.codBoleta = codBoleta;
		this.item = item;
		this.codCliente = codCliente;
		this.codEmpleado = codEmpleado;
		this.codProdComb = codProdComb;
		this.codProdTie = codProdTie;
		this.numSerie = numSerie;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.precio = precio;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
		this.montoTotal = montoTotal;
		this.estado = estado;
	}
	
	public Venta() {

	}
}