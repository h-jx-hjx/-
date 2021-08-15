<%@ page import="java.util.ArrayList" %>
<%@ page import="com.hjx.pojo.Good" %><%--
  Created by IntelliJ IDEA.
  User: 侯嘉旋
  Date: 2021/8/11
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>搜索功能</title>

</head>

<body>
<form action="SearchServlet" method="post">
    <input type="text" userid="kw"/><input type="submit" value="搜索"/>
    <table border="1">
        <tr><th>用户id</th></tr>
        <%try {
    ArrayList<Good> glist =(ArrayList<Good>)request.getAttribute("list");
    for(Good g:glist){%>
        <tr><td><%=g.getUserid()%></td></tr>
        <%
    }
        }catch (Exception e) {
    }%>
    </table>
</form>

</body>
</html>
