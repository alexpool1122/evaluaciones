<%@page import="Entidad.Combustible"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Combustible</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
	<div class="m-4">
		<div class="row">
			<div class="col-4">
				<div class="card shadow">
					<div class="card-body">
						<h3 class="text-center shadow">Formulario Combustible</h3>
						<form action="Controlador?menu=Combustible" method="post">
							<div class="row">
								<div class="col-6">
									<div class="mb-2">
										<label class="form-label">Codigo:</label>
										<input type="text" class="form-control h-50" name="txtCodigo" value="${combustibleSeleccionado.getCodProdComb()}" id="codigo" placeholder="Ingrese Codigo">
									</div>
								</div>
								<div class="col-6">
								    <div class="mb-2">
								        <label class="form-label">Estado:</label>
								        <select name="cboEstado" class="form-select" aria-label="Default select example">
								            <option value="">Seleccione Estado</option>
								            <option value="Activo" ${estadoSeleccionado == 'Activo' ? 'selected' : ''}>Activo</option>
								            <option value="Inactivo" ${estadoSeleccionado == 'Inactivo' ? 'selected' : ''}>Inactivo</option>
								        </select>
								    </div>
								</div>
							</div>
							<div class="mb-2">
								<label class="form-label">Producto:</label>
								<select name="cboCombustible" class="form-select" aria-label="Default select example">
								  <option value="">Seleccione Combustible</option>
								  <option value="Gasohol-Regular" ${combSeleccionado == 'Gasohol-Regular' ? 'selected' : ''}>Gasohol-Regular</option>
								  <option value="Gasohol-Premium" ${combSeleccionado == 'Gasohol-Premium' ? 'selected' : ''}>Gasohol-Premium</option>
								  <option value="Diesel-B5-S50" ${combSeleccionado == 'Diesel-B5-S50' ? 'selected' : ''}>Diesel-B5-S50</option>
								  <option value="GLP" ${combSeleccionado == 'GLP' ? 'selected' : ''}>GLP</option>
								  <option value="GNV" ${combSeleccionado == 'GNV' ? 'selected' : ''}>GNV</option>
								</select>
							</div>
							<div class="row">
								<div class="col-6">
									<div class="mb-2">
										<label class="form-label">Capacidad:</label>
										<input type="text" class="form-control h-50" name="txtCapacidad" value="${combustibleSeleccionado.getCapacidad()}" id="capacidad" placeholder="Ingrese Capacidad">
									</div>
								</div>
								<div class="col-6">
									<div class="mb-2">
										<label class="form-label">Precio:</label>
										<input type="text" class="form-control h-50" name="txtPrecio" value="${combustibleSeleccionado.getPrecio()}" id="precio" placeholder="Ingrese Precio">
									</div>
								</div>
							</div>
							<div>
								<input type="submit" class="btn btn-primary" value="Registrar" name="accion" id="registrar">
								<input type="submit" class="btn btn-warning" value="Actualizar" name="accion" id="actualizar">
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="col-8">
				<div class="card shadow">
					<div class="card-body">
						<h3 class="text-center shadow">Listado Combustible</h3>
						<% List<Combustible> combustible = (List<Combustible>) request.getAttribute("ListaCombustible"); %>
						<table class="table">
							<tr>
								<td>Codigo</td>
								<td>Producto</td>
								<td>Capacidad</td>
								<td>Precio</td>
								<td>Estado</td>
								<td class="text-center">Acci�n</td>
							</tr>
							<% for (Combustible comb: combustible) {%>
							<tr>
								<td><%= comb.getCodProdComb() %></td>
								<td><%= comb.getNomComb() %></td>
								<td><%= comb.getCapacidad() %></td>
								<td><%= comb.getPrecio() %></td>
								<td><%= comb.getEstado() %></td>
								<td class="text-center">
									<a href="Controlador?menu=Combustible&accion=Cargar&codigo=<%= comb.getCodProdComb() %>" class="btn btn-warning">
										<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
										  <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
										  <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
										</svg>
									</a>
									<a href="Controlador?menu=Combustible&accion=Eliminar&codigo=<%= comb.getCodProdComb() %>" class="btn btn-danger">
										<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16">
										  <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5Zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5Zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6Z"/>
										  <path d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1ZM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118ZM2.5 3h11V2h-11v1Z"/>
										</svg>
									</a>
								</td>
							</tr>
							<%} %>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>