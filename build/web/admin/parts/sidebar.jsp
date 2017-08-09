<%-- 
    Document   : sidebar
    Created on : Aug 9, 2017, 5:35:12 PM
    Author     : Nam
--%>

<div id="sidebar"><!-- SIDE BAR -->
    <div class="box">
        <div class="h_title">&#8250; Products</div>
        <ul id="home">
            <!-- <li class="b1"><a class="icon view_page" href="">Visit site</a></li>
            <li class="b1"><a class="icon add_page" href="">Add new page</a></li>
            <li class="b2"><a class="icon config" href="">Site config</a></li> -->
            <li class="b2"><a class="icon category" href="products.jsp">Products</a></li>
        </ul>
    </div>

    <div class="box">
        <div class="h_title">&#8250; Orders</div>
        <ul>
            <!-- <li class="b1"><a class="icon page" href="">Show all pages</a></li>
            <li class="b2"><a class="icon add_page" href="">Add new page</a></li>
            <li class="b1"><a class="icon photo" href="">Add new gallery</a></li>
            <li class="b2"><a class="icon category" href="">Categories</a></li> -->
            <li class="b1"><a class="icon report" href="order.jsp">All</a></li>
            <li class="b2"><a class="icon config" href="order.jsp?status=pending">Processing</a></li>
            <li class="b1"><a class="icon block_users" href="order.jsp?status=completed">Processed</a></li>
        </ul>
    </div>
    <div class="box">
        <div class="h_title">&#8250; Members</div>
        <ul>
            <!-- <li class="b2"><a class="icon add_user" href="">Add new user</a></li>
            <li class="b1"><a class="icon block_users" href="">Lock users</a></li> -->
            <li class="b1"><a class="icon users" href="users.jsp">Members</a></li>
        </ul>
    </div>
    <!-- <div class="box">
            <div class="h_title">&#8250; Settings</div>
            <ul>
                    <li class="b1"><a class="icon config" href="">Site configuration</a></li>
                    <li class="b2"><a class="icon contact" href="">Contact Form</a></li>
            </ul>
    </div> -->
</div><!-- END / SIDE BAR -->
