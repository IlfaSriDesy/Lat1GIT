<%-- 
    Document   : layar4
    Created on : May 5, 2019, 8:08:24 AM
    Author     : Acer
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!--autocomplete file library-->
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<!--script menyisipkan jquery-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <h1>Hello World!</h1>
        Contoh Aoutokomplit
        <br>
        <input type="text" id="txauto" placeholder="nama makanan"> 
        <br>
        
        <c:url var="indexUrl" value="/index.htm">        
    </c:url>
    <a href="${indexUrl}"><button>Index</button></a>
    </body>
    
</html>

<script type="text/javascript">
    $(document).ready(function () {
        reloadAutocomplete();
        function reloadAutocomplete() {
            jAuto = jQuery.noConflict(true);
            $.ajax({
                url: 'getlist1.htm',
                type: 'GET',
                success: function (response) {
                    var data = JSON.parse(response);
                    var len = data.length;
                    var xxx = [];
                    for (var i = 0; i < len; i++) {
                        xxx[i] = data[i].foodNm;
                    }
                    jAuto('#txauto').autocomplete({
                        source: xxx
                    });
                }
            });
        }
    });
</script>
