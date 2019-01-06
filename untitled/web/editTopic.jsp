<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: jax
  Date: 2019/1/5
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>editTopic</title>
</head>
<body>
<form action="addTopic.action" method="post">
    <input type="hidden" name="cno" value="<s:property value="cno" />">
    题目：<input type="text" name="topic.tname"><br>
    选项：<textarea name="topic.choice"></textarea><br>
    答案：<textarea name="topic.answer"></textarea><br>
    <input type="submit" value="提交">
    <input type="reset" value="重填">
</form>
</body>
</html>
