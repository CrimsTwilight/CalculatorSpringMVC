<%--
  Created by IntelliJ IDEA.
  User: kate
  Date: 22.09.21
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculation</title>
</head>
<body>
<form action="/calculation" method="post">
    <input type="number" placeholder="Num 1" name="num1">
    <input type="number" placeholder="Num 2" name="num2">
    <input type="text" placeholder="Operation" name="operation">
    <button>Submit</button>
</form>
<p>${result}</p>
</body>
</html>