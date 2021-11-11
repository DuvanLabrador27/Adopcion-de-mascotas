<%-- 
    Document   : GuardarMascota.jsp
    Created on : 13/10/2021, 09:38:17 PM
    Author     : duvan
--%>

<%@page import="java.util.List"%>
<%@page import="Modelo.Mascota"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Guardar Mascota</title>
    </head>
    <body>
       <div class="container">
            <h1 style="text-align: center;" class="mt-3">Lista de mascotas registradas</h1>
            <a class="btn btn-success mb-3" href="RegistroMascota.jsp">Registrar una mascota</a>
            <table id="tabla" class="table table-striped table-bordered mt-3 ">
                <thead class="thead-responsive">
                    <tr>
                        <th>Nombre</th>
                        <th>Género</th>
                        <th>Tipo Mascota</th>
                        <th>Edad</th>
                        <th>Raza</th>
                        <th>Talla</th>
                        <th>Descripción</th>
                       
                    </tr>
                </thead>
                <%
                    List<Mascota> Lista = (List<Mascota>) request.getSession().getAttribute("Lista");
                    if (Lista == null) {               
                    } else {
                        for (int i = 0; i < Lista.size(); i++) {
                %>
                <tbody>
                    <tr>
                        <td><%= Lista.get(i).getNombre() %></td>
                        <td><%= Lista.get(i).getGenero() %></td>
                        <td><%= Lista.get(i).getTipoMascota() %></td>
                        <td><%= Lista.get(i).getEdad() %></td>
                        <td><%= Lista.get(i).getRaza() %></td>
                        <td><%= Lista.get(i).getTalla() %></td>
                        <td><%= Lista.get(i).getDescripcion() %></td>
                        
                          
                    </tr>
                    <%}
                        }%>
                </tbody>
            </table>
                 <button><a href="../index.jsp">Volver</a></button>
        </div>
        
         <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    </body>
</html>
