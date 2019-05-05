<%-- 
    Document   : layar6
    Created on : May 5, 2019, 7:46:29 AM
    Author     : LK
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>

<!--script menyisipkan jquery-->
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" type="text/css" media="screen" href="js/validation/css/validationEngine.jquery.css">
<script type="text/javascript" src="js/validation/jquery.validationEngine-en.js"></script>
<script type="text/javascript" src="js/validation/jquery.validationEngine.js"></script>
<!--script menyisipkan jquery-->

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
                        <img src="img/portfolio/safe.png" class="img-responsive img-centered" alt="">
                        <p>Do something!</p>
                    </div>
                </div>
            </div>
        </div>


        <div class="form-group">
            <script>
                function isiproduct()
                {
                    alert("HUHUHUUHUHU")
                    var idCategory = document.getElementById("foodCategory_id").value
                    var content;
                    if (idCategory == 0) {
                        content = '<option value="0" name="idProduct" disabled="true">-- Pilih Category --</option>';
                        $('#foodProduct_id').html(content);
                    } else {
                        $.ajax({
                            url: 'getDataProductByCategory.htm',
                            data: "foodCategory_id=" + idCategory,
                            type: 'GET',
                            success: function (response) {
                                var data = JSON.parse(response);
                                var len = data.length;
                                content = '<option value="0" name="idProduct" disabled="true">-- Pilih Product --</option>';
                                for (var i = 0; i < len; i++) {
                                    content += '<option value="' + data[i].foodProduct_id + '" name="idProduct">' + data[i].foodProduct_nm + '</option>';
                                    $('#foodProduct_id').html(content);
                                }
                            }
                        });
                    }

                }

                function ok() {
                    var isiCat;
                    var isiProd;
                    var idCat = document.getElementById("foodCategory_id").value;
                    var idProd = document.getElementById("foodProduct_id").value;

                    if (idCat == 0) {
                        $('#hasilCat').html("SEMUA KATEGORI");
                        $('#hasilProd').html("SEMUA PRODUK");
                    } else {
                        $.ajax({
                            url: 'getProduct2.htm',
                            data: {
                                cat: idCat,
                                prod: idProd
                            },
                            type: 'GET',
                            success: function (response) {
                                var data = JSON.parse(response);
                                $('#hasilCat').html(data[0].foodProduct_nm);
                                $('#hasilProd').html(data[1].foodProduct_nm);
                            }
                        });
                    }
                }
            </script>
            <label class="col-md-3 control-label" >Pilih Kategori</label>
            <div class="col-md-9">
                <select name="kategori_filter" id="foodCategory_id" onchange="isiproduct()">
                    <option value="0">-- Semua Kategori --</option>
                    <c:forEach var="cat"  items="${listCategory}">
                        <option  value="${cat.foodCategory_id}">${cat.foodCategory_nm}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <br>
        <div class="form-group">
            <label class="col-md-3 control-label" >Pilih Produk</label>
            <div class="col-md-9">
                <select name="produk_filter" id="foodProduct_id">
                    <option value="0" disabled="true" selected="true">-- Pilih Produk --</option>
                </select>
            </div>
        </div>
        <br>
        <div class="form-group">
            <label class="col-md-3 control-label" ></label>
            <div class="col-md-9 widget-right">
                <input type="button" class="btn btn-primary form-control"  id="sbm" value="OK" onclick="ok()"/>
            </div>
        </div>
        <br><br>
        <h3 id="hasilCat" style="text-decoration: blink;"></h3>
        <h3 id="hasilProd"></h3>

    </body>
    <br> <br>
    <c:url var="indexUrl" value="/index.htm">        
    </c:url>
    <a href="${indexUrl}"><button>Index</button></a>  
</body>
</html>
