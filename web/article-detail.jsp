<%--
    Document   : article-detail
    Created on : Jul 11, 2017, 2:13:53 PM
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

                <div class="main-content content article-detail">
                    <div class="intro-box">
                        <h1 class="article-title">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</h1>
                        <img class="thumb-img" src="images/articles/article1_thumb.jpg" width="100" height="100">
                        <p class="article-time">11/11/2017 8:00am</p>
                        <p><b>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In purus orci, lacinia in ullamcorper sit amet, hendrerit id velit. In luctus luctus rutrum. </b></p>
                    </div>

                    <div class="content-box">
                        <p>In sagittis orci eget sapien hendrerit semper. Vivamus elit est, cursus a ipsum nec, ullamcorper eleifend urna. Proin dignissim accumsan bibendum.</p>
                        <img src="images/articles/article11.jpg" width="590">
                        <br><br>
                        Vivamus pellentesque pharetra erat, ac pretium magna porttitor et. In sit amet malesuada purus. Donec cursus massa ipsum, vitae mattis orci tempor et.
                        <br><br>
                        Aliquam id quam rutrum, bibendum ligula non, semper neque. Vivamus tempus aliquam dolor eget fermentum. Vestibulum ac sodales neque.
                        <br><br>
                        Vivamus pellentesque pharetra erat, ac pretium magna porttitor et. In sit amet malesuada purus. Donec cursus massa ipsum, vitae mattis orci tempor et.
                        <br><br>
                        Aliquam id quam rutrum, bibendum ligula non, semper neque. Vivamus tempus aliquam dolor eget fermentum. Vestibulum ac sodales neque.
                        <br><br>
                        <p class="article-source">Lorem ipsum</p>
                    </div>

                    <c:if test="${username != null}">
                        <div>
                            <form action="${pageContext.request.contextPath}/Account?action=docomment" method="post" enctype="multipart/form-data">
                                <p class="prompt">${message}</p>
                                <input type="hidden" name="action" value="docomment">
                                <textarea name="comment" rows="4" cols="60" placeholder="Enter your comment here"></textarea><br><br>
                                <input type="file" name="photo" accept="image/*" size="50"/><br>
                                <input class="btn" type="submit" value="Post"><br>
                            </form><br>
                        </div>
                    </c:if>
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
