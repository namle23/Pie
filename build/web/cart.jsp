<%-- 
    Document   : cart
    Created on : Jul 11, 2017, 3:31:46 PM
    Author     : Nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="parts/head.jsp"%>
    </head>

    <body id="order">
        <div><%@include file="parts/header.jsp"%></div>

        <sql:setDataSource dataSource="jdbc/dbs" var="ds" />


        <div class="wrapper">
            <div id="main-content">
                <div class="main-content top"></div>

                <div class="main-content content order">
                    <div class="cart-box">
                        <h1 class="shop-title">Cart</h1>

                        <table class="cart">
                            <tr>
                                <td class="cart-id"><b>Product code</b></td>
                                <td class="cart-name"><b>Product name</b></td>
                                <td class="cart-number"><b>Price</b></td>
                                <td class="cart-number"><b>Quantity</b></td>
                                <td class="cart-number"><b>Update</b></td>
                                <td class="cart-number"><b>Total</b></td>
                                <td class="cart-number"><b>Cancel</b></td>
                            </tr>

                            <c:if test="${sessionScope.cartid != null}">
                                <tr>
                                    <td>${cartid}</td>
                                    <td></td>
                                    <td></td>

                                <form id="cart-quantity" action="${pageContext.request.contextPath}/Cart?action=update&cartid=${cartid}" method="post">
                                    <td><input class="cart" type="text" value="" name="quantity"></td>
                                    <td><input class="btn table-inner" type="submit" value="="></td>
                                </form>

                                <td></td>
                                <td><a class="btn table-inner" href="${pageContext.request.contextPath}/Cart?action=remove&cartid=${cartid}">X</a></td>
                                </tr>

                                <tr class="sum">
                                    <td colspan="4"></td>
                                    <td><b>Total</b></td>
                                    <td><b>${sum}</b></td>
                                    <td></td>
                                </tr>
                            </c:if>
                        </table>

                        <a class="btn" href="${pageContext.request.contextPath}/Cart?action=empty">Empty cart</a>
                        <a class="btn" href="shop.jsp">Continue shopping</a>
                    </div>
                    <c:choose>
                        <c:when test="${sessionScope.usr_role == null}">
                            <h1 class="shop-title">Order</h1>
                            <form action="${pageContext.request.contextPath}/Order" method="post">
                                <input type="text" name="customername" placeholder="Receiver name" required>
                                <br>
                                <input type="text" name="address" placeholder="Delivery address" required>
                                <br>
                                <input type="text" name="phone" placeholder="Phone number" required>
                                <br>
                                <input class="btn" type="submit" value="Order now">
                            </form>
                        </c:when>
                        <c:otherwise>
                            <div class="usr-info-box">
                                <h2 style="text-indent: 20px; line-height: 30px">User information</h2>
                                <p>Customer name: <b>PUT NAME HERE</b></p>
                                <p>Address: <b>PUT ADDRESS</b></p>
                                <p>Phone number: <b>PHONE NUMBER</b></p>
                                <a class="btn" style="margin: 10px 20px;" href="${pageContext.request.contextPath}/Order">Order now</a>
                                <a class="btn" style="margin: 10px 0" href="user_conf.jsp">Change information</a>
                            </div>
                        </c:otherwise>
                    </c:choose>
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
