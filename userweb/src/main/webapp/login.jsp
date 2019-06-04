<html>
<body>
	<h2>Hello World!User web Login</h2>
	<%@page import="com.wzy.userweb.controller.UserController"%>
	<%
		UserController controller = new UserController();
		System.out.println(controller.getUser("wzy Login").toString());
	%>
</body>
</html>
