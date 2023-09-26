<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Iniciar Sesi�n</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body style="background: linear-gradient(to right, royalblue,steelblue)">
	<div class="container mt-5">
		<div class="row">
			<div class="col-8 mt-4">
				<div class="card shadow">
					<img src="Img/Fondo.png" alt="" width="100%">
				</div>
			</div>
			<div class="col-4">
				<div class="card">
					<div class="card-body shadow">
						<div class="text-center">
							<h3 class="text-primary"> Inicio de Sesi�n</h3>
						</div>
						<div class="text-center mt-2">
							<img class="shadow"alt="120" width="120" src="Img/usuario.png" style="border-radius: 60px;">
						</div>
						<div class="text-center">
							<h2 class="mt-2 fw-bold text-primary">Bienvenido</h2>
						</div>
						<div class="card-body shadow">
							<form method="post" action="ValidarServlet">
								<div class="mb-2">
									<label class="form-label">Usuario:</label>
									<input type="text" class="form-control h-50 shadow" name="txtUsuario" placeholder="Ingrese su Usuario">
								</div>
								<div class="mb-2">
									<label class="form-label">Clave:</label>
									<input type="password" class="form-control h-50 shadow" name="txtClave" placeholder="Ingrece su Clave">
								</div>
								<div class="text-center mb-2">
									<button type="submit" class="btn btn-primary" name="accion" value="iniciar">Iniciar Sesi�n</button>
								</div>
								<h6 class="text-center" >${msg}</h6>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>