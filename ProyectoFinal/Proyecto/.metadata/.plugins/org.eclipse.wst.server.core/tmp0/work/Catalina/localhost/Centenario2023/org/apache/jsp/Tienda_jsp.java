/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-06-30 04:04:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import Entidad.Tienda;
import java.util.List;

public final class Tienda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Entidad.Tienda");
    _jspx_imports_classes.add("java.util.List");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Tienda</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"m-4\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<div class=\"card shadow\">\r\n");
      out.write("					<div class=\"card-body shadow\">\r\n");
      out.write("						<h3 class=\"text-center shadow\">Formulario Tienda</h3>\r\n");
      out.write("						<form action=\"Controlador?menu=Tienda\" method=\"post\">\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-6\">\r\n");
      out.write("									<div class=\"mb-2\">\r\n");
      out.write("										<label class=\"form-label\">Codigo:</label>\r\n");
      out.write("										<input type=\"text\" class=\"form-control h-50\" name=\"txtCodigo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productoSeleccionado.getCodProdTie()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"codigo\" placeholder=\"Ingrese Codigo\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-2\">\r\n");
      out.write("								<label class=\"form-label\">Producto:</label>\r\n");
      out.write("								<input type=\"text\" class=\"form-control h-50\" name=\"txtProducto\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productoSeleccionado.getNomProdTie()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"producto\" placeholder=\"Ingrese Producto a Ingresar\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-2\">\r\n");
      out.write("								<label class=\"form-label\">Proveedor:</label>\r\n");
      out.write("								<select name=\"cboProveedor\" class=\"form-select\" aria-label=\"Default select example\">\r\n");
      out.write("								  <option value=\"\">Seleccione Proveedor</option>\r\n");
      out.write("  								  <option value=\"Coca Cola Company\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${proSeleccionado == 'Coca Cola Company' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Coca Cola Company</option>\r\n");
      out.write("  								  <option value=\"ISM (Industrias San Miguel)\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${proSeleccionado == 'ISM (Industrias San Miguel)' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">ISM (Industrias San Miguel)</option>\r\n");
      out.write("  								  <option value=\"Socosani\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${proSeleccionado == 'Socosani' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Socosani</option>\r\n");
      out.write("  								  <option value=\"Costa\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${proSeleccionado == 'Costa' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Costa</option>\r\n");
      out.write("  								  <option value=\"San Jorge\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${proSeleccionado == 'San Jorge' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">San Jorge</option>\r\n");
      out.write("								</select>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-6\">\r\n");
      out.write("									<div class=\"mb-2\">\r\n");
      out.write("										<label class=\"form-label\">Categoria:</label>\r\n");
      out.write("										<select name=\"cboCategoria\" class=\"form-select\" aria-label=\"Default select example\">\r\n");
      out.write("										  <option value=\"\">Seleccione Categoria</option>\r\n");
      out.write("										  <option value=\"Gaseosas\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${catSeleccionado == 'Gaseosas' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Gaseosas</option>\r\n");
      out.write("										  <option value=\"Agua Mineral\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${catSeleccionado == 'Agua Mineral' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Agua Mineral</option>\r\n");
      out.write("										  <option value=\"Energizantes\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${catSeleccionado == 'Energizantes' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Energizantes</option>\r\n");
      out.write("										  <option value=\"Jugos\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${catSeleccionado == 'Jugos' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Jugos</option>\r\n");
      out.write("										  <option value=\"Galletas\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${catSeleccionado == 'Galletas' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Galletas</option>\r\n");
      out.write("										</select>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-6\">\r\n");
      out.write("									<div class=\"row\">\r\n");
      out.write("										<div class=\" col-6 mb-2\">\r\n");
      out.write("											<label class=\"form-label\">Precio:</label>\r\n");
      out.write("											<input type=\"text\" class=\"form-control h-50\" name=\"txtPrecio\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productoSeleccionado.getPrecio()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"precio\" placeholder=\"Precio\">\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\" col-6 mb-2\">\r\n");
      out.write("											<label class=\"form-label\">Stock:</label>\r\n");
      out.write("											<input type=\"text\" class=\"form-control h-50\" name=\"txtStock\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productoSeleccionado.getStock()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"stock\" placeholder=\"Stock\">\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div>\r\n");
      out.write("								<input type=\"submit\" class=\"btn btn-primary\" value=\"Registrar\" name=\"accion\" id=\"registrar\">\r\n");
      out.write("								<input type=\"submit\" class=\"btn btn-warning\" value=\"Actualizar\" name=\"accion\" id=\"actualizar\">\r\n");
      out.write("							</div>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-8\">\r\n");
      out.write("				<div class=\"card shadow\">\r\n");
      out.write("					<div class=\"card-body shadow\">\r\n");
      out.write("						<h3 class=\"text-center shadow\">Listado Tienda</h3>\r\n");
      out.write("						");
 List<Tienda> tienda = (List<Tienda>) request.getAttribute("ListaProductos"); 
      out.write("\r\n");
      out.write("						<table class=\"table\">\r\n");
      out.write("							<tr class=\"text-center\">\r\n");
      out.write("								<td>Codigo</td>\r\n");
      out.write("								<td>Producto</td>\r\n");
      out.write("								<td>Proveedor</td>\r\n");
      out.write("								<td>Categoria</td>\r\n");
      out.write("								<td>Precio</td>\r\n");
      out.write("								<td>Stock</td>\r\n");
      out.write("								<td>Acción</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							");
 for (Tienda tie: tienda) {
      out.write("\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>");
      out.print( tie.getCodProdTie() );
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print( tie.getNomProdTie() );
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print( tie.getProveedor() );
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print( tie.getCategoria());
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print( tie.getPrecio());
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print( tie.getStock() );
      out.write("</td>\r\n");
      out.write("								<td class=\"text-center\">\r\n");
      out.write("									<a href=\"Controlador?menu=Tienda&accion=Cargar&codigo=");
      out.print( tie.getCodProdTie() );
      out.write("\" class=\"btn btn-warning\">\r\n");
      out.write("										<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-pencil-square\" viewBox=\"0 0 16 16\">\r\n");
      out.write("										  <path d=\"M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z\"/>\r\n");
      out.write("										  <path fill-rule=\"evenodd\" d=\"M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z\"/>\r\n");
      out.write("										</svg>\r\n");
      out.write("									</a>\r\n");
      out.write("									<a href=\"Controlador?menu=Tienda&accion=Eliminar&codigo=");
      out.print( tie.getCodProdTie() );
      out.write("\" class=\"btn btn-danger\">\r\n");
      out.write("										<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-trash\" viewBox=\"0 0 16 16\">\r\n");
      out.write("										  <path d=\"M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5Zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5Zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6Z\"/>\r\n");
      out.write("										  <path d=\"M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1ZM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118ZM2.5 3h11V2h-11v1Z\"/>\r\n");
      out.write("										</svg>\r\n");
      out.write("									</a>\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							");
} 
      out.write("\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}