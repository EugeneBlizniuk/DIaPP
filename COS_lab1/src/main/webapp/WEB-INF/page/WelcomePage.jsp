<%--
  Created by IntelliJ IDEA.
  User: Yauheni
  Date: 15.02.2020
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome page</title>
    <link href="../../resource/style/WelcomePage.css" rel="stylesheet" type="text/css">
</head>
<body>
    <h1>1st Task</h1>
    <div class="container">
        <form action="/source-function" method="get">
            <input type="submit" value="first">
        </form>
        <form action="/amplitude-dft" method="get">
            <input type="submit" value="second">
        </form>
        <form action="/phase-dft" method="get">
            <input type="submit" value="third">
        </form>
        <form action="/reverse-dft" method="get">
            <input type="submit" value="fourth">
        </form>
        <form action="/amplitude-fft" method="get">
            <input type="submit" value="fifth">
        </form>
        <form action="/phase-fft" method="get">
            <input type="submit" value="sixth">
        </form>
        <form action="/reverse-fft" method="get">
            <input type="submit" value="seventh">
        </form>
    </div>
</body>
</html>
