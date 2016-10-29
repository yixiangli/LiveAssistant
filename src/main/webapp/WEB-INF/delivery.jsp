<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>快递查询</title>
</head>
<body>
	<h2>生活百宝箱</h2>
<div>

	<form action="/delivery/query">
		快递类型：
	    <select name="com_type">
	    	<option value="shentong">申通</option>
	    	<option value="ems">邮政&EMS</option>
	    	<option value="shunfeng">顺丰</option>
	    	<option value="yuantong">圆通</option>
	    	<option value="zhongtong">中通</option>
	    	<option value="yunda">韵达</option>
	    	<option value="tiantian">天天</option>
	    	<option value="huitongkuaidi">汇通</option>
	    	<option value="quanfengkuaidi">全峰</option>
	    	<option value="debangwuliu">德邦</option>
	    	<option value="zhaijisong">宅急送</option> 	
	    </select>
	    
	    快递单号：
		<input type="text" name="delivery_id">
		<br>
		<input type="submit" name="提交">
	</form>
</div>
</body>
</html>