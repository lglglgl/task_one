<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>login</title>
</head>
<body>
<div>
    <#if failure != "laogao">
        <h3>账号或密码有误！</h3>
    </#if>
    <form action="/login" method="post">
        <label>账号：</label><input name="useraccount" type="text"><br>
        <label>密码：</label><input name="password" type="password"><br>
        <button>登录</button>
    </form>
    <a href="/register">注册</a>

</div>
</body>
</html>