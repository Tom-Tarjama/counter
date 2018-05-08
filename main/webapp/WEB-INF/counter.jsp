<html>
	<head>
		 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	</head>
	<body>
		<p>You have visited https://your_server <c:out value="${count}"/> times</p>
		<p><a href="/your_server">Test another visit</a></p>
		<p><a href="/your_server/double_count">Add 2 to counter</a></p>
		<a href="/your_server/kill_session"><button>Kill Session</button></a>
		<a href="/your_server/reset_session"><button>Reset Session</button></a>
	</body>
</html>
 
 