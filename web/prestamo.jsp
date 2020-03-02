<%-- 
    Document   : prestamo
    Created on : 02-mar-2020, 19:47:24
    Author     : DAW204
--%>

<%@page import="modelo.Cuota"%>
<%@page import="modelo.PrestamoObjeto"%>
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

        <% ArrayList<String> listaTiempo = (ArrayList<String>) request.getAttribute("listaTiempo");
            PrestamoObjeto pr = (PrestamoObjeto) request.getAttribute("prestamo");
            String nombre = (String) request.getAttribute("nombre");

            String cantidad;
            String interes;
            String tiempo;
            String importePrestamo;

            if (nombre == null) {
                nombre = "";
            }

            if (pr == null) {
                importePrestamo = "";
                cantidad = "0";
                interes = "0";
                tiempo = "12";
            } else {
                importePrestamo = String.valueOf(pr.getImportePrestamo());
                cantidad = String.valueOf(pr.getCantidad());
                interes = String.valueOf(pr.getInteres());
                tiempo = String.valueOf(pr.getTiempo());
            }
        %>

        <form action="" method="post">
            Nombre: <input type="text" name="nombre" value="<%= nombre%>">
            Cantidad: <input type="text" name="cantidad" value="<%= cantidad%>">
            Interés: <input type="text" name="interes" value="<%= interes%>">

            <select name="tiempo">
                <% for (int i = 0; i < listaTiempo.size(); i++) {
                        String seleccionado = "";
                        if (tiempo.equals(listaTiempo.get(i))) {
                            seleccionado = "selected";
                        }
                %>
                <option value="<%= listaTiempo.get(i)%>" <%= seleccionado%>><%= listaTiempo.get(i)%></option>
                <% }%>
            </select>

            <input type="submit" value="Enviar">
        </form>
        <h1>El Importe total es: <%= importePrestamo%></h1>

        <table>
            <% ArrayList<Cuota> listaCuotas = (ArrayList<Cuota>) request.getAttribute("listaCuotas");
               if (listaCuotas != null) { %>
            <tr><th>NºCuota</th><th>Importe</th><th>Capital</th><th>Interés</th>

                <%
                    for (int i = 0; i < listaCuotas.size(); i++) {
                        Cuota cuota = listaCuotas.get(i);

                %>

            <tr><td><%= cuota.getNumeroCuota() %></td><td><%= cuota.getImporteCuota()%></td><td><%= cuota.getCapital() %></td><td><%= cuota.getIntereses() %></td></tr>

                <% }
                  }
                %>
        </table>
    </body>
</html>
