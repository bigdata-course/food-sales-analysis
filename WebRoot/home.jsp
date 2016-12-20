<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <%--<!--<base href="<%=basePath%>">-->--%>
    <meta charset="UTF-8">
    <title>food-sale-analysis</title>
    <meta name="viewport" content="width=1000, initial-scale=1.0, maximum-scale=1.0">

    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="shortcut icon" href="img/search.ico">

    <!-- Loading Flat UI -->
    <link href="flatui/css/flat-ui.css" rel="stylesheet">

    <link href="select2/css/select2.min.css" rel="stylesheet" />
    <script src="select2/js/select2.min.js"></script>

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
    <!--[if lt IE 9]>
    <script src="flatui/js/vendor/html5shiv.js"></script>
    <script src="flatui/js/vendor/respond.min.js"></script>
    <![endif]-->


    <!--<script type="text/javascript" src="js/index.js"></script>-->
   <script type="text/javascript">
     	function isEmpty()
     	{
     		var keyword = document.getElementById("keyword").value;
     		if(keyword.trim().length==0)
     			return false;
     		return true;
     	}
    </script>
</head>
<body>
    <nav class="navbar navbar-inverse" role="navigation">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse-01">
                <span class="sr-only">Toggle navigation</span>
            </button>
            <a class="navbar-brand" href="home.do">菜品销售分析系统</a>
        </div>
    </nav>
    <div class="container">
        <div class="row">
            <div class="col-md-12" id="logo">
                <img src="img/logo.png" width="350" height="75">
            </div>
        </div>
        <div class="row" style="margin-top: 20px; margin-bottom: 40px">
            <div class="col-lg-6 col-lg-offset-3">
                <div class="row">
                    <form role="form" method="get" action="search.do">
                        <div class="col-lg-10">
                            <div class="input-group input-group-lg">
                                <input type="text" class="form-control" name="keyword" id='keyword'>
                                <span class="input-group-btn"><button type="submit" class="btn btn-default" onclick="return isEmpty()"><span class="glyphicon glyphicon-search"></span></button></span>
                            </div>
                        </div>
                        <div class="col-lg-1" style="margin-top: 3px">
                            <select name="searchType" class="form-control select select-info select-block mbl" style="min-width:90px" >
                    			<option value="餐厅">餐厅</option>
                   			 	<option value="菜品">菜品</option>
                			</select>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6">
                <div class="panel panel-success">
                    <!-- Default panel contents -->
                    <div class="panel-heading">明星店铺</div>

                    <!-- Table -->
                    <table class="table table-striped table-hover" id = 'table1'>
                        <tr>
                            <th>序号</th>
                            <th>餐厅</th>
                            <th>周营业额</th>
                        </tr>
                        <c:forEach items="${hotHotels}" var="hotel" varStatus="s">
                        <tr>
                            <td></td>
                            <td><a href='hotelInfo.do?hotelId=${hotel.hotelId}'>${hotel.hotelName}</a></td>
                            <td>${hotel.totalIncome}</td>
                        </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="panel panel-info">
                    <!-- Default panel contents -->
                    <div class="panel-heading">热销菜品</div>

                    <!-- Table -->
                    <table class="table table-striped table-hover" id='table2'>
                        <tr>
                            <th>序号</th>
                            <th>菜名</th>
                            <th>周销量</th>
                        </tr>
                        <c:forEach items="${hotFoods}" var="food" varStatus="s">
                        <tr>
                            <td></td>
                            <td><a href='foodInfo.do?foodId=${food.foodId}'>${food.foodName}</a></td>
                            <td>${food.totalNum}</td>
                        </tr>
                        </c:forEach>
                    </table>
                </div>

            </div>
        </div>
    </div>
    <div id="footer">
        <p>本站所有数据来自屏芯科技有限公司，仅限学术研究，请勿用于商业用途</p>
        <p>© Copyright 2016&nbsp;|&nbsp; 清华大学软件学院</p>
    </div>
    <!-- 如果要使用Bootstrap的js插件，必须先调入jQuery -->
    <script src="js/jquery-2.1.1.js"></script>
    <!-- 包括所有bootstrap的js插件或者可以根据需要使用的js插件调用　-->
    <script src="bootstrap/js/bootstrap.min.js"></script>

    <script src="flatui/js/vendor/jquery.min.js"></script>
    <script src="flatui/js/flat-ui.min.js"></script>
    <script type="text/javascript">
        $("select").select2({dropdownCssClass: 'dropdown-inverse'});
    </script>
    <script type="text/javascript">
    $(function(){
        //$('table tr:not(:first)').remove();
        var len = $('#table1 tr').length;
        for(var i = 1;i<len;i++){
            $('#table1 tr:eq('+i+') td:first').text(i);
        }
    });
</script>
<script type="text/javascript">
    $(function(){
        //$('table tr:not(:first)').remove();
        var table =document.getElementById("table2");
        var len = table.rows.length;
        for(var i = 1;i<len;i++){
            $('#table2 tr:eq('+i+') td:first').text(i);
        }
    });
</script>
</body>
</html>