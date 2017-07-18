<%-- 
    Document   : register
    Created on : Jul 11, 2017, 10:40:45 PM
    Author     : Nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="parts/head.jsp" %>
    </head>

    <body>
        <div><%@include file="parts/header.jsp"%></div>

        <div class="wrapper">
            <div id="main-content">
                <div class="main-content top"></div>

                <div class="main-content content">
                    <h1 class="register">Register</h1>

                    <form class="register" action="${pageContext.request.contextPath}/Login?action=register" method="post">
                        <input type="hidden" name="action" value="register">
                        <!--VERIFY CODE GOES HERE-->

                        <p>Username</p>
                        <input type="text" name="newusername" value="${users.username}" placeholder="Pick an username"><br>
                        <p>Password</p>
                        <input type="password" name="newpassword1" placeholder="Enter password"><br>
                        <p>Re-enter password</p>
                        <input type="password" name="newpassword2" placeholder="Re-enter password"><br>
                        <p>Full name</p>
                        <input type="text" name="newfullname" value="${users.fullName}" placeholder="Full name"><br>
                        <p>Address (Default delivery address)</p>
                        <input type="text" name="newaddress" value="${users.address}" placeholder="Address">
                        <p>Phone number</p>
                        <input type="text" name="newphone" value="${users.phone}" placeholder="Phone number"><br>
                        <p><input type="checkbox" required> Done</p><br>
                        <input class="btn" type="submit" value="Register">
                    </form>
                </div>
            </div>

            <div id="sidebar">
                <%--<%@include file="parts/login.jsp"%>--%>

                <%@include file="parts/cart.jsp"%>

                <%@include file="parts/menu.jsp"%>
            </div>
        </div>
        <%@include file="parts/footer.jsp"%>
    </body>
</html>
