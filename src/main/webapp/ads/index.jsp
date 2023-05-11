<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View ads</title>
</head>
<body>
<h1>Here are all the products:</h1>

<c:forEach var="ads" items="${ads}">
    <div class="ads">
        <p>${ads.id}</p>
        <p>name: $ ${ads.userId}</p>
        <p> n: $ ${ads.userId}</p
    </div>
</c:forEach>

</body>
</html>