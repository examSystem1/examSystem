<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: jax
  Date: 2019/1/5
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>editPaper</title>
</head>
<body>
<s:form action="addExam" method="post">
    考试科目：<select name="cno">
    <s:iterator id="course" value="list1">
        <option value="<s:property value="#course[0]"/>">
            <s:property value="#course[0]"/>
            <s:property value="#course[1]"/>
        </option>
    </s:iterator>
    </select>
    考试名称：<input type="text" name="exam.ename">
    开考日期：<input type="date" name="exam.beginDate">
    最后日期：<input type="date" name="exam.endDate">
    考试时间：<input type="text" name="exam.etime">
    <br>
    <br>
    <br>
    <br>
    <br>
    <input type="submit" value="提交">
    <input type="reset" value="重填">
</s:form>

<s:debug/>
</body>
</html>
