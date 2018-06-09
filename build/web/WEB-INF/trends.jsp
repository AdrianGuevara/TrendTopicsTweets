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
        <title>JSP Page</title>
    </head>
    <body>
        <ol type="1">
            <%for(Trend trend : (Iterable<Trend>) request.getAttribute("trends")) {%>
            <li>
                <a href="<%=trend.getURL()%>" target="_blank"><%=trend.getName()%></a>
            </li>
            <%}%>
        </ol>
        <%=request.getAttribute("errorMessage")%>
    </body>
</html>
