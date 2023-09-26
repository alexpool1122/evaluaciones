package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Entidad.Cliente;
import Entidad.Combustible;
import Entidad.Empleado;
import Entidad.GenerarSerie;
import Entidad.Tienda;
import Entidad.Venta;
import Mantenimientos.GestionCliente;
import Mantenimientos.GestionCombustible;
import Mantenimientos.GestionEmpleado;
import Mantenimientos.GestionTienda;
import Mantenimientos.GestionVentas;

/**
 * Servlet implementation class Controlador
 */
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }
    Empleado empleado = new Empleado();
    Cliente cliente = new Cliente();
    Combustible combustible = new Combustible();
    Tienda tienda = new Tienda();
    GestionEmpleado ge = new GestionEmpleado();
    GestionCliente gc = new GestionCliente();
    GestionCombustible gpc = new GestionCombustible();
    GestionTienda gpt = new GestionTienda();
    String codEmpleado;
    String codCliente;
    String codProdComb;
    String codProdTie;
    
    Venta venta = new Venta();
    List<Venta> listaVenta = new ArrayList<>();
    int item;
    String codC;
    String codP;
    String descripcionC;
    String descripcionP;
    double precio;
    int cant;
    double subTotal;
    double totalPagar;
    
    String numSerie;
    GestionVentas gv = new GestionVentas();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void processRequestt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String menu = request.getParameter("menu");
    	String accion = request.getParameter("accion");
		switch(menu) {
		case"Principal":
			request.getRequestDispatcher("Principal.jsp").forward(request, response);
			break;
		case"Inicio":
			request.getRequestDispatcher("Inicio.jsp").forward(request, response);
			break;
		case"Empleado":
			switch(accion) {
			case "Listar":
				List<Empleado> emp;
				try {
					emp = new GestionEmpleado().Listar();
					request.setAttribute("ListaEmpleado", emp);
					
					request.getRequestDispatcher("Empleados.jsp").forward(request, response);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case "Registrar":
				String cod = request.getParameter("txtCodigo");
				String nom = request.getParameter("txtNombres");
				String ape = request.getParameter("txtApellidos");
				String dni = request.getParameter("txtDni");
				String cor = request.getParameter("txtCorreo");
				String est = request.getParameter("cboEstacion");
				String usu = request.getParameter("txtUsuario");
				String cla = request.getParameter("txtClave");
				String car = request.getParameter("cboCargo");
				
				empleado.setCodEmpleado(cod);
				empleado.setNomEmpleado(nom);
				empleado.setApeEmpleado(ape);
				empleado.setDniEmpleado(dni);
				empleado.setCorreoEmpleado(cor);
				empleado.setEstacion(est);
				empleado.setUsuario(usu);
				empleado.setClave(cla);
				empleado.setCargo(car);
				try {
					ge.agregar(empleado);
				} catch (Exception e) {
					e.printStackTrace();
				}
				request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
				break;
			case "Actualizar":
					Empleado empleado1 = new Empleado();
					String cod1 = request.getParameter("txtCodigo");
					String nom1 = request.getParameter("txtNombres");
					String ape1 = request.getParameter("txtApellidos");
					String dni1 = request.getParameter("txtDni");
					String cor1 = request.getParameter("txtCorreo");
					String est1 = request.getParameter("cboEstacion");
					String usu1 = request.getParameter("txtUsuario");
					String cla1 = request.getParameter("txtClave");
					String car1 = request.getParameter("cboCargo");
					
					empleado1.setNomEmpleado(nom1);
					empleado1.setApeEmpleado(ape1);
					empleado1.setDniEmpleado(dni1);
					empleado1.setCorreoEmpleado(cor1);
					empleado1.setEstacion(est1);
					empleado1.setUsuario(usu1);
					empleado1.setClave(cla1);
					empleado1.setCargo(car1);
					empleado1.setCodEmpleado(cod1);
					try {
						ge.actualizar(empleado1);
					} catch (Exception e) {
						e.printStackTrace();
					}
					request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
					
				break;
			case "Cargar":
				codEmpleado = request.getParameter("codigo");
				empleado = ge.listarCod(codEmpleado);
				request.setAttribute("empleadoSeleccionado", empleado);
				
				String cargoSeleccionado;
			    if (empleado.getCargo().equals("Administrador")) {
			        cargoSeleccionado = "Administrador";
			    } else {
			        cargoSeleccionado = "Grifero";
			    }
			    request.setAttribute("cargoSeleccionado", cargoSeleccionado);
			    
			    String estacionSeleccionado;
			    if (empleado.getEstacion().equals("Centenario Nuevo Sol")) {
			        estacionSeleccionado = "Centenario Nuevo Sol";
			    }
			    else if (empleado.getEstacion().equals("Centenario Progreso")) {
			        estacionSeleccionado = "Centenario Progreso";
			    }
			    else if (empleado.getEstacion().equals("Centenario Porongoche")) {
			        estacionSeleccionado = "Centenario Porongoche";
			    }
			    else {
			        estacionSeleccionado = "Centenario Mariano Melgar";
			    }
			    request.setAttribute("estacionSeleccionado", estacionSeleccionado);
				
				request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
				break;
			case "Eliminar":
				codEmpleado = request.getParameter("codigo");
				ge.eliminar(codEmpleado);
				request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
				break;
			}
			request.getRequestDispatcher("Empleados.jsp").forward(request, response);
			break;
		case"Cliente":
			switch(accion) {
			case "Listar":
				List<Cliente> cli;
				try {
					cli = new GestionCliente().Listar();
					request.setAttribute("ListaCliente", cli);
					
					request.getRequestDispatcher("Clientes.jsp").forward(request, response);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case "Registrar":
				String codCli = request.getParameter("txtCodigo");
				String nomCli = request.getParameter("txtNombres");
				String apeCli = request.getParameter("txtApellidos");
				String dniCli = request.getParameter("txtDni");
				String telfCli = request.getParameter("txtTelefono");
				String dirCli = request.getParameter("txtDireccion");
				String estCli = request.getParameter("cboEstado");
				
				cliente.setCodCliente(codCli);
				cliente.setNomCliente(nomCli);
				cliente.setApeCliente(apeCli);
				cliente.setDniCliente(dniCli);
				cliente.setTelfCliente(telfCli);
				cliente.setDirCliente(dirCli);
				cliente.setEstado(estCli);
				try {
					gc.agregar(cliente);
				} catch (Exception e) {
					e.printStackTrace();
				}
				request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
				break;
			case "Actualizar":
				Cliente cliente1 = new Cliente();
				String cod1 = request.getParameter("txtCodigo");
				String nom1 = request.getParameter("txtNombres");
				String ape1 = request.getParameter("txtApellidos");
				String dni1 = request.getParameter("txtDni");
				String tel1 = request.getParameter("txtTelefono");
				String dir1 = request.getParameter("txtDireccion");
				String est1 = request.getParameter("cboEstado");
				
				cliente1.setNomCliente(nom1);
				cliente1.setApeCliente(ape1);
				cliente1.setDniCliente(dni1);
				cliente1.setTelfCliente(tel1);
				cliente1.setDirCliente(dir1);
				cliente1.setEstado(est1);
				cliente1.setCodCliente(cod1);
				try {
					gc.actualizar(cliente1);
				} catch (Exception e) {
					e.printStackTrace();
				}
				request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
				
				break;
			case "Cargar":
				codCliente = request.getParameter("codigo");
				cliente = gc.listarCod(codCliente);
				request.setAttribute("clienteSeleccionado", cliente);
				
				String estadoSeleccionado;
			    if (cliente.getEstado().equals("Activo")) {
			        estadoSeleccionado = "Activo";
			    } else {
			        estadoSeleccionado = "Inactivo";
			    }
			    request.setAttribute("estadoSeleccionado", estadoSeleccionado);
				
				request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
				break;
			case "Eliminar":
				codCliente = request.getParameter("codigo");
				gc.eliminar(codCliente);
				request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
				break;
			}
			request.getRequestDispatcher("Clientes.jsp").forward(request, response);
			break;
		case"Combustible":
			switch(accion) {
			case "Listar":
				List<Combustible> comb;
				try {
					comb = new GestionCombustible().Listar();
					request.setAttribute("ListaCombustible", comb);
					
					request.getRequestDispatcher("Combustible.jsp").forward(request, response);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case "Registrar":
				String codComb = request.getParameter("txtCodigo");
				String nomComb = request.getParameter("cboCombustible");
				Double capComb = Double.parseDouble(request.getParameter("txtCapacidad"));
				Double preComb = Double.parseDouble(request.getParameter("txtPrecio"));
				String estCli = request.getParameter("cboEstado");
				
				combustible.setCodProdComb(codComb);
				combustible.setNomComb(nomComb);
				combustible.setCapacidad(capComb);
				combustible.setPrecio(preComb);
				combustible.setEstado(estCli);
				try {
					gpc.agregar(combustible);
				} catch (Exception e) {
					e.printStackTrace();
				}
				request.getRequestDispatcher("Controlador?menu=Combustible&accion=Listar").forward(request, response);
				break;
			case "Actualizar":
				Combustible combUpdate = new Combustible();
				String codCombU = request.getParameter("txtCodigo");
				String nomCombU = request.getParameter("cboCombustible");
				Double capCombU = Double.parseDouble(request.getParameter("txtCapacidad"));
				Double preCombU = Double.parseDouble(request.getParameter("txtPrecio"));
				String estCliU = request.getParameter("cboEstado");
				
				combUpdate.setNomComb(nomCombU);
				combUpdate.setCapacidad(capCombU);
				combUpdate.setPrecio(preCombU);
				combUpdate.setEstado(estCliU);
				combUpdate.setCodProdComb(codCombU);
				try {
					gpc.actualizar(combUpdate);
				} catch (Exception e) {
					e.printStackTrace();
				}
				request.getRequestDispatcher("Controlador?menu=Combustible&accion=Listar").forward(request, response);
				break;
			case "Cargar":
				codProdComb = request.getParameter("codigo");
				combustible = gpc.listarCod(codProdComb);
				request.setAttribute("combustibleSeleccionado", combustible);
				
				String estadoSeleccionado;
			    if (combustible.getEstado().equals("Activo")) {
			        estadoSeleccionado = "Activo";
			    } else {
			        estadoSeleccionado = "Inactivo";
			    }
			    request.setAttribute("estadoSeleccionado", estadoSeleccionado);
			    
			    String combSeleccionado;
			    if (combustible.getNomComb().equals("Gasohol-Regular")) {
			        combSeleccionado = "Gasohol-Regular";
			    }
			    else if (combustible.getNomComb().equals("Gasohol-Premium")) {
			        combSeleccionado = "Gasohol-Premium";
			    }
			    else if (combustible.getNomComb().equals("Diesel-B5-S50")) {
			        combSeleccionado = "Diesel-B5-S50";
			    }
			    else if (combustible.getNomComb().equals("GLP")) {
			        combSeleccionado = "GLP";
			    }
			    else {
			        combSeleccionado = "GNV";
			    }
			    request.setAttribute("combSeleccionado", combSeleccionado);
				
				request.getRequestDispatcher("Controlador?menu=Combustible&accion=Listar").forward(request, response);
				break;
			case "Eliminar":
				codProdComb = request.getParameter("codigo");
				gpc.eliminar(codProdComb);
				request.getRequestDispatcher("Controlador?menu=Combustible&accion=Listar").forward(request, response);
				break;
			}
			request.getRequestDispatcher("Combustible.jsp").forward(request, response);
			break;
		case"Tienda":
			switch(accion) {
			case "Listar":
				List<Tienda> tie;
				try {
					tie = new GestionTienda().Listar();
					request.setAttribute("ListaProductos", tie);
					
					request.getRequestDispatcher("Tienda.jsp").forward(request, response);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case "Registrar":
				String codTie = request.getParameter("txtCodigo");
				String nomTie = request.getParameter("txtProducto");
				String provTie =request.getParameter("cboProveedor");
				String catTie = request.getParameter("cboCategoria");
				Double preTie = Double.parseDouble(request.getParameter("txtPrecio"));
				int stok = Integer.parseInt(request.getParameter("txtStock"));
				
				tienda.setCodProdTie(codTie);
				tienda.setNomProdTie(nomTie);
				tienda.setProveedor(provTie);
				tienda.setCategoria(catTie);
				tienda.setPrecio(preTie);
				tienda.setStock(stok);
				try {
					gpt.agregar(tienda);
				} catch (Exception e) {
					e.printStackTrace();
				}
				request.getRequestDispatcher("Controlador?menu=Tienda&accion=Listar").forward(request, response);
				break;
			case "Actualizar":
				Tienda tieUpdate = new Tienda();
				String codTieU = request.getParameter("txtCodigo");
				String nomTieU = request.getParameter("txtProducto");
				String provTieU =request.getParameter("cboProveedor");
				String catTieU = request.getParameter("cboCategoria");
				Double preTieU = Double.parseDouble(request.getParameter("txtPrecio"));
				int stokU = Integer.parseInt(request.getParameter("txtStock"));
				
				tieUpdate.setNomProdTie(nomTieU);
				tieUpdate.setProveedor(provTieU);
				tieUpdate.setCategoria(catTieU);
				tieUpdate.setPrecio(preTieU);
				tieUpdate.setStock(stokU);
				tieUpdate.setCodProdTie(codTieU);
				try {
					gpt.actualizar(tieUpdate);
				} catch (Exception e) {
					e.printStackTrace();
				}
				request.getRequestDispatcher("Controlador?menu=Tienda&accion=Listar").forward(request, response);
				break;
			case "Cargar":
				codProdTie = request.getParameter("codigo");
				tienda = gpt.listarCod(codProdTie);
				request.setAttribute("productoSeleccionado", tienda);
				
				String proSeleccionado;
			    if (tienda.getProveedor().equals("Coca Cola Company")) {
			        proSeleccionado = "Coca Cola Company";
			    }
			    else if (tienda.getProveedor().equals("ISM (Industrias San Miguel)")) {
			        proSeleccionado = "ISM (Industrias San Miguel)";
			    }
			    else if (tienda.getProveedor().equals("Socosani")) {
			        proSeleccionado = "Socosani";
			    }
			    else if (tienda.getProveedor().equals("Costa")) {
			        proSeleccionado = "Costa";
			    }
			    else {
			        proSeleccionado = "San Jorge";
			    }
			    request.setAttribute("proSeleccionado", proSeleccionado);
			    
			    String catSeleccionado;
			    if (tienda.getCategoria().equals("Gaseosas")) {
			        catSeleccionado = "Gaseosas";
			    }
			    else if (tienda.getCategoria().equals("Agua Mineral")) {
			        catSeleccionado = "Agua Mineral";
			    }
			    else if (tienda.getCategoria().equals("Energizantes")) {
			        catSeleccionado = "Energizantes";
			    }
			    else if (tienda.getCategoria().equals("Jugos")) {
			        catSeleccionado = "Jugos";
			    }
			    else {
			        catSeleccionado = "Galletas";
			    }
			    request.setAttribute("catSeleccionado", catSeleccionado);
				
				request.getRequestDispatcher("Controlador?menu=Tienda&accion=Listar").forward(request, response);
				break;
			case "Eliminar":
				codProdTie = request.getParameter("codigo");
				gpt.eliminar(codProdTie);
				request.getRequestDispatcher("Controlador?menu=Tienda&accion=Listar").forward(request, response);
				break;
			}
			request.getRequestDispatcher("Tienda.jsp").forward(request, response);
			break;
		case"Venta":
			switch(accion) {
			case "BuscarCliente":
				String dniCliente = request.getParameter("txtDniCliente");
				cliente = gc.buscarCliente(dniCliente);
				request.setAttribute("cliente",cliente);
				break;
			case "BuscarCombustible":
				codProdComb = request.getParameter("txtCodigo");
				combustible = gpc.listarCod(codProdComb);
				request.setAttribute("TotalPagar", totalPagar);
				request.setAttribute("ListaVentaC", listaVenta);
				request.setAttribute("combustible", combustible);
				request.setAttribute("cliente",cliente);
				break;
			case"BuscarProducto":
				codProdTie = request.getParameter("txtCodPro");
				tienda = gpt.listarCod(codProdTie);
				request.setAttribute("TotalPagar", totalPagar);
				request.setAttribute("ListaVentaC", listaVenta);
				request.setAttribute("producto", tienda);
				request.setAttribute("cliente",cliente);
				break;
			case "AgregarCombustible":
				totalPagar = 0.0;
				item = item+1;
				codC = combustible.getCodProdComb();
				descripcionP = request.getParameter("txtCombustible");
				precio = Double.parseDouble(request.getParameter("txtPrecio"));
				cant = Integer.parseInt(request.getParameter("txtCantidad"));
				subTotal = precio*cant;
				
				venta = new Venta();
				
				venta.setItem(item);
				venta.setCodProdComb(codC);
				venta.setDescripcion(descripcionP);
				venta.setPrecio(precio);
				venta.setCantidad(cant);
				venta.setSubTotal(subTotal);
				listaVenta.add(venta);
				for(int i = 0; i < listaVenta.size(); i++) {
					totalPagar = totalPagar + listaVenta.get(i).getSubTotal();
				}
				request.setAttribute("TotalPagar", totalPagar);
				request.setAttribute("ListaVentaC", listaVenta);
				request.setAttribute("cliente",cliente);
				
				break;
			case "AgregarProducto":
				totalPagar = 0.0;
				item = item+1;
				codP = tienda.getCodProdTie();
				descripcionP = request.getParameter("txtProducto");
				precio = Double.parseDouble(request.getParameter("txtPrecioProducto"));
				cant = Integer.parseInt(request.getParameter("txtCantidadProducto"));
				subTotal = precio*cant;
				
				venta = new Venta();
				
				venta.setItem(item);
				venta.setCodProdTie(codP);
				venta.setDescripcion(descripcionP);
				venta.setPrecio(precio);
				venta.setCantidad(cant);
				venta.setSubTotal(subTotal);
				listaVenta.add(venta);
				for(int i = 0; i < listaVenta.size(); i++) {
					totalPagar = totalPagar + listaVenta.get(i).getSubTotal();
				}
				request.setAttribute("TotalPagar", totalPagar);
				request.setAttribute("ListaVenta", listaVenta);
				request.setAttribute("cliente",cliente);
				
				break;
				
			case "QuitarProducto":
				String itemParam = request.getParameter("item");
			    
			    if (itemParam != null && !itemParam.isEmpty()) {
			        int index = Integer.parseInt(itemParam);
			        
			        if (index >= 0 && index < listaVenta.size()) {
			            Venta ventaRemovida = listaVenta.remove(index);
			            totalPagar -= ventaRemovida.getSubTotal();

			            for (int i = 0; i < listaVenta.size(); i++) {
			                listaVenta.get(i).setItem(i + 1);
			            }
			        }
			    }
			    request.setAttribute("TotalPagar", totalPagar);
			    request.setAttribute("ListaVenta", listaVenta);
			    request.setAttribute("cliente", cliente);
				break;
			
			case "GenerarVenta":
				for(int i=0; i<listaVenta.size(); i++) {
					Tienda proti = new Tienda();
					int cantidad = listaVenta.get(i).getCantidad();
					String codProdTie = listaVenta.get(i).getCodProdTie();
					
					GestionTienda gt = new GestionTienda();
					proti = gt.buscar(codProdTie);
					int sat = proti.getStock()-cantidad;
					gt.actualizarStock(codProdTie, sat);
				}
				
				venta.setCodCliente(cliente.getCodCliente());
				venta.setCodEmpleado("EMP-00002");
				venta.setNumSerie(numSerie);
				venta.setMontoTotal(totalPagar);
				gv.GuargarVenta(venta);
				
				int codB = Integer.parseInt(gv.codBoleta());
				for(int i = 0; i < listaVenta.size(); i++) {
					venta = new Venta();
					venta.setCodBoleta(codB);
					venta.setCodProdComb(listaVenta.get(i).getCodProdComb());
					venta.setCodProdTie(listaVenta.get(i).getCodProdTie());
					venta.setCantidad(listaVenta.get(i).getCantidad());
					venta.setPrecio(listaVenta.get(i).getPrecio());
					gv.GuardadDetalle(venta);
				}
				
				venta = new Venta();
				listaVenta = new ArrayList<>();
				item = 0;
				totalPagar = 0.0;
				break;
			case "Cancelar":
				venta = new Venta();
				listaVenta = new ArrayList<>();
				item = 0;
				totalPagar = 0.0;
				break;
			default:
					venta = new Venta();
					listaVenta = new ArrayList<>();
					item = 0;
					totalPagar = 0.0;
					
					numSerie = gv.GenerarCodigo();
					if(numSerie == null) {
						numSerie ="000001";
						request.setAttribute("nSerie", numSerie);
					}
					else {
						int incremetar = Integer.parseInt(numSerie);
						GenerarSerie gs = new GenerarSerie();
						numSerie = gs.NumSerie(incremetar);
						request.setAttribute("nSerie", numSerie);
					}
					request.getRequestDispatcher("Ventas.jsp").forward(request, response);
			}
			request.setAttribute("nSerie", numSerie);
			request.getRequestDispatcher("Ventas.jsp").forward(request, response);
		}
		
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	processRequestt(request, response);
    	//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequestt(request, response);
	}

}
