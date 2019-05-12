<%-- 
    Document   : layar4
    Created on : May 9, 2019, 4:23:08 PM
    Author     : Acer
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Project Bersama - Java 16</title>

        <!-- Bootstrap Core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Theme CSS -->
        <link href="css/freelancer.min.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>
    <body>
        <c:url var="indexUrl" value="/index.htm">        
        </c:url>
        <a href="${indexUrl}"><button style="float: right; color: red">X</button></a>   

        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <div class="modal-body">
                        <center><h2>Project Title</h2></center>
                        <hr class="star-primary">
                        <img src="img/portfolio/cake2.png" class="img-responsive img-centered" alt="">
                        Contoh Aoutokomplit
                        <br>
                        <input type="text" id="txauto" placeholder="nama makanan"> 
                        <br>
                        
                        
                        <a href="${indexUrl}"><button>Index</button></a>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
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
