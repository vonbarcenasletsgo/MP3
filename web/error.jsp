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
        <title>ERROR PAGE</title>
    </head>
    <body>
        <h1>AN ERROR HAS OCCURRED</h1>
        
    <c:choose>
        <c:when test="${param.inputUsername == ''}">
            <h2>NO USERNAME WAS INPUTTED!</h2>
        </c:when>
            
        <c:when test="${param.inputPassword == ''}">
            <h2>NO PASSWORD WAS INPUTTED!</h2>
        </c:when>
            
        <c:when test="${param.inputUsername != param.validUserName}">
            <h2>NO USERNAME WAS INPUTTED!</h2>
        </c:when>
            
        <c:when test="${param.inputPassword != param.validPassword}">
            <h2>NO PASSWORD WAS INPUTTED!</h2>
        </c:when>
    </c:choose>
    </body>
</html>
