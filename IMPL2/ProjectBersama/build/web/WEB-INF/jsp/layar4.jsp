<%-- 
    Document   : layar4
    Created on : Jun 3, 2019, 2:50:09 PM
    Author     : Acer
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div class="modal-body">
            <center><h2>Layar 4 autocomplit</h2>
            
                <hr class="star-primary">
                <img src="img/portfolio/cake2.png " width='350' height="350" class="img-responsive img-centered" alt="">

        </div><br><br><br>
    <center> <input type="text" id="txauto" placeholder="food"> 
        <br>
        <br>
         <c:url var="kembali" value="/index.htm">        
                    </c:url>  
        <a href="${kembali}" >
            <button>Kembali</button></a>
    </center>
    </body>
</html>
<script type="text/javascript">
    $(document).ready(function () {
        reloadAutocomplete();
        function reloadAutocomplete() {
            jAuto = jQuery.noConflict(true);
            $.ajax({
                url: 'getauto.htm',
                type: 'GET',
                success: function (response) {
                    var data = JSON.parse(response);
                    var len = data.length;
                    var xxx = [];
                    for (var i = 0; i < len; i++) {
                        xxx[i] =data[i].food_nm;
                    }
                    jAuto('#txauto').autocomplete({
                        source: xxx
                    });
                }
            });
        }
    });
</script>