<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시글 쓰기</title>
</head>
<body>
	게시글 쓰기 입력 폼:
	<form method="post">
		<input type="hidden" name="parentId" value="10"/>
	     제목: <input type="text" name="title"/><br/>
	     내용: <textarea name="content"></textarea><br/>
	     <input type="submit"/>
	</form>

</body>
</html>