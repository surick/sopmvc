<%--
  Created by IntelliJ IDEA.
  User: w24164
  Date: 2018/2/5
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>SOP电子分发系统登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link type="text/css" rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>"/>
    <link type="text/css" rel="stylesheet" href="<c:url value="/css/login.css"/>"/>
</head>
<body>
<div class="container">
    <form class="form-signin" action="login" method="post">
        <h2 class="form-signin-heading">用户登录</h2>
        <input type="text" class="input-block-level" placeholder="用户名" name="username">
        <input type="password" class="input-block-level" placeholder="密码" name="password">
        <button class="btn btn-large btn-primary" type="submit">登录</button>
    </form>
</div>
</body>
</html>
