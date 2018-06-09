<%-- 
    Document   : trends
    Created on : 7/06/2018, 07:12:49 PM
    Author     : adrian
--%>

<%@page import="twitter4j.Trend"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS/style.css">
        <title>Top 10 - Tweets</title>
    </head>
    <body>
        <header>
            <h1>Los 10 tweets mas usados.</h1>
        </header>
        <p>Si deseas ver un tweet en especifico has click sobre el.</p>
        <ol id="Mundo" type="1">
            <%for(Trend trend : (Iterable<Trend>) request.getAttribute("trends")) {%>
            <li>
                <a href="<%=trend.getURL()%>" target="_blank"><%=trend.getName()%></a>
            </li>
            <%}%>
        </ol>
        <%=request.getAttribute("errorMessage")%>
    </body>
</html>
