<html>
<body>
	<h2>Hello World!Order web order</h2>
	<%@page import="com.wzy.maven.orders.controller.OrderController"%>
	<%
		OrderController controller = new OrderController();
		System.out.println(controller.getOrders("pencli"));
	%>
</body>
</html>
