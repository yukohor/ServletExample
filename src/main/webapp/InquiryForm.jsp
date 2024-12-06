<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問合せ</title>
</head>
<body>
<form action="testenq" method="post">
<select name="qtype" form="examples">
<option value="company">会社について</option>
<option value="product">製品について</option>
<option value="support">アフターサポートについて</option>
<textarea name="body"></textarea>
</select>
</body>
</html>