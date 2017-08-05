<%-- 
    Document   : order
    Created on : Jul 11, 2017, 10:33:28 PM
    Author     : Nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="parts/head.jsp" %>
    </head>

    <body id="order">

        <div><%@include file="parts/header.jsp" %></div>

        <div class="wrapper">
            <div class="main-content">
                <div class="main-content top"></div>

                <div class="main-content content order">

                    <sql:setDataSource dataSource="jdbc/dbs" var="ds" /> 

                    <jsp:useBean id="product" scope="session" class="beans.Products" />
                    <jsp:setProperty name="product" property="*" />

                    <sql:query var="display" dataSource="${ds}" sql="SELECT * FROM products WHERE id=${product.id} " />

                    <c:set scope="page" var="p" value="${display.rows[0]}"/>

                    <h1 class="shop-title">Product information</h1>

                    <div class="info-order">
                        <h2>${p.name}</h2>
                        <img src="images/products/${p.id}.jpg" alt="${p.name}" width="622" />
                        <h3>Ingredient: </h3>
                        <p>${p.ingredient}</p><br>
                        <h3>Detail: </h3>
                        <p>${p.detail}</p><br>
                        <h3>Price: ${p.price}€</h3><br>
                        <a class="btn order" href="${pageContext.request.contextPath}/Cart?action=add&cartid=${p.id}">Add to cart</a>
                    </div>
                </div>
            </div>

        </div>
        <%@include file="parts/footer.jsp"%>
    </body>
</html>
