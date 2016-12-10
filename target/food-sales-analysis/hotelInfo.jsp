<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.thuss.fsa.model.*,java.util.*"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hotel Info</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!--你自己的样式文件 -->
    <link rel="shortcut icon" href="img/coffee.ico">
    <link href="css/info.css" rel="stylesheet" type="text/css">

    <!-- Loading Flat UI -->
    <link href="flatui/css/flat-ui.css" rel="stylesheet">

    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/highcharts.js"></script>

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
    <!--[if lt IE 9]>
    <script src="flatui/js/vendor/html5shiv.js"></script>
    <script src="flatui/js/vendor/respond.min.js"></script>
    <![endif]-->
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
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">餐厅：逸轩**</h3>
                </div>
                <div class="panel-primary">
                    <ul class="nav nav-pills" role="tablist">
                        <li role="presentation"><a href="#">菜系<span class="badge">川湘菜</span></a></li>
                        <li role="presentation"><a href="#">业态<span class="badge">火锅</span></a></li>
                        <li role="presentation"><a href="#">菜品数<span class="badge">139</span></a></li>
                        <li role="presentation"><a href="#">菜品数<span class="badge">139</span></a></li>
                        <li role="presentation"><a href="#">餐桌数<span class="badge">17</span></a></li>
                        <li role="presentation"><a href="#">座位数<span class="badge">164</span></a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6">
                <div id="container" style="min-width:400px;height:400px"></div>
                <script>
                    $(function () {
                        $('#container').highcharts({
                            title: {
                                text: '历史营业额与预测图',
                                x: -20 //center
                            },
//                            subtitle: {
//                                text: 'Source: WorldClimate.com',
//                                x: -20
//                            },
                            xAxis: {
                                categories: ['2016-05-23', '2016-05-24', '2016-05-25', '2016-05-26', '2016-05-27', '2016-05-28',
                                    '2016-05-29', '2016-05-30', '2016-05-31', '2016-06-01', '2016-06-02', '2016-06-03']
                            },
                            yAxis: {
                                title: {
                                    text: '营业额 (万元)'
                                },
                                plotLines: [{
                                    value: 0,
                                    width: 1,
                                    color: '#808080'
                                }]
                            },
                            tooltip: {
                                valueSuffix: '°C'
                            },
                            legend: {
                                layout: 'vertical',
                                align: 'right',
                                verticalAlign: 'middle',
                                borderWidth: 0
                            },
                            series: [{
                                name: '逸轩**',
                                data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]
                            }]
                        });
                    });
                </script>
            </div>
            <div class="col-lg-6">
                <div id="ChartCompare" style="min-width:400px;height:400px"></div>
                <script type="text/javascript">
                    $(function () {
                        $('#ChartCompare').highcharts({
                            title: {
                                text: '相似店铺对比图',
                                x: -20 //center
                            },
//                            subtitle: {
//                                text: 'Source: WorldClimate.com',
//                                x: -20
//                            },
                            xAxis: {
                                categories: ['2016-05-23', '2016-05-24', '2016-05-25', '2016-05-26', '2016-05-27', '2016-05-28',
                                    '2016-05-29', '2016-05-30', '2016-05-31', '2016-06-01', '2016-06-02', '2016-06-03']
                            },
                            yAxis: {
                                title: {
                                    text: '营业额 (万元)'
                                },
                                plotLines: [{
                                    value: 0,
                                    width: 1,
                                    color: '#808080'
                                }]
                            },
                            tooltip: {
                                valueSuffix: '°C'
                            },
                            legend: {
                                layout: 'vertical',
                                align: 'right',
                                verticalAlign: 'middle',
                                borderWidth: 0
                            },
                            series: [{
                                name: '逸轩**',
                                data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]
                            }, {
                                name: '鱼羊**',
                                data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5]
                            }, {
                                name: '簋街**',
                                data: [-0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0]
                            }, {
                                name: '兰州**',
                                data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]
                            }]
                        });
                    });
                </script>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6">
                <div class="panel panel-success">
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
            <div class="col-lg-6">
                <div class="panel panel-danger">
                    <!-- Default panel contents -->
                    <div class="panel-heading">滞销菜品</div>

                    <!-- Table -->
                    <table class="table table-striped table-hover">
                        <tr>
                            <th>序号</th>
                            <th>菜名</th>
                            <th>周销量</th>
                        </tr>
                        <tr>
                            <td></td>
                            <td>扬州炒饭</td>
                            <td>2</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>咖喱鸡</td>
                            <td>2</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>避风塘炒虾</td>
                            <td>4</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>黑椒铁板牛仔骨</td>
                            <td>7</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>豉汁排骨煲仔饭</td>
                            <td>8</td>
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
    <!--<script src="js/jquery-3.1.1.min.js"></script>-->
    <!-- 包括所有bootstrap的js插件或者可以根据需要使用的js插件调用　-->
    <script src="bootstrap/js/bootstrap.min.js"></script>

    <!--<script src="flatui/js/vendor/jquery.min.js"></script>-->
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