<%-- 
    Document   : articles
    Created on : Jul 11, 2017, 2:37:03 PM
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
    <body id="articles">
        <div><%@include file="parts/header.jsp"%></div>

        <div class="wrapper">
            <div id="main-content">
                <div class="main-content top"></div>

                <div class="main-content content articles">
                    <div id="search">
                        <form action="search-result.jsp">
                            <input class="text" type="text" name="search-articles" placeholder="Search articles">
                            <input class="button" type="submit" value="Search">
                        </form>
                    </div>

                    <h1 class="articles-title">Articles</h1>

                    <c:forEach var="i" begin="1" end="5">
                        <div class="articles">
                            <h3>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. </h3>
                            <img src="images/articles/article1_thumb.jpg" width="150" height="150">
                            <p class="article-time">28/09/2017 8:22pm</p>
                            <p><b>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed posuere interdum sem. Quisque ligula eros ullamcorper quis, lacinia quis facilisis sed sapien.</b></p>
                            <a class="detail" href="article-detail.jsp">Read more..</a>
                        </div>
                    </c:forEach>

                    <ul class="pages-divide">
                        <li><a class="nav-pre" href="#">Previous</a></li>

                        <c:forEach var="i" begin="1" end="9">
                            <li><a href="#">${i}</a></li>
                            </c:forEach>
                        <li><a class="nav-next" href="#">Next</a></li>
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
