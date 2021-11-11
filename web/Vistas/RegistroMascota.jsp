<%-- 
    Document   : RegistroMascota.jsp
    Created on : 13/10/2021, 09:38:02 PM
    Author     : duvan
--%>

<%@page import="Modelo.Talla"%>
<%@page import="Modelo.TipoMascota"%>
<%@page import="Modelo.Genero"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Registro Mascota</title>
    </head>
    <body>
        <div class="container">
            <h1 style="text-align: center;">Registro Mascotas</h1>
            <form class="form-group" action="../ValidarMascota" method="POST">
                <label><b>Nombre</b></label>
                <input class="form-control" type="text" name="txt_nombre"  placeholder="Ejemplo: Lupita" required><br>

              
                <label><b>Género</b></label>
                <select class="form-control" name="genero" >
                   <%
                        Genero listG[] = Genero.values();
                        for (Genero dto : listG) {
                    %>
                    <option value="<%= dto.name()%>"><%= dto.toString()%></option>
                    <%}%>
                </select><br>
                
                  <label><b>Tipo Mascota</b></label>
                 <select class="form-control" name="TipoMascota" >
                   <%
                        TipoMascota listM[] = TipoMascota.values();
                        for (TipoMascota dto : listM) {
                    %>
                    <option value="<%= dto.name()%>"><%= dto.toString()%></option>
                    <%}%>
                </select><br>
                
                
                <label><b>Edad</b></label>
                <input class="form-control" type="text" name="txt_edad" placeholder="Ejemplo: 5 años" required><br>

                <label><b>Raza</b></label>
                <input class="form-control" type="text" name="txt_raza"  placeholder="Ejemplo: raza" required><br>

     

                <label><b>Talla</b></label>
                <select class="form-control" name="talla" >
                    <%
                        Talla listT[] = Talla.values();
                        for (Talla dto : listT) {
                    %>
                    <option value="<%= dto.name()%>"><%= dto.toString()%></option>
                    <%}%>
                </select><br/>
                
                <label><b>Descripción</b></label>
                <input class="form-control" type="text" name="txt_desc"  placeholder="Ejemplo: Esta es una descripción" required><br>
                
                <input class="btn btn-primary"  type="submit" name="accion" value="create">
                <input class="btn btn-primary" type="submit"  value="Volver" onClick="window.location.href = '../index.jsp'">
            </form>
        </div> 
        
         <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    </body>
</html>
