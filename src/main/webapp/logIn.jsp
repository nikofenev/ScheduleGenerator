<%@include file="jsp/taglib.jsp"%>
<c:import url="jsp/head.jsp" />
<html>

<title>Home</title>

<body>

<div class="container">
    <div class="login-container">
        <div id="output"></div>
        <div class="avatar">
        </div>
        <h3>S c h e d u</h3>
        <p>Schedule Generator</p>
        <div class="form-box">
            <form action="j_security_check" method="POST">
                <input name="j_username" type="text" placeholder="username">
                <input name="j_password" type="password" placeholder="password">
                <button class="btn btn-info btn-block login" type="submit">Login</button>
            </form>
        </div>
    </div>
</div>

</body>

</html>
