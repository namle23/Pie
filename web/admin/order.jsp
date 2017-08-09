<%-- 
    Document   : order
    Created on : Aug 9, 2017, 4:58:49 PM
    Author     : Nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="parts/head.jsp"%> 
    </head>
    <body>
        <div class="wrap">

            <%@include file="parts/header.jsp"%> 

            <div id="content">

                <%@include file="parts/sidebar.jsp"%> 

                <div id="main"> <!-- MAIN-CONTENT -->
                    <div class="full_w products">
                        <div class="h_title">Orders</div>
                        <h2>Customer: Julia Malmberg</h2>
                        <h2>Total: <b>4</b> products</h2>
                        <div class="entry">
                            <a class="button add" href="">Add products</a> <!-- <a class="button" href="">Categories</a>  -->
                        </div>
                        <div class="entry">
                            <div class="sep"></div>
                        </div>
                        <table>
                            <thead>
                                <tr>
                                    <th class="ord-id" scope="col">ID</th>
                                    <th class="ord-usrid" scope="col">Customer ID</th>
                                    <th class="ord-name" scope="col">Name</th>
                                    <th class="ord-adr" scope="col">Address</th>
                                    <th class="ord-phone" scope="col">Phone number</th>
                                    <th class="ord-prdid" scope="col">Product ID</th>
                                    <th class="ord-prdname" scope="col">Product name</th>
                                    <th class="ord-quan" scope="col">Quantity</th>
                                    <th class="ord-cost" scope="col">Total</th>
                                    <th class="ord-stat" scope="col">Status</th>
                                    <th scope="col" style="width: 55px;">Modify</th>
                                </tr>
                            </thead>

                            <tbody>
                                <c:forEach var="i" begin="1" end="5">
                                    <tr>
                                        <td class="align-center ord-id">${i}</td>
                                        <td class="align-center ord-usrid">3</td>
                                        <td class="align-center ord-name">Julia Malmberg</td>
                                        <td class="align-center ord-adr">Live with Nam</td>
                                        <td class="align-center ord-phone">01234567890</td>
                                        <td class="align-center ord-prdid">10</td>
                                        <td class="align-center ord-prdname">Batik</td>
                                        <td class="align-center ord-quan">3</td>
                                        <td class="align-center ord-cost">50€</td>
                                        <td class="align-center ord-stat">0</td>
                                        <td>
                                            <a href="#" class="table-icon edit" title="Edit"></a>
                                            <a href="#" class="table-icon archive" title="Archive"></a>
                                            <a href="#" class="table-icon delete" title="Delete"></a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                        <div class="entry">
                            <div class="pagination">
                                <span>« First</span>
                                <span class="active">1</span>
                                <a href="">2</a>
                                <a href="">3</a>
                                <a href="">4</a>
                                <span>...</span>
                                <a href="">23</a>
                                <a href="">24</a>
                                <a href="">Last »</a>
                            </div>
                            <div class="sep"></div>		
                            <a class="button add" href="">Add products</a> <!-- <a class="button" href="">Categories</a>  -->
                        </div>
                    </div>

                    <div class="half_w half_left">
                        <div class="h_title">Visits statistics</div>
                        <script src="js/highcharts_init.js"></script>
                        <div id="container" style="min-width: 300px; height: 180px; margin: 0 auto"></div>
                        <script src="js/highcharts.js"></script>
                    </div>
                    <div class="half_w half_right">
                        <div class="h_title">Site statistics</div>
                        <div class="stats">
                            <div class="today">
                                <h3>Today</h3>
                                <p class="count">2 349</p>
                                <p class="type">Visits</p>
                                <p class="count">96</p>
                                <p class="type">Comments</p>
                                <p class="count">9</p>
                                <p class="type">Articles</p>
                            </div>
                            <div class="week">
                                <h3>Last week</h3>
                                <p class="count">12 931</p>
                                <p class="type">Visits</p>
                                <p class="count">521</p>
                                <p class="type">Comments</p>
                                <p class="count">38</p>
                                <p class="type">Articles</p>
                            </div>
                        </div>
                    </div>

                    <div class="clear"></div>

                    <div class="full_w">
                        <div class="h_title">Add new page - form elements</div>
                        <form action="" method="post">
                            <div class="element">
                                <label for="name">Page title <span class="red">(required)</span></label>
                                <input id="name" name="name" class="text err" />
                            </div>
                            <div class="element">
                                <label for="category">Category <span class="red">(required)</span></label>
                                <select name="category" class="err">
                                    <option value="0">select category</option>
                                    <option value="1">Category 1</option>
                                    <option value="2">Category 4</option>
                                    <option value="3">Category 3</option>
                                </select>
                            </div>
                            <div class="element">
                                <label for="comments">Comments</label>
                                <input type="radio" name="comments" value="on" checked="checked" /> Enabled <input type="radio" name="comments" value="off" /> Disabled
                            </div>
                            <div class="element">
                                <label for="attach">Attachments</label>
                                <input type="file" name="attach" />
                            </div>
                            <div class="element">
                                <label for="content">Page content <span>(required)</span></label>
                                <textarea name="content" class="textarea" rows="10"></textarea>
                            </div>
                            <div class="entry">
                                <button type="submit">Preview</button> <button type="submit" class="add">Save page</button> <button class="cancel">Cancel</button>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="clear"></div>
            </div><!-- END / MAIN-CONTENT -->

            <%@include file="parts/footer.jsp"%> 
        </div>

    </body>
</html>
