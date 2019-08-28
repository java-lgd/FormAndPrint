<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jQuery.print.js"></script>
<title>打印、预览</title>
</head>
<body>
	<script type="text/javascript">
		function a() {
			$("#ddd").print();
		}
	</script>

	<input type="button" onclick=" a()" value="打印" />

	<div id="ddd">
			<tr>
				<td>test</td> <br>
				<td>test</td><br>
				<td>test</td><br>
				<td>test</td><br>
				<td>test</td><br>
			</tr>
	</div>
	
</body>
</html>