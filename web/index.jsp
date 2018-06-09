<%-- 
    Document   : index
    Created on : 7/06/2018, 06:26:07 PM
    Author     : adrian
--%>

<%@page import="Model.Places"%>
<%@page import="Model.Place"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS/style.css">
        <title>Paises del Mundo</title>
    </head>
    <body>
        <header>
            <h1>Algunos paises del mundo.</h1>
        </header>
        <p>Para ver los tweets has click sobre el pais que desees.</p>
        <ul id="Mundo">
            <%for (Place place : new Places()) {%>
            <li>
                <a href="TopTrends?placeName=<%=place.getName()%>" target="_blank"><%=place.getName()%></a>
            </li>
            <%}%>
        </ul>
    </body>
</html>
