<div class="part">
    <div class="sidebar top"></div>

    <div class="side-content">
        <h2 class="cart">Items: ${cart.count}</h2>
        <form action="${pageContext.request.contextPath}/Cart?action=show" method="get">
            <input type="hidden" name="action" value="show">
            <input class="btn reg" type="submit" value="                  Your order                      ">
        </form>
    </div>
</div>