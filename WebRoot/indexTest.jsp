
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>foodInfoTest</title>
</head>
<body>
明星店铺<br/>
<c:forEach items="${hotHotels}" var="hotel" varStatus="s">
${hotel.hotelId}:${hotel.hotelName}:${hotel.totalIncome}<br/>
</c:forEach>
<br/>

热销菜品<br/>
<c:forEach items="${hotFoods}" var="food" varStatus="s">
${food.foodId}:${food.foodName}:${food.totalNum}<br/>
</c:forEach>
<br/>
</body>
</html>
