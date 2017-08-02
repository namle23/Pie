<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<div class="part">
    <div class="sidebar top"></div>

    <div class="side-content">
        <h2 class="menu">Cake by type</h2>

        <sql:setDataSource dataSource="jdbc/dbs" var="ds"></sql:setDataSource>
        <sql:query var="results" dataSource="${ds}" sql="SELECT DISTINCT type FROM products ORDER BY type"></sql:query>

        <c:forEach var="type" items="${results.rows}">
            <form action="${pageContext.request.contextPath}/Shop?type=${type.type}" method="get">
                <input type="hidden" name="type" value="${type.type}">
                <a class="menu" href="${pageContext.request.contextPath}/Shop?type=${type.type}">${type.type}</a><br>
            </form>
        </c:forEach>
    </div>
</div>