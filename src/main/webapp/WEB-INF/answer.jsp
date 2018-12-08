<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Answer</title>
</head>
<body>
  Hello, ${requestScope.user}
  <c:forEach var="item" items="${sessionScope.lists}">
      <c:out value="${item}"/> <br>
  </c:forEach>
</body>
</html>
