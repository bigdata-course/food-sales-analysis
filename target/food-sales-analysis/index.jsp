<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <%--<!--<base href="<%=basePath%>">-->--%>
    <meta charset="UTF-8">
    <title>Finder</title>
    <meta name="viewport" content="width=1000, initial-scale=1.0, maximum-scale=1.0">

    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Loading Bootstrap -->
    <!--<link href="flatui/dist/css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">-->

    <!-- Loading Flat UI -->
    <link href="flatui/css/flat-ui.css" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
    <!--[if lt IE 9]>
    <script src="flatui/js/vendor/html5shiv.js"></script>
    <script src="flatui/js/vendor/respond.min.js"></script>
    <![endif]-->

    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="shortcut icon" href="img/search.ico">
    <!--<script type="text/javascript" src="js/index.js"></script>-->
</head>
<body>
    <nav class="navbar navbar-inverse" role="navigation">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse-01">
                <span class="sr-only">Toggle navigation</span>
            </button>
            <a class="navbar-brand" href="#">菜品销售分析系统</a>
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
                    <form role="form" method="get" action="">
                        <div class="col-lg-10">
                            <div class="input-group input-group-lg">
                                <input type="text" class="form-control" name="keywords">
                                <span class="input-group-btn"><button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button></span>
                            </div>
                        </div>
                        <div class="col-lg-1" style="margin-top: 3px">
                            <div class="dropdown">
                                <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown">
                                    搜索类型
                                    <span class="caret"></span>
                                </button>
                                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                                    <li role="presentation"><a role="menuitem" tabindex="-1" href="searchHotel.jsp">餐厅</a></li>
                                    <li role="presentation"><a role="menuitem" tabindex="-1" href="searchFood.jsp">菜名</a></li>
                                </ul>
                            </div>
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
                    <table class="table table-striped table-hover">
                        <tr>
                            <th>序号</th>
                            <th>餐厅</th>
                            <th>周订单</th>
                        </tr>
                        <tr>
                            <td></td>
                            <td>逸轩**</td>
                            <td>145</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>国香**</td>
                            <td>123</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>四海**</td>
                            <td>97</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>来辣**</td>
                            <td>34</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>阿田**</td>
                            <td>12</td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="panel panel-info">
                    <!-- Default panel contents -->
                    <div class="panel-heading">热销菜品</div>

                    <!-- Table -->
                    <table class="table table-striped table-hover">
                        <tr>
                            <th>序号</th>
                            <th>菜名</th>
                            <th>周销量</th>
                        </tr>
                        <tr>
                            <td></td>
                            <td>剁椒鸡蛋</td>
                            <td>43</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>功夫排骨鸡</td>
                            <td>32</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>双椒味鲶鱼</td>
                            <td>24</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>双椒烤翅</td>
                            <td>12</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>外婆菜炒鸡蛋</td>
                            <td>4</td>
                        </tr>
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
        $(function(){
            //$('table tr:not(:first)').remove();
            var len = $('table tr').length;
            for(var i = 1;i<len;i++){
                $('table tr:eq('+i+') td:first').text(i);
            }
        });
    </script>
</body>
</html>