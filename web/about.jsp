<%-- 
    Document   : about
    Created on : Jul 11, 2017, 12:18:06 AM
    Author     : Nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><%@include file="parts/head.jsp"%></head>

    <body id="about">
        <div><%@include file="parts/header.jsp"%></div>

        <div class="wrapper">
            <div id="main-content">
                <div class="main-content top"></div>
                <div class="main-content content articles">
                    <h1 class="about">About Happy Chefs</h1>
                </div>
            </div>

            <div id="sidebar">
                <%--<%@include file="parts/login.jsp"%>--%>

                <%@include file="parts/cart.jsp"%>

                <%@include file="parts/menu.jsp"%>
            </div>
        </div>
        <%@include file="parts/footer.jsp"%>
    </body>
</html>
