<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
${username!}
<ul>
<#list loglist as loglist>
    <li> ${loglist.username}</li>
    <li>${loglist.createtime?string('yyyy-MM-dd')}</li>
</#list>
</ul>
<ul>
    <#--static前面不能加斜杠-->
<img src = "static/images/login.jpg"/>
</ul>
</body>
</html>