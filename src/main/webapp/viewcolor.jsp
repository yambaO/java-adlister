<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="/partials/head.jsp"/>
  <jsp:param name="title" value="Color viewer"/>
  <jsp:include>
  <style>
    body {
      background-color: ${color};
    }
  </style>

</head>
<body>
<jsp:include page="/partials/navbar.jsp"/>
</body>
</html>
