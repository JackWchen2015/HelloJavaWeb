<%--
  Created by IntelliJ IDEA.
  User: roobo
  Date: 2019-06-26
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  import="java.util.*" %>
<html>
<head>
  <title>用户登陆</title>
</head>
<body>
<h2>用户登录</h2>
<%
  List<String> info=(List<String>)request.getAttribute("info");
  if (info!=null)
  {
    Iterator<String>  iter=info.iterator();
    while (iter.hasNext())
    {
%>
<h4><%= iter.next()%></h4>
<%
    }
  }
%>


<form action="LoginServlet" method="post"  >
  用户ID:<input type="text" name="userid"><br>
  密码:<input type="password" name="userpass"><br>
  <input type="submit",value="登陆">
  <input type="reset",value="重置">
</form>
</body>
</html>

