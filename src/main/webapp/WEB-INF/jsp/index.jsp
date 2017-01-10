<!DOCTYPE html>
<html>
<head>
    <%@ page language="java" contentType="text/html; charset=utf-8"
             pageEncoding="utf-8" %>
    <meta charset="utf-8">
    <%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="tags" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Web Demo</title>

</head>

<body>

<div>

    <div>
        <h3>
            Index Page
        </h3>
        <br/>
        Host information: ${hostInformation}
    </div>
</div>
</body>
</html>
