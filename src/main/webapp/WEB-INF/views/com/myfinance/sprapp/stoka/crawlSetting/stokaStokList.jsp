<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Stoka 크롤링 배치 대상주식 리스트</title>
</head>
<body>
	<table border="1">
		<th>순서</th>
		<th>주식이름</th>
		<th>주식ID</th>
		<tr>
			<td colspan="3"> 등록된 주식이 없음 </td>
		</tr>
		<c:forEach var="item" items="${stokList}" varStatus="status">
		<tr>
			<th>${status.count}</th>
    		<th><c:out value="${item.stokId}" /></th>
    		<th><c:out value="${item.stokNm}" /></th>
		</tr>
		</c:forEach>
	</table>
</body>
</html>