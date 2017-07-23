<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<div class="part">
    <div class="sidebar top"></div>

    <div class="side-content">
        <h2 class="menu">Cake by type</h2>

        <sql:setDataSource dataSource="jdbc/dbs" var="ds"></sql:setDataSource>
        <sql:query var="result" dataSource="${ds}" sql="SELECT DISTINCT type FROM products ORDER BY type"></sql:query>

        <c:forEach var="type" items="${result.rows}">
            <a class="menu" href="shop.jsp?type=${type.type}">${type.type}</a><br>
        </c:forEach>
    </div>
</div>