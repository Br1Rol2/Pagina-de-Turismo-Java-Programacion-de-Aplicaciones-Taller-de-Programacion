
<%@page import="controladores.ISistema"%>
<%@page import="controladores.Fabrica"%>
<%@page import="datatypes.DataUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp"%>
<%@include file="Components/bodyPrincipal.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actividades</h1>

        <%
            String[] deptos = sys.listarDepartamentos();
            String actsDepto[];
            int i = 0;
            int j = 0;
            for (String d : deptos) {
                actsDepto = sys.listarActividadesConfirmadasDeptoArreglo(d);
                if (actsDepto.length > 0) {
        %>
        <h3><%= d%></h3>
        <ul>
            <%
                j = 0;

                for (String act : actsDepto) {

            %>
            <li><span><%=act%></span> - <a href="salidasturisticas?actividad=<%=act %>">Ver salidas</a></li>
                <%
                j++;
            };%>
        </ul>
        <%i++;

                }
            }%>


    </body>

</html>

<%@include file="Components/bodyFinal.jsp"%>
