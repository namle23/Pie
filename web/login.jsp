<%-- 
    Document   : login
    Created on : Jul 11, 2017, 9:49:45 PM
    Author     : Nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="parts/head.jsp"%>
    </head>
    <body id="register">
        <div><%@include file="parts/header.jsp"%></div>

        <div class="wrapper">
            <div id="main-content">
                <div class="main-content top"></div>

                <div class="main-content content">
                    <h1 class="login">Login</h1>
                </div>

                <form action="${pageContext.request.contextPath}/Login?action=dologin" method="post">
                    <input type="hidden" name="action" value="dologin">

                    <!--LOGIN FAIL CASE HANDLER-->

                    <input type="text" name="username" placeholder="username"><br>
                    <input type="password" name="password" placeholder="password"><br>
                    <input class="btn" type="submit" value="Login"><br>
                    <a class="btn" href="#">Forgot password?</a>
                </form>
            </div>

            <div id="sidebar">
                <%@include file="parts/cart.jsp"%>

                <%@include file="parts/menu.jsp"%>
            </div>
        </div>
        <%@include file="parts/footer.jsp"%>
    </body>
</html>
