<%-- 
    Document   : success
    Created on : 10 17, 26, 11:27:13 PM
    Author     : Vaughn
--%>

<!-- FIX THIS!! BROKEN!!! -->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Success!</title>
    </head>
    <body>
        

        <section id="backgroundBox">
            <form action="CharacterCountingServlet" method="POST">
                <div>
                    <label for="userName">Enter a random string:</label>
                    <input type="text" id="randomString" name="randomString">
                </div>
                <button id="submitbtn" type="submit">SUBMIT</button>
            </form>

            <div>
                <% if (request.getAttribute("digits") != null) { %>
                <h2>The string has a character count of:</h2>
                <ul>
                    <li>length: ${length}</li>
                    <li>digits: ${digits}</li>
                    <li>vowels: ${vowels}</li>
                    <li>symbols: ${symbols}</li>
                    <li>consonants: ${consonants}</li>
                </ul>
                <% }%>
            </div>
        </section>

    </body>
</html>
