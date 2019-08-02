<%--
  Created by IntelliJ IDEA.
  User: roobo
  Date: 2019-07-03
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="myTag" uri="JackChenTag" %>
<html>
  <head>
    <title>HelloWorld</title>
  </head>
  <body>
<%--<%--%>
<%--  request.setAttribute("info","Hello world!");--%>
<%--%>--%>

<%--<h1>${info}</h1>--%>
<%--<h2>IP:${pageContext.request.remoteAddr}</h2>--%>
<%--  <h2>SESSION ID:${pageContext.session.id}</h2>--%>
<%--<h2>是否是新seeeion：${pageContext.session.new}</h2>--%>

<h1><myTag:hello format="yyyy-MM-dd HH:mm"/></h1>
  </body>
</html>