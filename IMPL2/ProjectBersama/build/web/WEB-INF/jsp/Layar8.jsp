<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <div class="modal-body">
            <center><h2>Layar 8 Import Data dari Excel Ke Database</h2>
            
                <hr class="star-primary">
                <img src="img/portfolio/cabin2.png " width='350' height="350" class="img-responsive img-centered" alt="">

        </div><br><br><br>
        
        
        
                <c:if test="${param.success eq true }">
                    <h3 style="color: green">Import Master Barang Berhasil !</h3>
                </c:if>
                <c:if test="${param.success eq false }">
                    <h3 style="color: red">Import Master Jurusan Gagal !</h3>
                </c:if><br>



                <form:form action="uploadDataDua.htm" method="post" modelAttribute="importDto" enctype="multipart/form-data">

                    <div class="form-group">
                        <label class="col-md-1 control-label" >File .xls</label>
                        <div class="col-md-9">
                            <form:input path="path" id="namafile" readonly="true"/>
                        </div>
                    </div><br><br>

                    <script>
                        function isi()
                        {
                            var files = document.getElementById("file").files;
                            for (var i = 0; i < files.length; i++)
                            {
                                document.getElementById('namafile').value = files[i].name;
                            }
                        }

                    </script>



                    <div class="form-group">
                        <label class="col-md-1 control-label" ></label>
                        <div class="col-md-2">
                            <form:input type="file" id="file" path="file" onchange="isi()"/>                        
                        </div><br>
                    </div>
                    <div class="form-group">
                        <label class="col-md-1 control-label" ></label>
                        <div class="col-md-2">
                            <input type="submit" class="btn btn-primary btn-md"  id="sbm" value="Ambil Data" />
                        </div><br>
                    </div>

                    <div> 
                        <c:url var="saveImportData" value="/saveImportData.htm">
                        </c:url>
                        <div>
                            <a href="${saveImportData}"><input type="button" value="Simpan Data"/></a>
                        </div><br>
                        <c:url var="resetImportData" value="/resetImportData.htm">
                        </c:url>
                        <div>
                            <a href="${resetImportData}"><input type="button" value="Reset" /></a>
                        </div><br>
                    </div>

                </form:form>

                <br><br>
                <div>

                    <table border="1" width="600">
                        <tr>
                           
                            <th>ID Data</th>
                            <th>Kode Produk</th>
                            <th>Nama Produk</th>
                            <th>Kode Kategori</th>
                            <th>Stok</th>
                        </tr>

                        <c:set var="index" value="1"/>
                        <c:forEach var="listData" items="${listDto}">
                            <tr>
                                
                                <td>${listData.data2_id}</td>
                                <td>${listData.kd_produk}</td>
                                <td>${listData.nm_produk}</td>
                                <td>${listData.kategori_produk}</td>
                                <td>${listData.stok}</td>

                            </tr>  
                            <c:set var="index" value="${index+1}"/>

                        </c:forEach>        

                    </table>
                </div><br>



                <c:url var="indexUrl" value="/index.htm">        
                </c:url>
                <a href="${indexUrl}"><button>Index</button></a>
            </center>
    </body>
</html>
