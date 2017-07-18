<%-- 
    Document   : shop
    Created on : Jul 11, 2017, 11:47:20 PM
    Author     : Nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="parts/head.jsp" %>
    </head>

    <body id="shop">
        <div><%@include file="parts/header.jsp" %></div>

        <div class="wrapper">
            <div id="main-content">
                <div class="main-content top"></div>

                <div class="main-content content shop">
                    <div id="search">
                        <form action="" method="post"><!--SEARCH CONTROLLER GOES HERE-->
                            <input class="text" type="text" name="search" placeholder="Search product">
                            <input class="button" type="submit" value="Go!">
                        </form>
                    </div>

                    <h1 class="shop-title">Happy Chefs</h1>

                    <!--SEARCH RESULT GOES HERE-->


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
