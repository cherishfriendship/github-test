<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/26
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/user/add.action">
    用户名<input type="text" name="username">
    密码<input type="text" name="password"/>
    <input type="submit" value="提交">
</form>
</body>
</html>
