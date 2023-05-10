<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create a Blog Post</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <style>
        #title {
            font-size: 16px;
        <c:if test="${font != null}">
            font-size: ${font}px;
        </c:if>
        }
    </style>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />
<div class="container">
    <h1>Create a Blog Post</h1>
    <form action="createPost" method="post">
        <label for="subject">Title:</label>
        <input type="text" name="title" id="subject">
        <label for="post">Your post:</label>
        <textarea name="post" id="post" cols="30" rows="10"></textarea>
        <fieldset>
            <legend>Topic:</legend>
            <label for="programming">Programming:</label>
            <input type="checkbox" name="topic" value="programming" id="programming"><br>
            <label for="AI">AI:</label>
            <input type="checkbox" name="topic" value="AI" id="AI"><br>
            <label for="security">Security:</label>
            <input type="checkbox" name="topic" value="security" id="security"><br>
        </fieldset>
        <label for="font-size">Font size of title:</label>
        <input type="number" name="font-size" id="font-size">
        <input type="submit" value="Submit">
    </form>
    <c:if test="${post != null}">
        <h2>Your blog post:</h2>
        <h3 id="title">${post.title}</h3>
        <p>${post.post}</p>
        <p>Topics:</p>
        <ul>
            <c:forEach var="topic" items="${post.topics}">
                <li>${topic}</li>
            </c:forEach>
        </ul>
    </c:if>
</div>

</body>
</html>
