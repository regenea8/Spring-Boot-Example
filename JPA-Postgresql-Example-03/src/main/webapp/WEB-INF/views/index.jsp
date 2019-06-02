<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
</style>
<script type="text/javascript">
	$(document).ready(function() {
		$.ajax({
			url : "/ajax",
			type : "POST",
			dataType : "json",
			//data : JSON.stringify(params),
			contentType : "application/json; charset=UTF-8",
			beforeSend : function() {

			},
			success : function(data) {
				console.log(data);
			},
			error : function(request, status, error) {
				alert("list search fail :: error code: "
						+ request.status + "\n" + "error message: "
						+ error + "\n");
			}
		});
	});
</script>
</head>
<body>
	<div class="wrap">
		<div class="top"></div>
		<div class="middel">

			<c:forEach items="${list }" var="board">
			${board.boardSeq } / ${board.title } / ${board.content } / ${board.user.userName } <br>
			</c:forEach>

		</div>
		<div class="footer"></div>
	</div>
	<script type="text/javascript">
		
	</script>
</body>
</html>