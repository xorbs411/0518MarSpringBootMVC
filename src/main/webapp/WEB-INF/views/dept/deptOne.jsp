<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 정보 확인</title>
</head>
<body><!-- deptAll -->
<h3>원하는 부서를 선택하세요 </h3>
<select>
<c:forEach items="${ deptAll}" var="dept">
    <option value="${dept.deptno }">${dept.dname }</option>
</c:forEach>
</select>
<span></span>

<sript src="https://code.jquery.com/jquery-3.6.0.min.js"></sript>
<script>
$(function(){
	$("option").click(function(){
		let no =$(this).val():
		$.ajax(
				).done(function(data) {
					
				})
	})
})


</script>

</body>
</html>