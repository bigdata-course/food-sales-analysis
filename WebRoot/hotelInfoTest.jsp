
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>hotelInfoTest</title>
</head>
<body>
hotelId:${hotel.hotelId}<br/>
hotelName:${hotel.hotelName}<br/>
caixi:${hotel.caixi}<br/>
<br/>
历史营业额及预测<br/>
<c:forEach items="${incomeList}" var="income" varStatus="s">
${income.date}:${income.income}<br/>
</c:forEach>
相似餐厅<br/>
<c:forEach items="${similiarHotels}" var="sHotel" varStatus="s">
${sHotel.hotelId}:${sHotel.hotelName}<br/>
</c:forEach>

相似餐厅营业额对比<br/>
<c:forEach items="${similiarIncomes}" var="hotelIncomes" varStatus="s">
hotelName:${hotelIncomes.hotelName}<br/>
<c:forEach items="${hotelIncomes.incomes}" var="income" varStatus="s">
${income.date}:${income.income}<br/>
</c:forEach>
<br/>
</c:forEach>
<br/>
热销菜品<br/>
<c:forEach items="${hotFoods}" var="food" varStatus="s">
${food.foodId}:${food.foodName}:${food.totalNum}<br/>
</c:forEach>

滞销菜品<br/>
<c:forEach items="${poorFoods}" var="food" varStatus="s">
${food.foodId}:${food.foodName}:${food.totalNum}<br/>
</c:forEach>

</body>
</html>
