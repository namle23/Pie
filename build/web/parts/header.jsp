<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="header">
    <div class="wrapper header">
        <div class="roof"></div>

        <a class="logo" href="index.jsp">Logo</a>
        <ul class="main-nav">
            <c:if test='${param.pre == "no"}'> <!--no login-->
                <li><a class="nav-home" href="index.php">Homepage</a></li>
                <li><a class="nav-shop" href="shop.jsp">Shop</a></li>
                <li><a class="nav-articles" href="articles.jsp">Articles</a></li>
                <li><a class="nav-about" href="about.jsp">Information</a></li>
                </c:if>

            <c:if test='${param.pre == "user"}'> <!--user logged-->
                <li><a class="nav-home" href="index.php">Homepage</a></li>
                <li><a class="nav-shop" href="shop.jsp">Shop</a></li>
                <li><a class="nav-articles" href="articles.jsp">Articles</a></li>
                <li><a class="nav-order" href="order.jsp">Order</a></li>
                <li><a class="nav-about" href="about.jsp">Information</a></li>
                </c:if>

            <c:if test='${param.pre == "admin"}'> <!--admin logged-->
                <li><a class="nav-home" href="index.php">Homepage</a></li>
                <li><a class="nav-shop" href="shop.jsp">Shop</a></li>
                <li><a class="nav-articles" href="articles.jsp">Articles</a></li>
                <li><a class="nav-order" href="order.jsp">Order</a></li>
                <li><a class="nav-admin" href="admin.jsp">Administrator</a></li>
                <li><a class="nav-about" href="about.jsp">Information</a></li>
                </c:if>
        </ul>
    </div> <!--end wrapper-->
</div>
