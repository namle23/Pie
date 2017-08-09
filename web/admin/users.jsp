<%-- 
    Document   : users
    Created on : Aug 9, 2017, 5:39:11 PM
    Author     : Nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="pl" xml:lang="pl">
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
                        <div class="h_title">Products</div>
                        <h2>Total: <b>12</b> products</h2>
                        <p>Showing: <b>4 / 12</b> products</p>
                        <div class="entry">
                            <a class="button add" href="">Add products</a> 
                        </div>
                        <div class="entry">
                            <div class="sep"></div>
                        </div>
                        <table>
                            <thead>
                                <tr>
                                    <th class="prd-id" scope="col">Product code</th>
                                    <th class="prd-name"scope="col">Name</th>
                                    <th class="prd-type" scope="col">Type</th>
                                    <th class="prd-brief" scope="col">Brief</th>
                                    <th class="prd-detail" scope="col">Detail</th>
                                    <th class="prd-ingre" scope="col">Ingredient</th>
                                    <th class="prd-price" scope="col">Price</th>
                                    <th class="prd-img" scope="col">Main photo</th>
                                    <th class="prd-img" scope="col">Slide photo</th>
                                    <th class="prd-img" scope="col">Thumb photo</th>
                                    <th scope="col" style="width: 65px;">Modify</th>
                                </tr>
                            </thead>

                            <tbody>
                                <c:forEach var="i" begin="1" end="5">
                                    <tr>
                                        <td class="align-center prd-id">${i}</td>
                                        <td class="prd-name">Batik</td>
                                        <td class="prd-type">Cake</td>
                                        <td class="prd-brief">Corn flour, butter, sugar, and vanilla</td>
                                        <td class="prd-detail content"> Angel food cake, or angel cake, is a type of sponge cake made with egg whites, flour, and sugar. A whipping agent, such as cream of tartar is commonly added.</td>
                                        <td class="prd-ingre">Sponge cake, cream</td>
                                        <td class="prd-price">10€</td>
                                        <td class="prd-img"><a href="#">[main]</a></td>
                                        <td class="prd-img"><a href="#">[slide]</a></td>
                                        <td class="prd-img"><a href="#">[thumb]</a></td>
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
                            <a class="button add" href="">Add</a> <!-- <a class="button" href="">Categories</a>  -->
                        </div>
                    </div>

                    <!-- <div class="half_w half_left">
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
                    </div> -->
                </div>
                <div class="clear"></div>
            </div><!-- END / MAIN-CONTENT -->

            <%@include file="parts/footer.jsp"%> 
        </div>

    </body>
</html>

