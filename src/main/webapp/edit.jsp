<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Edit person</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/formStyle.css">
</head>
<body>

<div class="login-box">
    <h2>Edit person</h2>

    <form method="post" action="${pageContext.request.contextPath}/dispatcher">
        <input type="hidden" name="command" value="update">
        <input type="hidden" name="personId" value=${requestScope.person.id}>

        <div class="user-box">
            <input id="nameInput" type="text" name="name" value=${requestScope.person.name}>
            <label for="nameInput">Edit name</label>
        </div>
        <div class="user-box">
            <input id="typeInput" type="text" name="type" value=${requestScope.person.surname}>
            <label for="typeInput">Edit type</label>
        </div>
        <div class="user-box">
            <input id="weightInput" type="text" name="weight" value=${requestScope.person.surname}>
            <label for="weightInput">Edit weight</label>
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

