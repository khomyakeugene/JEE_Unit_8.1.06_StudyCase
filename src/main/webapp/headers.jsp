<%@ page import="java.util.Enumeration" %>
<%--
  Created by IntelliJ IDEA.
  User: Yevhen
  Date: 09.07.2016
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HTTP Header Request Example</title>
</head>
<body>
<h2>HTTP Header Requset Example</h2>
<table width="100%" border="1" align="center">
    <tr bgcolor="#949494">
        <th>Header Name</th>
        <th>Header Value</th>
    </tr>
    <%
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            out.print("<tr><td>" + headerName + "</td>\n");
            out.print("<td>" + headerValue + "<td></tr>\n");
        }
    %>
</table>
</body>
</html>
