<!DOCTYPE html>
<html>
<head>
    <%@ page language="java" contentType="text/html; charset=utf-8"
             pageEncoding="utf-8" %>
    <meta charset="utf-8">
    <%@    taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="tags" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Web Demo</title>

</head>

<body>

<div>

    <div>
        <h3>
            Login Page
        </h3>
    </div>
    <form:form role="form" method="post">

        <div class="form-group">
            <label for="username">Username</label>
            <input id="username" name="username" value="admin" required autofocus/>
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" value="admin" required/>

        </div>


        <button type="submit" class="btn btn-primary">
            Submit
        </button>
    </form:form>
</div>
</body>
</html>
