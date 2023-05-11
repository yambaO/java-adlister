<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="/partials/head.jsp">
    <jsp:param name="title" value="Guessing Game" />
  </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />

<form method="POST" action="/guess">
  <label for="guess">Guess: </label>
  <input type="number" name="guess" id="guess">
  <input type="submit" value="Guess">
</form>

</body>
</html>
