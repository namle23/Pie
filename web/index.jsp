<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="parts/head.jsp"%>
    </head>

    <body id="index">
        <div><%@include file="parts/header.jsp"%></div>

        <div class="wrapper">
            <div id="main-content">

                <div class="main-content top"></div>

                <div class="main-content content">
                    <h1 class="new-prod">New products</h1>

                    <div class="slideshow-wrapper">
                        <div class="pin-1"></div>
                        <div id="ribbon"></div>
                        <div id="slideshow">
                            <!--add images to slideshow-->
                            <sql:setDataSource var="ds" dataSource="jdbc/dbs"></sql:setDataSource>
                            <sql:query var="result" sql="SELECT * FROM images ORDER BY id LIMIT 8" dataSource="${ds}"></sql:query>

                            <c:forEach var="img" items="${result.rows}">
                                <c:set scope="application" var="imagename" value="${img.id}_slide.${img.image_extension}"></c:set>
                                <img src="${pageContext.request.contextPath}/images/products/${imagename}">
                            </c:forEach>
                        </div>
                    </div>

                    <h1 class="articles">New articles</h1>

                    <c:forEach var="i" begin="1" end="2">
                        <div class="articles-thumb">
                            <img src="images/articles/article1_thumb.jpg" width="100" height="100">
                            <h3><a href="#">Lorem ipsum</a></h3>
                            <br>
                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed posuere interdum sem. </p>
                        </div>

                        <div class="articles-thumb">
                            <img src="images/articles/article2_thumb.jpg" width="100" height="100">
                            <h3><a href="#">Lorem ipsum</a></h3>
                            <br>
                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed posuere interdum sem. </p>
                        </div>
                    </c:forEach>
                </div>
            </div>

            <div id="sidebar">
                <%--<%@include file="parts/login.jsp"%>--%>

                <%@include file="parts/cart.jsp"%>

                <%@include file="parts/menu.jsp"%>
            </div>
        </div> <!--end wrapper-->

        <%@include file="parts/footer.jsp"%>
    </body>
</html>

<!-- SlidesJS Required: Initialize SlidesJS with a jQuery doc ready -->
<script>
    $(function () {
        $('#slideshow').slidesjs({
            width: 650,
            height: 320,
            play: {
                active: true,
                // [boolean] Generate the play and stop buttons.
                // You cannot use your own buttons. Sorry.
                effect: "slide",
                // [string] Can be either "slide" or "fade".
                interval: 7000,
                // [number] Time spent on each slide in milliseconds.
                auto: true,
                // [boolean] Start playing the slideshow on load.
                swap: true,
                // [boolean] show/hide stop and play buttons
                pauseOnHover: true,
                // [boolean] pause a playing slideshow on hover
                restartDelay: 2500
                        // [number] restart delay on inactive slideshow
            },
            slide: {
                // Slide effect settings.
                speed: 500
                        // [number] Speed in milliseconds of the slide animation.
            },
        });
    });
</script>
<!-- End SlidesJS Required -->
