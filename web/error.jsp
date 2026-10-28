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
        <div id="msg">
        <h1>AN ERROR HAS OCCURRED!</h1>
        <h2>${errorMessage}</h2>
        </div>
    </body>
</html>
