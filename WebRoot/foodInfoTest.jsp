
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>foodInfoTest</title>
</head>
<body>
foodId:${food.foodId}<br/>
foodName:${food.foodName}<br/>
unitMoney:${food.unitMoney}<br/>
cateName:${food.cateName}<br/>
hotelName:${hotel.hotelName}<br/>
历史销售额及预测<br/>
<c:forEach items="${salesList}" var="sale" varStatus="s">
${sale.date}:${sale.soldNum}<br/>
</c:forEach>
<br/>
热销同类菜品<br/>
<c:forEach items="${similiarFoods}" var="sFood" varStatus="s">
${sFood.foodId}:${sFood.foodName}:${sFood.hotelId}<br/>
</c:forEach>
<br/>

同类菜品销量对比<br/>
<c:forEach items="${similiarSales}" var="foodSale" varStatus="s">
foodName:${foodSale.foodName}<br/>
hotelName:${foodSale.hotelName}<br/>
<c:forEach items="${foodSale.sales}" var="sale" varStatus="s">
${sale.date}:${sale.soldNum}<br/>
</c:forEach>
<br/>
</c:forEach>
<br/>
推荐定价<br/>
${recommendPrice}<br/>

<br/>
搭配菜品推荐<br/>
<c:forEach items="${groupFoods}" var="gfood" varStatus="s">
${gfood.foodId}:${gfood.foodName}:${gfood.hotelId}<br/>
</c:forEach>
<br/>
</body>
</html>
