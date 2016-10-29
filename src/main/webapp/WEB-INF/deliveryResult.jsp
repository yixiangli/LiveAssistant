<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 必须要加上 否则jstl无法使用 -->
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>快递物流信息</title>
</head>
<body>

	运单编号：<c:out value="${del_bean.nu}"></c:out> <br>
	运单信息：<c:out value="${del_bean.message}"></c:out>  <br>
	运单公司：<c:out value="${del_bean.com}"></c:out>  <br>
 	<hr>
 	详细信息：
 	<br>
	<c:forEach items="${del_bean.data}" var="info">  
		${info.time} <br>
		${info.context} <br>
		${info.ftime} <br>
		<hr>
	</c:forEach>
</body>
</html>