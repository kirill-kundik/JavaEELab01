<%--
  Created by IntelliJ IDEA.
  User: kyrylo_kundik
  Date: 2019-01-22
  Time: 09:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${title}</title>
</head>
<body>
<form action="/Lab01_war_exploded/check" method="post">
    <input type="text" name="login" placeholder="login">
    <input type="password" name="password" placeholder="password">
    <input type="submit" value="Submit">
</form>
</body>
</html>
