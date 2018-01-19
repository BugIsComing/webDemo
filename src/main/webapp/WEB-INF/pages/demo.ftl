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
</body>
</html>