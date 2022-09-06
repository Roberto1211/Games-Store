<%-- 
    Document   : suscripciones
    Created on : 3/09/2022, 09:36:30
    Author     : Luis Carlos Pérez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setLocale value="es_GT" />

<!DOCTYPE html>
<html lang="es">

    <head>
        <title>Suscripciones</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="../assets/css/estilo-pantalla-inicio.css">
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css">
    </head>

    <body>
        <header>

            <jsp:include page="../WEB-INF/paginas/comunes/encabezado.jsp"/>

        </header>
        <main>
            <section id="accions" class="py-4 ">
                <div class="container-fluid text-center ">
                    <div class="row ">
                        <div class="col ">
                            <a href="#" class="btn btn-primary">Agregar suscripción</a>
                        </div>
                    </div>
                </div>
            </section>

            <section class="p-5" id="fondo" id="suscripciones">
                <div class="card">
                    <div class="card-header text-primary bg-dark">
                        <h4 class="text-center">Listado de suscripciones</h4>
                    </div>
                </div>
                <div class="table-responsive">
                    <table class="table table-striped">
                        <thead class="table-dark">
                            <tr>
                                <th>Id</th>
                                <th>Tipo de suscripción</th>
                                <th>Editar registros</th>
                                <th>Eliminar</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${data}" var="suscripcion">
                                <tr>
                                    <td>${suscripcion.idSuscripcion}</td>
                                    <td>${suscripcion.tipoSuscripcion}</td>
                                    <td>
                                        <i class="fa fa-edit"></i>
                                    </td>
                                    <td>
                                        <i class="far fa-trash-alt"></i>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </section>
        </main>
        <jsp:include page="../WEB-INF/paginas/comunes/pie-pagina.jsp"/>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
        <script src="https://kit.fontawesome.com/04a0d4ff34.js" crossorigin="anonymous"></script>
    </body>

</html>