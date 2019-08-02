<%--
  Created by IntelliJ IDEA.
  User: roobo
  Date: 2019-08-01
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主页</title>
</head>
<frameset rows="30%,*">
    <frame src="<c:url value='/top.jsp'/>" name="top">
    <frame src="<c:url value='/welcome.jsp'/>" name="main">
</frameset>
</html>
