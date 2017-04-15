<%-- 
    Document   : busca
    Created on : 14/04/2017, 13:24:04
    Author     : DeivisondeOliveira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Resultados da busca pelo nome <b>"${nome}"</b></h3>
        <%@include file="lista.jsp" %>
    </body>
</html>
