<%-- 
    Document   : index
    Created on : 7/06/2018, 06:26:07 PM
    Author     : adrian
--%>

<%@page import="Model.Countries"%>
<%@page import="Model.Country"%>
<%@page import="java.util.Collection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <%for(Country place : new Countries()) {%>
            <li><a href="TopTrends?placeName=<%=place.getName()%>" target="_blank"><%=place.getName()%></a></li>
            <%}%>
        </ul>
    </body>
</html>
