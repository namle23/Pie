<%-- 
    Document   : cart
    Created on : Jul 11, 2017, 3:31:46 PM
    Author     : Nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="parts/head.jsp"%>
    </head>

    <body id="order">
        <div><%@include file="parts/header.jsp"%></div>

        <div class="wrapper">
            <div id="main-content">
                <div class="main-content top"></div>

                <div class="main-content content order">
                    <div class="cart-box">
                        <h1 class="shop-title">Cart</h1>
                        <!--ORDER SUCCESS PAGE AND CALCULATE GOES HERE-->
                    </div>

                    <table class="cart">
                        <tr>
                            <td class="cart-id"><b>Product code</b></td>
                            <td class="cart-name"><b>Product name</b></td>
                            <td class="cart-number"><b>Price</b></td>
                            <td class="cart-number"><b>Quantity</b></td>
                            <td class="cart-number"><b>Update</b></td>
                            <td class="cart-number"><b>Total</b></td>
                        </tr>

                        <!--ADD 2 MORE TR TO GET THE DETAIL OF THE ORDER-->
                    </table>
                </div>
            </div>

            <div id="sidebar">
                <%@include file="parts/login.jsp"%>

                <%@include file="parts/cart.jsp"%>

                <%@include file="parts/menu.jsp"%>
            </div>
        </div>
        <%@include file="parts/footer.jsp"%>
    </body>
</html>
