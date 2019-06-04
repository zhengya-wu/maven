<html>
<body>
	<h2>Hello World!Order web Index</h2>
	<%@page import="com.wzy.maven.orders.controller.OrderController"%>
	<%
		OrderController controller = new OrderController();
		System.out.println(controller.getOrders("pencli"));
	%>
</body>
</html>
