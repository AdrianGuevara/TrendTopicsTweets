<%-- 
    Document   : trends
    Created on : 7/06/2018, 07:12:49 PM
    Author     : adrian
--%>

<%@page import="twitter4j.Trend"%>
<%@page import="java.util.Collection"%>
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
            <%Collection<Trend> trends = (Collection<Trend>) request.getAttribute("trends");%>
            <%for(Trend trend : trends) {%>
            <li><a href="<%=trend.getURL()%>" target="_blank"><%=trend.getName()%></a></li>
            <%}%>
        </ul>
    </body>
</html>
