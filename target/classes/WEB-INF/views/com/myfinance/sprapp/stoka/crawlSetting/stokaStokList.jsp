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
	<div>
		<h1>주식관리현황</h1>
		<table border="1">
			<th>순서</th>
			<th>주식이름</th>
			<th>주식ID</th>
			<tr>
				<td colspan="3">nothing listed</td>
			</tr>
			<c:forEach var="item" items="${stokList}" varStatus="status">
			<tr>
				<th>${status.count}</th>
	    		<th><c:out value="${item.stokId}" /></th>
	    		<th><c:out value="${item.stokNm}" /></th>
			</tr>
			</c:forEach>
		</table>
	</div>
	</br>
	</br>
	</br>
	</br>
	<div>
		<h1>insert stock</h1>
		<form id="stockInsertList" action="/stoka/stokaInsertStok.do" method="get">
			<input type="text" name="stokId" id="stokId" placeholder="stock id">
			<input type="text" name="stokNm" id="stokNm" placeholder="stock name">
			<input type="submit" id="submitStokInfo">
		</form>
	</div>
</body>
</html>