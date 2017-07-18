<%-- 
    Document   : index
    Created on : Jul 10, 2017, 4:04:10 PM
    Author     : Nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator</title>
        <link rel="stylesheet" type="text/css" href="css/login.css" media="screen">
    </head>
    <body>
        <div class="wrap">
            <div id="content">
                <div id="main">
                    <div class="full_w">
                        <form action="" method="post">
                            <label for="login">Username:</label>
                            <input id="login" name="login" class="text">
                            <label for="pass">Password:</label>
                            <input id="pass" name="pass" type="password" class="text">
                            <div class="sep"></div>
                            <button type="submit" class="ok">Login</button> <a class="button" href="#">Forgot password</a>
                        </form>
                    </div>
                    <div class="footer">&raquo; <a href="#"></a> Admin panel </div> <!--add admin panel-->
                </div>
            </div>
        </div>
    </body>
</html>
