<%--
    Document   : shop
    Created on : Jul 11, 2017, 11:47:20 PM
    Author     : Nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
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
                        <form action="${pageContext.request.contextPath}/Shop?action=search" method="post">
                            <input type="hidden" name="action" value="search">
                            <input class="text" type="text" name="keyword" placeholder="Search product">
                            <input class="button" type="submit" value="Go!">
                        </form>
                    </div>

                    <h1 class="shop-title">Happy Chefs</h1>

                    <sql:setDataSource dataSource="jdbc/dbs" var="ds" />

                    <jsp:useBean id="product" scope="session" class="beans.Products" />
                    <jsp:setProperty name="product" property="*" />

                    <jsp:useBean id="search" scope="session" class="beans.Search" />
                    <jsp:setProperty name="search" property="*" />

                    <c:choose>
                        <c:when test="${product.type != null}">
                            <p class="prompt">Product type: <b>${product.type}</b></p>

                            <sql:query var="display" dataSource="${ds}" sql="SELECT * FROM products WHERE type = '${product.type}' " />

                            <%--display with type--%>
                            <c:if test='${product.type.equals("Cake")}'>

                                <div class="products">
                                    <c:forEach var="d" items="${display.rows}">
                                        <h3>${product.name}</h3>
                                        <a href="order.jsp?id=${d.id}">
                                            <img src="images/products/${d.id}_slide.jpg" width="580" height="190">
                                        </a>
                                        <p><b>Type: </b>${d.type}</p>
                                        <p><b>Price: </b>${d.price}€</p>
                                        <a class="detail" href="order.jsp?id=${d.id}">Detail</a>
                                        <!--<a class="cart" href="${pageContext.request.contextPath}/Order?action=add&cartid=${product.id}">Cart</a>-->
                                    </c:forEach>
                                </div>
                            </c:if>

                            <c:if test='${product.type.equals("Cup")}'>

                                <div class="products">
                                    <c:forEach var="d" items="${display.rows}">
                                        <h3>${product.name}</h3>
                                        <a href="order.jsp?id=${d.id}">
                                            <img src="images/products/${d.id}_slide.jpg" width="580" height="190">
                                        </a>
                                        <p><b>Type: </b>${d.type}</p>
                                        <p><b>Price: </b>${d.price}€</p>
                                        <a class="detail" href="order.jsp?id=${d.id}">Detail</a>
                                        <!--<a class="cart" href="${pageContext.request.contextPath}/Order?action=add&cartid=${product.id}">Cart</a>-->
                                    </c:forEach>
                                </div>
                            </c:if>
                        </c:when>

                        <%--Search function, compare keyword and show if there's matches--%>
                        <c:when test='${search.keyword != null || search.keyword.equals("")}'> <!--Display search result when search keyword is provided-->
                            <p class="prompt">Search result: <b>"${search.keyword}"</b></p> <!--Display the provided keyword-->

                            <sql:query var="results" dataSource="${ds}" sql="SELECT * FROM products WHERE name LIKE '%${search.keyword}%' "></sql:query> <!--query to db-->

                            <c:if test="${results != null}"> <!--Display search result only if result is not empty-->
                                <%--Feed the result into detail information--%>
                                <div class="products">
                                    <c:forEach var="product" items="${results.rows}">
                                        <h3>${product.name}</h3>
                                        <a href="order.jsp?id=${product.id}">
                                            <img src="images/products/${product.id}_slide.jpg" width="580" height="190">
                                        </a>
                                        <p><b>Type: </b>${product.type}</p>
                                        <p><b>Price: </b>${product.price}€</p>
                                        <a class="detail" href="order.jsp?id=${product.id}">Detail</a>
                                        <!--<a class="cart" href="${pageContext.request.contextPath}/Order?action=add&cartid=${product.id}">Cart</a>-->
                                    </c:forEach>
                                </div>
                            </c:if>

                            <c:if test="${results == null}"> <!--Empty if result is empty-->
                            </c:if>
                        </c:when>

                        <%--display general without type or search--%>
                        <c:when test="${product.type == null && search.keyword == null}">

                            <sql:query var="results" dataSource="${ds}" sql="SELECT * FROM products ORDER BY id"></sql:query>
                                <div class="products">
                                <c:forEach var="product" items="${results.rows}">
                                    <h3>${product.name}</h3>
                                    <a href="order.jsp?id=${product.id}">
                                        <img src="images/products/${product.id}_slide.jpg" width="580" height="190">
                                    </a>
                                    <p><b>Type: </b>${product.type}</p>
                                    <p><b>Price: </b>${product.price}€</p>
                                    <a class="detail" href="order.jsp?id=${product.id}">Detail</a>
                                    <!--<a class="cart" href="${pageContext.request.contextPath}/Order?action=add&cartid=${product.id}">Cart</a>-->
                                </c:forEach>
                            </div>
                        </c:when>
                    </c:choose>

                </div>

                <%--pagination --%>
                <ul class="pages-divide">
                    <c:choose>
                        <c:when test="${type !=null}">
                            <li><a class="nav-pre" href="#">Previous</a></li>
                                <c:forEach var="x" begin="1" end="8">
                                <li><a href="shop.jsp?page=${x}&type=">${x}</a></li>
                                <!--HAVE TO ADD PAGINATION HERE-->
                            </c:forEach>
                            <li><a class="nav-next" href="#">Next</a></li>
                            </c:when>

                        <c:otherwise>
                            <li><a class="nav-pre" href="#">Previous</a></li>
                                <c:forEach var="x" begin="1" end="8">
                                <li><a href="shop.jsp?page=${x}&type=">${x}</a></li>
                                <!--HAVE TO ADD PAGINATION HERE-->
                            </c:forEach>
                            <li><a class="nav-next" href="#">Next</a></li>
                            </c:otherwise>
                        </c:choose>
                </ul>

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
