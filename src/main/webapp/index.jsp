<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="mytag" uri="/WEB-INF/taglib/mytaglib.tld"%>
<html>
<head>
    <title>First web page</title>
</head>
<body>
    <form action="./hello" method="get">
        <input type="text" name="username" value=""/>
        <br>
        <input type="submit" name="ok" value="send"/>
    </form>

    <mytag:welcome name="Vasa">
        hfduuduewyuewyueiwyeuwyeuwyeweiuyewuiyewuffffhhhh
    </mytag:welcome>
    <c:set var="kkk" value="llllllllllllllll"/>
    <c:out value="${kkk}"/>

</body>
</html>
