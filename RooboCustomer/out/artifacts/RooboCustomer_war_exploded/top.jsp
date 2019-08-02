<%--
  Created by IntelliJ IDEA.
  User: roobo
  Date: 2019-08-01
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- 他的作用是为本页面所有的表单和超链接指定显示内容的框架-->
    <base target="main">
    <title>My JSP 'top.jsp' starting page</title>
</head>
<body style="text-align: center">
<h1>roobo会员管理系统</h1>
<a href="<c:url value='/add.jsp'/>">添加会员</a>
<a href="<c:url value='/CustomerServlet?method=findAll'/>">查找会员</a>
<a href="<c:url value='/query.jsp'/>">高级搜索</a>
<a href="<c:url value='/CustomerServlet?method=batchAdd'/>">批量添加</a>
</body>
</html>
