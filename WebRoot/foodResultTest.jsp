<%--
  Created by IntelliJ IDEA.
  User: Kevin
  Date: 2016/12/10
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>foodsResults</title>
</head>
<body>
<c:forEach items="${page.list}" var="fooditem" varStatus="s">
${fooditem.foodId}:${fooditem.hotelId}:${fooditem.foodName}:${fooditem.unitMoney}:${fooditem.cateCode}:${fooditem.cateName}:${fooditem.totalNum}:${fooditem.hotelName}<br/>
</c:forEach>
<br/>
共${page.totalRecords}条记录 共${page.totalPages}页 当前第${page.pageNo}页<br>
                
<a href="searchFood.do?keyword=${page.keyword}&pageNo=${page.topPageNo}">首页</a><br/>
                <c:choose>
                  <c:when test="${page.pageNo!=1}">
                      <a href="searchFood.do?keyword=${page.keyword}&pageNo=${page.previousPageNo}"><input type="button" name="previousPage" value="上一页" /></a>
                  </c:when>
                  <c:otherwise>
                      <input type="button" disabled="disabled" name="previousPage" value="上一页" />
                  </c:otherwise>
                </c:choose>
                <c:choose>
                  <c:when test="${page.pageNo != page.totalPages}">
                    <a href="searchFood.do?keyword=${page.keyword}&pageNo=${page.nextPageNo}"><input type="button" name="nextPage" value="下一页" /></a>
                  </c:when>
                  <c:otherwise>
                      <input type="button" disabled="disabled" name="nextPage" value="下一页" />
                  </c:otherwise>
                </c:choose>
                <br/>
<a href="searchFood.do?keyword=${page.keyword}&pageNo=${page.bottomPageNo}"><input type="button" name="lastPage" value="尾页" /></a>

</body>
</html>
