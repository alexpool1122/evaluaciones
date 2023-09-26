<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>ELCentenario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

    <style>
      body{
        background: steelblue;
			  background: linear-gradient(to right, royalblue,cornflowerblue);
      }
        .my-custom-button{
            /*border: solid 1px white;*/
            background: steelblue;
            color: white;
        }
        .my-custom-button:hover{
            border: solid 1px steelblue;
            background: white;
            color: steelblue;
            box-shadow: 0 0 10px 0 rgba(0, 0, 0, 2);
        }
        .pl{
          padding-left: 10px;
        }
        .nav{
          background: steelblue;
          color: white;
        }
        .bg{
          background-color: steelblue;
          color: white;
          transition: all 0.5s;
          margin-left: 10px;
        }
        .bg:hover{
          background-color: white;
          color: steelblue;
          border-radius: 5px;
          box-shadow:  0px 0px 10px 0px rgba(0, 0, 0, 2);
        }
    </style>
</head>
<body>
	<nav class="navbar navbar-expand-lg nav" >
		<div class="container-fluid"> 
			<a class="navbar-brand" style="color: white; font-weight: bold;" href="Controlador?menu=Inicio" target="myframe">ELCentenario</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            	<span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse">
            	<ul class="navbar-nav me-auto mb-2 mb-lg-0 shadow">
					<li class="nav-item">
                    	<a class="nav-link bg" aria-current="page" href="Controlador?menu=Inicio" target="myframe">Inicio</a>
                  	</li>
                  	<li class="nav-item">
                    	<a class="nav-link bg" aria-current="page" href="Controlador?menu=Empleado&accion=Listar" target="myframe">Empleados</a>
                  	</li>
                  	<li class="nav-item">
                    	<a class="nav-link bg" aria-current="page" href="Controlador?menu=Cliente&accion=Listar" target="myframe">Clientes</a>
                  	</li>
                  	<li class="nav-item">
                    	<a class="nav-link bg" aria-current="page" href="Controlador?menu=Combustible&accion=Listar" target="myframe">Combustible</a>
                  	</li>
                  	<li class="nav-item">
                    	<a class="nav-link bg" aria-current="page" href="Controlador?menu=Tienda&accion=Listar" target="myframe">Tienda</a>
                  	</li>
                  	<li class="nav-item">
                    	<a class="nav-link bg" aria-current="page" href="Controlador?menu=Venta&accion=default" target="myframe">Ventas</a>
                  	</li>
                </ul>
                <div class="dropdown shadow">
				  <button class="btn my-custom-button dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
				  	${empleado.getNomEmpleado()} ${empleado.getApeEmpleado()}
				  </button>
				  <ul class="dropdown-menu text-center">
				    <li><a class="dropdown-item" href="#">
				    	<img alt="100" width="100" src="Img/usuario.png">
				    </a></li>
				    <li><a class="dropdown-item" href="#">${empleado.getNomEmpleado()} <br> ${empleado.getApeEmpleado()}</a></li>
				    <li><a class="dropdown-item" href="#">${empleado.getCorreoEmpleado()}</a></li>
				    <li><div class="dropdown-divider"></div></li>
				    <li class="shadow">
						<form action="ValidarServlet" method="post">
							<button class="btn btn-danger" type="submit" name="accion" value="salir">Cerrar Sesión</button>
						</form>
				    </li>
				  </ul>
				</div>
			</div>
		</div>
    </nav>
    <div class="text-center d-flex raw">
    	<div class="col-4"></div>
	  	<div class="col-4">
	  			${bienvenido}
  		</div>
	</div>
    <div class="m-4 shadow" style="height: 535px;">
   		<iframe src="Inicio.jsp" name="myframe" style="height:100%; width: 100%; border-radius: 10px;"></iframe>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>