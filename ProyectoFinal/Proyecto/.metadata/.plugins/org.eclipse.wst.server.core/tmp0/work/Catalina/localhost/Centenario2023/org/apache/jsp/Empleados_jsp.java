/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-06-30 08:48:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import Entidad.Empleado;
import java.util.List;

public final class Empleados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Entidad.Empleado");
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
      out.write("    <title>Empleado</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"m-4\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-4\">\r\n");
      out.write("				<div class=\"card shadow\">\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<h4 class=\"text-center shadow\">Formulario Empleado</h4>\r\n");
      out.write("						<form action=\"Controlador?menu=Empleado\" method=\"post\">\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-6\">\r\n");
      out.write("									<div class=\"mb-2\">\r\n");
      out.write("										<label class=\"form-label\">Codigo:</label>\r\n");
      out.write("										<input type=\"text\" class=\"form-control h-50\" name=\"txtCodigo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empleadoSeleccionado.getCodEmpleado()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"codigo\" placeholder=\"Ingrese Codigo\" pattern=\"EMP-[0-9]{5}\" maxlength=\"9\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-2\">\r\n");
      out.write("								<label class=\"form-label\">Nombres:</label>\r\n");
      out.write("								<input type=\"text\" class=\"form-control h-50\" name=\"txtNombres\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empleadoSeleccionado.getNomEmpleado()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"nombres\" placeholder=\"Ingrese Nombres del Empleado\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-2\">\r\n");
      out.write("								<label class=\"form-label\">Apellidos:</label>\r\n");
      out.write("								<input type=\"text\" class=\"form-control h-50\" name=\"txtApellidos\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empleadoSeleccionado.getApeEmpleado()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"apellidos\" placeholder=\"Ingrese Apellidos del Empleado\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-6\">\r\n");
      out.write("									<div class=\"mb-2\">\r\n");
      out.write("										<label class=\"form-label\">DNI:</label>\r\n");
      out.write("										<input type=\"text\" class=\"form-control h-50\" name=\"txtDni\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empleadoSeleccionado.getDniEmpleado()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"  id=\"dni\" placeholder=\"Ingrese DNI\" pattern=\"[0-9]+\" maxlength=\"9\">>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-6\">\r\n");
      out.write("								    <div class=\"mb-2\">\r\n");
      out.write("								        <label class=\"form-label\">Cargo:</label>\r\n");
      out.write("								        <select name=\"cboCargo\" class=\"form-select\" aria-label=\"Default select example\">\r\n");
      out.write("								            <option value=\"\">Seleccione Cargo</option>\r\n");
      out.write("								            <option value=\"Administrador\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cargoSeleccionado == 'Administrador' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Administrador</option>\r\n");
      out.write("								            <option value=\"Grifero\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cargoSeleccionado == 'Grifero' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Grifero</option>\r\n");
      out.write("								        </select>\r\n");
      out.write("								    </div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-2\">\r\n");
      out.write("								<label class=\"form-label\">Correo:</label>\r\n");
      out.write("								<input type=\"email\" class=\"form-control h-50\" name=\"txtCorreo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empleadoSeleccionado.getCorreoEmpleado()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"  id=\"correo\" placeholder=\"Ingrese Correo del Empleado\" title=\"Ingrese un número decimal válido\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-2\">\r\n");
      out.write("								<label class=\"form-label\">Estación:</label>\r\n");
      out.write("								<select name=\"cboEstacion\" class=\"form-select h-50\" aria-label=\"Default select example\">\r\n");
      out.write("								  <option value=\"\">Seleccione Estacion</option>\r\n");
      out.write("								  <option value=\"Centenario Nuevo Sol\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${estacionSeleccionado == 'Centenario Nuevo Sol' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Centenario Nuevo Sol</option>\r\n");
      out.write("								  <option value=\"Centenario Progreso\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${estacionSeleccionado == 'Centenario Progreso' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Centenario Progreso</option>\r\n");
      out.write("								  <option value=\"Centenario Porongoche\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${estacionSeleccionado == 'Centenario Porongoche' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Centenario Porongoche</option>\r\n");
      out.write("								  <option value=\"Centenario Mariano Melgar\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${estacionSeleccionado == 'Centenario Mariano Melgar' ? 'selected' : ''}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Centenario Mariano Melgar</option>\r\n");
      out.write("								</select>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-6\">\r\n");
      out.write("									<div class=\"mb-2\">\r\n");
      out.write("										<label class=\"form-label\">Usuario:</label>\r\n");
      out.write("										<input type=\"text\" class=\"form-control h-50\" name=\"txtUsuario\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empleadoSeleccionado.getUsuario()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"  id=\"usuario\" placeholder=\"Asigne Usuario\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-6\">\r\n");
      out.write("									<div class=\"mb-2\">\r\n");
      out.write("										<label class=\"form-label\">Clave:</label>\r\n");
      out.write("										<input type=\"password\" class=\"form-control h-50\" name=\"txtClave\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empleadoSeleccionado.getClave()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"  id=\"clave\" placeholder=\"Asigne Clave\">\r\n");
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
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<h3 class=\"text-center shadow\">Listado Empleado</h3>\r\n");
      out.write("						");
 List<Empleado> empleado = (List<Empleado>) request.getAttribute("ListaEmpleado"); 
      out.write("\r\n");
      out.write("						<table class=\"table\">\r\n");
      out.write("							<tr class=\"text-center\">\r\n");
      out.write("								<td>Codigo</td>\r\n");
      out.write("								<td>Nombres y Apellidos</td>\r\n");
      out.write("								<td>Cargo</td>\r\n");
      out.write("								<td>DNI</td>\r\n");
      out.write("								<td>Usuario</td>\r\n");
      out.write("								<td>Acción</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							");
for(Empleado emp:empleado) { 
      out.write("\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>");
      out.print( emp.getCodEmpleado() );
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print( emp.getNomEmpleado());
      out.write(' ');
      out.print( emp.getApeEmpleado());
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print( emp.getCargo() );
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print( emp.getDniEmpleado());
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print( emp.getUsuario());
      out.write("</td>\r\n");
      out.write("								<td class=\"text-center\">\r\n");
      out.write("									<a href=\"Controlador?menu=Empleado&accion=Cargar&codigo=");
      out.print( emp.getCodEmpleado() );
      out.write("\" class=\"btn btn-warning\">\r\n");
      out.write("									<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-pencil-square\" viewBox=\"0 0 16 16\">\r\n");
      out.write("									  <path d=\"M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z\"/>\r\n");
      out.write("									  <path fill-rule=\"evenodd\" d=\"M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z\"/>\r\n");
      out.write("									</svg>\r\n");
      out.write("									</a>\r\n");
      out.write("									<a href=\"Controlador?menu=Empleado&accion=Eliminar&codigo=");
      out.print( emp.getCodEmpleado() );
      out.write("\" class=\"btn btn-danger\">\r\n");
      out.write("									<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-trash\" viewBox=\"0 0 16 16\">\r\n");
      out.write("									  <path d=\"M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5Zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5Zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6Z\"/>\r\n");
      out.write("									  <path d=\"M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1ZM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118ZM2.5 3h11V2h-11v1Z\"/>\r\n");
      out.write("									</svg>\r\n");
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
      out.write("	\r\n");
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
