<%-- 
    Document   : error
    Created on : 10 17, 26, 11:13:06 PM
    Author     : Vaughn
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error!</title>
    </head>
    <body>
        <div id="backgroundBox">
            <h2>An error has occurred!</h2>
            <h3>${errorMessage}</h3>
            <form action="index.jsp">
                <button type="submit">Try Again</button>
            </form>
        </div>
    </body>
</html>
