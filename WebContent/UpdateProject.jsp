<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	section{
		width:1024px;
		margin:0 auto;
	}
	textarea {
		width:300px;
		height:200px;
	}
	label{
		float: left;
	}
</style>
</head>
<body>
	<header>
		<jsp:include page="module/header.jsp"></jsp:include>
	</header>
	<section>
		<form action="update.do" method="post">
		<input type="text" name="no" value="${no}">
		<p>
		<label>프로젝트 이름</label>
		<input type="text" name="title" value="${param.title }">
		</p>
		<p>
		<label>프로젝트 내용</label>		
		<textarea name="content">${param.pro_content }</textarea>	
		</p>
		<p>
		<label>시작날짜</label>
		<input type="text" name="pro_start" value="${param.pro_start }">
		</p>
		<p>
		<label>마감날짜</label>
		<input type="text" name="pro_end" value="${param.pro_end }">
		</p>
		<p>
		<label>상태:</label>
		<select name="pro_state" value="${param.pro_state }">
			<option>준비</option>
			<option>진행중</option>
			<option>종료</option>
			<option>보류</option>
		</select>
		</p>
		<p>
			<input type="submit" value="수정" name="save">
			<input type="reset" value="취소" name="cancel">
		</p>
		</form>	
	</section>	
	<footer>
		<jsp:include page="module/fotter.jsp"></jsp:include>
	</footer>
</body>
</html>