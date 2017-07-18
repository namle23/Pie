<%-- 
    Document   : user_conf
    Created on : Jul 11, 2017, 11:59:19 PM
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

    <body id="register">
        <div class="wrapper">
            <div id="main-content">
                <div class="main-content top"></div>

                <div class="main-content content">
                    <h1 class="register">Change user information</h1>

                    <!--CHANGE USER INFORMATION CODE GOES HERE-->
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
