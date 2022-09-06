<%-- 
    Document   : juegos
    Created on : 3/09/2022, 12:35:06
    Author     : TulioJimènez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setLocale value="es_GT"/>
<!DOCTYPE html>
<html>
    <head>
        <title>Game store</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="../assets/css/estilo-pantalla-inicio.css">
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css">
    </head>

    <body>
        <header>
            <jsp:include page="../WEB-INF/paginas/comunes/encabezado.jsp"/>
            <div class="img-background text-light fs-1">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-6 col-md-6">

                        </div>
                        <div class="col-12">
                            <p>Juegos</p>
                        </div>
                    </div>
                </div>
            </div>
        </header>
        <main>

            <section id="accions" class="py-4 ">
                <div class="container-fluid text-center ">
                    <div class="row ">
                        <div class="col ">
                            <a href="#" class="btn btn-primary">Agregar Juego</a>
                        </div>
                    </div>
                </div>
            </section>

            <section class="p-5" id="juegos">
                <div class="card">
                    <div class="card-header text-primary bg-dark">
                        <h4 class="text-center">Listado juegos</h4>
                    </div>
                </div>
                <div class="table-responsive">
                    <table class="table table-striped">
                        <thead class="table-dark">
                            <tr>
                                <th>ID Juego</th>
                                <th></th>
                                <th>Nombre del Juego</th>
                                <th>Fecha de Lanzamiento</th>
                                <th>Precio</th>
                                <th>Desarrolladora</th>
                                <th>Distribuidora</th>
                                <th>Genero</th>
                                <th>Editar Registros</th>
                                <th>Eliminar</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listaJuegos}" var="juego">
                                <tr>
                                    <td>${juego.id_juego}</td>
                                    <td><img src="../assets/images/${juego.nombre_juego}.png" height="80" width="100" class="d-block w-100" alt="..."></td>
                                    <td>${juego.nombre_juego}</td>
                                    <td>${juego.fecha_lanzamiento}</td>
                                    <td>${juego.precio}</td>
                                    <td>${juego.desarrolladora_id}</td>
                                    <td>${juego.distribuidora_id}</td>
                                    <td>${juego.genero_id}</td>
                                    <td><i class="fa fa-edit"></i></td>
                                    <td><i class="fa-solid fa-trash"></i></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </section>

        </main>
        <aside>

        </aside>
        <jsp:include page="../WEB-INF/paginas/comunes/pie-pagina.jsp"/>
        <script src="https://kit.fontawesome.com/04a0d4ff34.js" crossorigin="anonymous"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
    </body>

</html>
