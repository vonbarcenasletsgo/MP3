<%-- 
    Document   : success
    Created on : 10 17, 26, 11:27:13 PM
    Author     : Vaughn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success page</title>
    </head>
    <body>
        <h1>SUCCESS!</h1>
        <form action="CharacterCountingServlet" method="POST">
            <div>
                <label for="userName">Enter a random string:</label>
                <input type="text" id="randomString" name="randomString">
            </div>
            <button type="submit">SUBMIT</button>
        </form>
    </body>
</html>
