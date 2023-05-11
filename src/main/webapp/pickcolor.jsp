<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Pick a Color" />
  </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />

<form method="POST" action="pickcolor">
  <label for="color">Enter a color: </label>
  <input type="text" name="color" id="color">
  <input type="submit" value="Submit">
</form>

</body>
</html>
