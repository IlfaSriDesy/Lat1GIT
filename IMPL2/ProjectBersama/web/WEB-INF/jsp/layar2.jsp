<%-- 
    Document   : layar1
    Created on : May 2, 2019, 11:51:40 PM
    Author     : ILFA SRI DESY
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
        <style type="text/css" media="screen">
        table {
            border-collapse: collapse;
            border: 1px solid black;
               width: 100%;
        }

        table, th, td {
            border: 1px solid black;
        }
        th {
            text-align: left;
        }
        td {
            height: 50px;
            vertical-align: bottom;
        }
        th, td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        
        }
        tr:hover {background-color: #f5f5f5;}
        tr:nth-child(even) {background-color: #f2f2f2;}
        th {
            background-color: #4CAF50;
            color: white;
        }

        th {
        }
        .s-styles { 
            background: #f2f2f2;
            padding-top: 12rem;
            padding-bottom: 12rem;
        }

        .s-styles .section-intro h1 {
            margin-top: 0;
        }
     </style> 
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
                        <table id="myTable">         
         <tr>
            <th><center>No</center></th> 
            <th><center>Id Point</center></th>            
            <th><center>Nama Point</center></th>            
            <th><center>Nilai Point</center></th>
        </tr>        
        <c:set var="index" value="1"/>
        <c:forEach var="listData" items="${listDataDto}">
            <tr >  
                <td ><center>${index}</center></td>
                <td><center>${listData.jnspoint_id}</center></td>
                <td><center>${listData.jnspoint_nm}</center></td>
                <td><center>${listData.jnspoint_nilai}</center></td>              
                <c:url var="deleteData" value="/deleteData.htm">
                    <c:param name="nokk" value="${listData.jnspoint_id}"/>
                </c:url>
                <c:url var="updateData" value="/getDataUpdate.htm">
                    <c:param name="nokk" value="${listData.jnspoint_nm}"/>
                </c:url>
                <c:url var="bayarData" value="/getDataBayar.htm">
                    <c:param name="nokk" value="${listData.jnspoint_nm}"/>
                </c:url>
            </tr>            
            <c:set var="index" value="${index+1}"/>
        </c:forEach>
        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
