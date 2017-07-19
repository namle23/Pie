<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--<c:if test="${nam}">--%>
<div class="part">
    <div class="sidebar top">
        <div class="side-content">
            <h2 class="login">Login</h2>
            <br>
            <form action="${pageContext.request.contextPath}/Account?action=dologin" method="post">
                <input type="hidden" name="action" value="dologin">

                <input type="text" name="username" placeholder="Username"><br>
                <input type="password" name="password" placeholder="Password"><br>
                <input class="btn" type="submit" value="Login">

                <p>Not a member?</p>

                <a class="btn reg" href="register.jsp">Register</a>
            </form>
        </div> 
    </div>
</div>
<%--</c:if>

<c:otherwise>
    <div class="part">
        <div class="sidebar top"></div>

        <div class="side-content">
            <h2 class="login">Hello, </h2> <!--DISPLAY USERNAME HERE-->
            <p>Your items: </p> <!--DISPLAY USER BOUGHT ITEMS-->
            <a class="btn reg" href="/Pie/ControllerLogout"></a> 
        </div>
    </div>
</c:otherwise>--%>