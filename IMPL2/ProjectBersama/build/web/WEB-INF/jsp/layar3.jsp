<%-- 
    Document   : layar3
    Created on : May 5, 2019, 9:36:08 AM
    Author     : acer v5
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
                        <img src="img/portfolio/circus.png" class="img-responsive img-centered" alt="">
                        <table border="1" width="600" id="table">
                            <tr bgcolor="gold">
                                <th>No</th> 
                                <th>Id Member</th>            
                                <th>Nama Member</th>            
                                <th>Jenis Kelamin Member</th>
                                <th>Point Member</th>          
                                
                            </tr>        
                            <c:set var="index" value="1"/>
                            <c:forEach var="listKelas" items="${datamember}">
                                <tr>  
                                    <td>${index}</td>
                                    <td>${listKelas.member_id}</td>
                                    <td>${listKelas.member_nm}</td>
                                    <td>${listKelas.member_jk}</td>
                                    <td>${listKelas.member_point}</td>               
                                    
                                    
                                </tr>            
                                <c:set var="index" value="${index+1}"/>
                            </c:forEach>
                    </div></table>
                </div>
            </div>
        </div>
<<<<<<< HEAD:IMPL2/ProjectBersama/web/WEB-INF/jsp/layar3.jsp
        <center>
        <table border="4" width="800" bgcolor="white">
        <tr>
            <th>nomor</th>
            <th>id transaksi</th> 
            <th>date</th>            
            <th>id member</th>            
            <th>jnspoint</th>
            <th>desc</th>          
            
        </tr>        
        <c:set var="index" value="1"/>
        <c:forEach var="listtrans" items="${listTransDto}">
            <tr>  
                <td>${index}</td>
                <td>${listtrans.trans_id}</td>
                <td>${listtrans.date}</td>
                <td>${listtrans.member_id}</td>
                <td>${listtrans.jnspoint_id}</td>       
                <td>${listtrans.desc}</td>  
               
            </tr>            
            <c:set var="index" value="${index+1}"/>
        </c:forEach>
        </table>
    </body>
=======
    </div>
</body>
>>>>>>> 1c372de46fb78ee591679d9f44d2c5174b65369a:IMPL2/ProjectBersama/build/web/WEB-INF/jsp/layar1.jsp
</html>

