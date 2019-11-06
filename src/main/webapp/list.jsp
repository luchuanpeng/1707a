<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
</head>
<body>
	
	<table>
		<tr>
			<td>商品名称</td>
			<td>英文名称</td>
			<td>商品品牌</td>
			<td>商品种类</td>
			<td>尺寸</td>
			<td>单价</td>
			<td>数量</td>
			<td>标签</td>
			<td>商品图片上传</td>
		</tr>
		<c:forEach items="${page.list }" var="l">
			<tr>
				<td>${l.gname }</td>
				<td>${l.gname2 }</td>
				<td>${l.bname }</td>
				<td>${l.kname }</td>
				<td>${l.gsize }</td>
				<td>${l.gmoney }</td>
				<td>${l.gcount }</td>
				<td>${l.gbq }</td>
				<td><img height="50" width="50"  src="lookImg?path=${l.gpic }"></td>
			</tr>
		</c:forEach>
	</table>
	<a href="add.jsp"><input type="button" value="添加"></a>
</body>
</html>