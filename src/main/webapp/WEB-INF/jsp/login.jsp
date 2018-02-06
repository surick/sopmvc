<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/global.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include file="/WEB-INF/jsp/common/basejs.jsp"%>
    <title>SOP</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${path}resource/static/style/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="${path}resource/static/style/css/login.css">
</head>
<body>
<div class="container">
    <form class="form-signin" action="login" method="POST">
        <h2 class="form-signin-heading">用户登录</h2>
        <input type="text" class="input-block-level" placeholder="用户名" name="username">
        <input type="password" class="input-block-level" placeholder="密码" name="password">
        <button class="btn btn-large btn-primary" type="submit">登录</button>
    </form>
</div>
</body>
</html>