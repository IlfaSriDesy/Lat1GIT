<%-- 
    Document   : layar5
    Created on : May 5, 2019, 8:08:27 AM
    Author     : Nina M Aida
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:url var="indexUrl" value="/index.htm">        
        </c:url>
        <a href="${indexUrl}"><button style="float: right; color: red">X</button></a>
        <h1 align="center">Upload Foto</h1>
    <center>
        <div class="col-sm-3 portfolio-item">
                        <div class="caption">
                            <div class="caption-content">
                                <i class="fa fa-search-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="img/portfolio/game.png" class="img-responsive" alt="">
                    </a>
                </div>
        <form:form id="formUpload" modelAttribute="dtoupload" action="saveUpload.htm" method="POST" enctype="multipart/form-data">
            <form:input type="file" path="file" id="txfile" />   
            <button type="submit">Klik</button>
        </form:form>
    </center>
    </body>
</html>
