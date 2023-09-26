<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Inicio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

    <style>
      body{
        background: steelblue;
			  background: linear-gradient(to right, royalblue,cornflowerblue);
      }
        .my-custom-button{
            border: solid 1px white;
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
          transition: all 1s;
          margin-left: 10px;
        }
        .bg:hover{
          background-color: white;
          color: steelblue;
          border-radius: 8px;
          box-shadow:  0px 0px 10px 0px rgba(0, 0, 0, 2);
          transform: scale(1.2);
        }
    </style>
</head>
<body>
	<div class="container pt-5">
		<div class="row">
			<div class="col-sm-4 p-3" style="background: cornflowerblue; border-radius: 7px;">
				<aside>
			 		<center><h1 class=" me-0 text-white shadow" style="background-color:rgba(0, 0, 0, .5); border-radius: 10px;" id="p-hora">Hora:</h1></center>
                	<center><h1 class=" me-0 text-white shadow" style="background: rgba(0, 0, 0, .5); border-radius: 10px; font-size: 35px;" id="p-fecha">Fecha:</h1></center>
               		<div class="accordion accordion-flush" id="accordionFlushExample">
	                	<div class="accordion-item">
	                    	<h2 class="accordion-header">
	                        <button class="accordion-button collapsed fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
	                        	Historia
	                        </button>
	                      	</h2>
                      		<div id="flush-collapseOne" class="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
	                        	<div class="accordion-body">
									Somos una empresa especializada en la venta al por menor de combustibles para vehiculos automotores en comercios especializados. Fue creada y fundada el 29/04/1993, registrada dentro de las sociedades mercantiles y comerciales como una SOCIEDAD ANONIMA CERRADA.
	                        	</div>
	                      	</div>
                      	</div>
	                    <div class="accordion-item">
	                     	<h2 class="accordion-header">
	                        <button class="accordion-button collapsed fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo" aria-expanded="false" aria-controls="flush-collapseTwo">
	                        	Nuestros Valores
	                        </button>
	                      	</h2>
                			<div id="flush-collapseTwo" class="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
	                        	<div class="accordion-body">
									Es importante que nuestros clientes entiendan que a la empresa no solo le importa que se obtengan resultados, sino la manera en c�mo se obtienen. Todos los empleados deben ser �ticos entre ellos mismos, al igual que con los clientes, con los proveedores y con la competencia. La empresa espera el cumplimiento de sus normas en toda la organizaci�n y no tolerar� que los empleados logren resultados a costa de la violaci�n de las leyes.
	                        	</div>
	                      	</div>
	                    </div>
	                    <div class="accordion-item">
	                    	<h2 class="accordion-header">
	                        <button class="accordion-button collapsed fw-bold" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseThree" aria-expanded="false" aria-controls="flush-collapseThree">
	                        	Nuestras Sedes
	                        </button>
	                      	</h2>
	                      	<div id="flush-collapseThree" class="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
                        		<div class="accordion-body">
	                   				<ul>
							        	<li>Nuevo Sol</li>
							            <li>Progreso</li>
							            <li>Porongoche</li>
							            <li>Mariano Melgar</li>
							            <li>Fernandini</li>
									</ul>
                        		</div>
                      		</div>
	                    </div>
	                </div>
				</aside>
			</div>
			<div class="col-sm-8">
				<center><h1 class=" me-0 shadow text-white">Bienvenido al sistema de ELCentenario</h1></center>
                <img class="shadow" src="Img/Fondo.png" alt="" width="100%">
			</div>
		</div>
	</div>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    <script type="text/javascript">
    	reloj();
    	function reloj(){
        let fecha=new Date();

        let h=fecha.getHours();
        let m=fecha.getMinutes();
        let s=fecha.getSeconds();

        if(h>=12){h=h-12;}
        if(h<10){h="0"+h;}
        if(m<10){m="0"+m;}
        if(s<10){s="0"+s;}
		
        document.getElementById("p-hora").innerHTML="Hora: "+h+":"+m+":"+s;
        setTimeout("reloj()",1000);
    }
    let fecha=new Date();

    let d=fecha.getDate();
    let m=fecha.getMonth()+1;
    let a=fecha.getFullYear();

    if(m<10){m="0"+m;}
    if(d<10){d="0"+d;}

    document.getElementById("p-fecha").innerHTML="Fecha: "+d+"/"+m+"/"+a;
    </script>
</body>
</html>