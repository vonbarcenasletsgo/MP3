<%-- 
    Document   : index
    Created on : 10 17, 26, 6:21:26 PM
    Author     : Vaughn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Machine Problem 3</title>
    </head>
    <body>
        
        <h1>WELCOME TO THE LOG-IN PAGE!</h1>
        <section id="box1">
        <form action="LoginServlet" method="POST">
            <div>
                <label for="userName">Name:</label>
                <input type="text" id="userName" name="userName">
            </div>

            <br>

            <div>
                <label for="password">Password:</label>
                <input type="text" id="password" name="password">
            </div>

            <br>

            <button type="submit" id="btn">Log-In</button>
        </form>
        </section>
    </body>
</html>
