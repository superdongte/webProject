<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
   $(function() {
      $("#delete").click(function() {
         var con_test = confirm("정말 삭제하시겠습니까?");
         if(con_test == true){
            location.href = "list.do";
          return true;
         }
         else if(con_test == false){
           return false;
         }
      })
   })
</script>
<style>
	section{
		width:1024px;
		margin:0 auto;
	}
	table{
		border-collapse: collapse;
		margin:0 auto;
	}
	td,th,tr{
		border:1px solid black;
	}
	#menu{
		text-align: right;	
	}
	footer{
		
	}
</style>
</head>
<body>
	<header>
		<jsp:include page="module/header.jsp"></jsp:include>
	</header>
	<section>
	<table>
		<tr>
			<th>프로젝트 이름</th>
			<td>${proj.title }</td>
		</tr>
		<tr>
			<th>프로젝트 내용</th>
			<td>${proj.pro_content }</td>
		</tr>
		<tr>
			<th>시작날짜</th>
			<td><fmt:formatDate value="${proj.pro_start }" pattern="yyyy-MM-dd" type="date" dateStyle="short"></fmt:formatDate></td>
		</tr>
		<tr>
			<th>종료날짜</th>
			<td><fmt:formatDate value="${proj.pro_end }" pattern="yyyy-MM-dd" type="date" dateStyle="short"></fmt:formatDate></td>
		</tr>
		<tr>
			<th>상태</th>
			<td>${proj.pro_state}</td>
		</tr>
	</table>
		<div id="menu">
		<a href="update.do?no=${proj.project_no }&title=${proj.title}&pro_content=${proj.pro_content }&pro_start=<fmt:formatDate value="${proj.pro_start }" pattern="yyyy-MM-dd" type="date" dateStyle="short"></fmt:formatDate>&pro_end=<fmt:formatDate value="${proj.pro_end }" pattern="yyyy-MM-dd" type="date" dateStyle="short"></fmt:formatDate>&pro_state=${proj.pro_state}">[수정]</a>
		<a href="delete.do?no=${proj.project_no }" id="delete">[삭제]</a>
		<a href="list.do">[돌아가기]</a>
		</div>
	</section>
	<footer>
	<jsp:include page="module/fotter.jsp"></jsp:include>
	</footer>
</body>
</html>