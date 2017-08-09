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

        <div class="wrapper">
            <div id="main-content">
                <div class="main-content top"></div>

                <div class="main-content content order">
                    <div class="cart-box">
                        <h1 class="shop-title">Cart</h1>

                        <c:choose>
                            <c:when test="${emptyCart != null}">
                                <h2 style="text-align: center;color: #F5FF06;">Your cart is empty</h2>
                            </c:when>
                            <c:when test="${success != null}">
                                <h2 style="text-align: center;color: #F5FF06;">Order placed successfully</h2><br>
                            </c:when>
                            <c:otherwise>
                                <table class="cart">
                                    <tr>
                                        <td class="cart-id"><b>Product ID</b></td>
                                        <td class="cart-name"><b>Product name</b></td>
                                        <td class="cart-number"><b>Price</b></td>
                                        <td class="cart-number"><b>Quantity</b></td>
                                        <td class="cart-number"><b>Update</b></td>
                                        <td class="cart-number"><b>Total</b></td>
                                        <td class="cart-number"><b>Remove</b></td>
                                    </tr>

                                    <c:forEach var="i" items="${cart.items}">
                                        <tr>
                                            <td>${i.product.id}</td>
                                            <td>${i.product.name}</td>
                                            <td>${i.product.priceCurrencyFormat}</td>

                                        <form id="cart-quantity" action="${pageContext.request.contextPath}/Cart?action=update" method="post">
                                            <input type="hidden" name="action" value="update">
                                            <input type="hidden" name="cartid" value="<c:out value='${i.product.id}'/>">
                                            <td><input class="cart" type="text" name="quantity" value="<c:out value='${i.cartQuantity}'/>"></td>
                                            <td><input class="btn table-inner" type="submit" value="="></td>
                                        </form>

                                        <td>${i.totalCurrencyFormat}</td>
                                        <td>
                                            <form action="${pageContext.request.contextPath}/Cart?action=remove" method="post">
                                                <input type="hidden" name="cartid" value="<c:out value='${i.product.id}'/>">
                                                <input type="hidden" name="action" value="remove">
                                                <input class="btn table-inner" type="submit" value="X">
                                            </form>
                                        </td>
                                        </tr>
                                    </c:forEach>

                                    <tr class="sum">
                                        <td colspan="4"></td>
                                        <td><b>Sum</b></td>
                                        <td><b>${invoice.invoiceTotalCurrencyFormat} €</b></td>
                                        <td></td>
                                    </tr>
                                </table>
                            </c:otherwise>
                        </c:choose>
                        <c:if test="${emptyCart == null}"> 
                            <p class="cart"><b>Time placed order: </b> ${invoice.invoiceDate}</p>
                        </c:if>
                        <a class="btn" href="shop.jsp">To shopping page</a>
                    </div>
                    <c:choose>
                        <c:when test="${sessionScope.username == null}">
                            <h1 class="shop-title">Order</h1>
                            <form action="${pageContext.request.contextPath}/Order" method="post">
                                <input type="text" name="customername" placeholder="Receiver name" required>
                                <br>
                                <input type="text" name="address" placeholder="Delivery address" required>
                                <br>
                                <input type="text" name="phone" placeholder="Phone number" required>
                                <br>
                                <form action="${pageContext.request.contextPath}/Order" method="post">
                                    <input class="btn" type="submit" value="Order now">
                                </form>
                            </form>
                        </c:when>
                        <c:otherwise>
                            <div class="usr-info-box">
                                <h2 style="text-indent: 20px; line-height: 30px">User information</h2>
                                <p>ID: <b>${id}</b></p>
                                <p>Customer name: <b>${fullname}</b></p>
                                <p>Address: <b>${address}</b></p>
                                <p>Phone number: <b>${phone}</b></p>
                                <form action="${pageContext.request.contextPath}/Order" method="post">
                                    <input class="btn" type="submit" value="Order now">
                                </form>
                                <a class="btn" href="user_conf.jsp">Change information</a>
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
