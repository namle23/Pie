<%-- 
    Document   : head
    Created on : Aug 9, 2017, 5:32:11 PM
    Author     : Nam
--%>

<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Happy Chefs Admin</title>
<link rel="stylesheet" type="text/css" href="css/style.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/navi.css" media="screen" />
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
    $(function () {
        $(".box .h_title").not(this).next("ul").hide("normal");
        $(".box .h_title").not(this).next("#home").show("normal");
        $(".box").children(".h_title").click(function () {
            $(this).next("ul").slideToggle();
        });
    });
</script>
