<%-- 
    Document   : prestamo
    Created on : 02-mar-2020, 19:47:24
    Author     : DAW204
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Banco Bosco</h1>
        <h2>Solicitud de préstamos</h2>
        <form action="" method="post">
            Nombre: <input type="text" name="nombre">
            Cantidad: <input type="text" name="cantidad">
            Interés: <input type="text" name="interes">
            
            <% ArrayList<String> listaTiempo = (ArrayList<String>) request.getAttribute("listaTiempo"); %>
            
            <select>
                <% for (int i = 0; i < listaTiempo.size(); i++) { %>
                <option value="<%= listaTiempo.get(i) %>"><%= listaTiempo.get(i) %></option>
                <% } %>
            </select>
        </form>
    </body>
</html>
