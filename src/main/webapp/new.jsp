<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>New person</title>
</head>
<body>
<div class="login-box">
    <h2>Add animal</h2>

    <form method="post" action="${pageContext.request.contextPath}/dispatcher">
        <input type="hidden" name="command" value="create">

        <div class="user-box">
            <input id="nameInput" type="text" name="name">
            <label for="nameInput">Enter name</label>
        </div>
        <div class="user-box">
            <input id="TypeInput" type="text" name="type">
            <label for="TypeInput">Enter type</label>
        </div>
        <div class="user-box">
            <input id="WeightInput" type="text" name="Weight">
            <label for="WeightInput">Enter weight</label>
        </div>
        <a href="#" onclick="this.closest('form').submit();return false;">
            <span></span>
            <span></span>
            <span></span>
            <span></span>
            Save
        </a>

    </form>

</div>
</body>
</html>
