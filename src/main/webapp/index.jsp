<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
   <mytag:welcome/>

</body>
</html>
