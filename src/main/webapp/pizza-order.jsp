<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Pizza Form" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />

<form method="POST" action="pizza-order">
    <label for="crust-type">Crust Type: </label>
    <select name="crust-type" id="crust-type">
        <option value="thin">Thin</option>
        <option value="hand-tossed">Hand Tossed</option>
        <option value="pan">Pan</option>
        <option value="stuffed">Stuffed</option>
    </select>
    <label for="sauce-type">Sauce Type: </label>
    <select name="sauce-type" id="sauce-type">
        <option value="classic">Classic</option>
        <option value="bbq">Barbeque</option>
        <option value="ranch">Ranch</option>
        <option value="white">White</option>
    </select>
    <label for="size">Size: </label>
    <select name="size" id="size">
        <option value="small">Small</option>
        <option value="med">Medium</option>
        <option value="large">Large</option>
        <option value="x-large">Extra Large</option>
    </select>
    <br>
    <h4>Toppings:</h4>
    <input type="checkbox" id="sausage" name="topping" value="sausage">
    <label for="sausage">Sausage</label><br>
    <input type="checkbox" id="pepperoni" name="topping" value="pepperoni">
    <label for="pepperoni">Pepperoni</label><br>
    <input type="checkbox" id="bacon" name="topping" value="bacon">
    <label for="bacon">Bacon</label><br>
    <input type="checkbox" id="pepper" name="topping" value="pepper">
    <label for="pepper">Green Pepper</label><br>
    <input type="checkbox" id="onion" name="topping" value="onion">
    <label for="onion">Red Onion</label>
    <br>
    <label for="address">Address: </label>
    <input type="text" name="address" id="address">
    <br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
