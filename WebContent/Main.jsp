<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#container{
		margin:0 auto;
	}
	table{
		border: 1px solid black;
		border-collapse: collapse;
		margin:0 auto;
	}
	tr{
		border: 1px solid black;
		color:black;
	}
	td{
		border: 1px solid black;
		color:black;
	}
	th{
		border: 1px solid black;
		color:black;
	}
	section{
		width:1024px;
		margin:0 auto;
		text-align: center;
	}
</style>
</head>
<body>
	<div id="container">
	<header>
		<jsp:include page="module/header.jsp"></jsp:include>
	</header>
	<section>
		<a href="insert.do">[새 프로젝트 등록]</a>
		<a href="list.do">리스트보기</a>
		<table>
			<tr>
			<th>프로젝트 이름</th>
			<th>시작날짜</th>
			<th>종료날짜</th>
			<th>상태</th>
			</tr>
		<c:forEach var="project" items="${list}">
			<tr>
				<td><a href="read.do?no=${project.project_no }">${project.title }</a></td>
				<td><fmt:formatDate value="${project.pro_start }" pattern="yyyy-MM-dd" type="date" dateStyle="short"></fmt:formatDate></td>
				<td><fmt:formatDate value="${project.pro_end }" pattern="yyyy-MM-dd" type="date" dateStyle="short"></fmt:formatDate></td>
				<td>${project.pro_state }</td>
			</tr>
		</c:forEach>
		</table>
	</section>
	<footer>
		<jsp:include page="module/fotter.jsp"></jsp:include>
	</footer>
	</div>
</body>
</html>