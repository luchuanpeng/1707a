<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<form action="addGoods" method="post" enctype="multipart/form-data">
		商品名称:<input type="text" name="gname"><br><br>
		英文名称:<input type="text" name="gname2"><br><br>
		商品品牌:<select id="brand" name="bid">
					
			  </select><br><br>
		商品种类:<select id="kind" name="kid">
		
			  </select><br><br>
		尺寸:<input type="text" name="gsize"><br><br>
		单价(元):<input type="text" name="gmoney"><br><br>
		数量:<input type="text" name="gcount"><br><br>
		标签:<input type="text" name="gbq"><br><br>
		商品图片上传:<input type="file" name="gpic"><br><br>
		<input type="submit" value="提交"><br><br>
	</form>
</body>
<script type="text/javascript">
$(function(){
	$.post("querySelect",function(data){
		var brand = data.brandList;
		var kind = data.kindList;
		
		var str = "";
		for(var i in brand){
			str+="<option value='"+brand[i].bid+"'>"+brand[i].bname+"</option>";
			console.log(brand[i]);
		}
		var str2 = "";
		for(var i in kind){
			str2+="<option value='"+kind[i].kid+"'>"+kind[i].kname+"</option>";
		}
		
		$("#brand").html(str);
		$("#kind").html(str2);
	},"json");
})
</script>
</html>