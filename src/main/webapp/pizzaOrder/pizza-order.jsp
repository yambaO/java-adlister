
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Order Pizza</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<jsp:include page="/partials/pizza-navbar.jsp"/>
<div>
    <h1>Create your own pizza</h1>
    <form action="pizza-order" method="post">
        <div class="crust-type">
            <label for="crust"><strong>Crust</strong>:</label>
            <select class="form-control" id="crust">
                <option>Thin crust</option>
                <option>Regular crust</option>
                <option>Thick crust</option>
                <option>Stuffed crust</option>
                <option>Hand-Tossed crust</option>
            </select>
        </div>
        <div class="sauce-type">
            <label for="sauce"><strong>Sauces</strong> :</label>
            <select class="form-control" id="sauce" >
                <option>Marinara sauce</option>
                <option>BBQ sauce</option>
                <option>Buffalo sauce</option>
                <option>Alfredo sauce</option>
                <option>Garlic sauce</option>
            </select>
        </div>
        <fieldset>
            <legend><strong>Toppings</strong></legend>
            <label for="sauce"><strong>Meat</strong> :</label>
                <label class="checkbox-inline"><input type="checkbox" value="">Ham</label>
                <label class="checkbox-inline"><input type="checkbox" value="">Sausage</label>
               <label class="checkbox-inline"><input type="checkbox" value="">Pepperoni</label>
               <label class="checkbox-inline"><input type="checkbox" value="">Beef</label>
            <label class="checkbox-inline"><input type="checkbox" value="">Chicken</label>
        </fieldset>
        <fieldset>
            <label for="sauce"><strong>Vegetables</strong> :</label>
            <label class="checkbox-inline"><input type="checkbox" value="">Onions</label>
            <label class="checkbox-inline"><input type="checkbox" value="">Mushrooms</label>
            <label class="checkbox-inline"><input type="checkbox" value="">Green pepper</label>
            <label class="checkbox-inline"><input type="checkbox" value="">Tomatoes</label>
        </fieldset>
        <div class="form-group">
            <label for="delivery">Delivery Address:</label>
            <input type="text" class="form-control" id="delivery">
        </div>
    </form>
</div>
</body>
</html>
