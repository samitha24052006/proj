<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login - Inventory System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5 text-center">
    <h2>College Inventory Management</h2>
    <p>Select your role to login:</p>
    <div class="d-grid gap-2 col-6 mx-auto mt-4">
        <a href="studentLogin.jsp" class="btn btn-primary btn-lg">Student Login</a>
        <a href="teamLogin.jsp" class="btn btn-success btn-lg">Team Login</a>
        <a href="staffLogin.jsp" class="btn btn-warning btn-lg">Staff Login</a>
        <a href="adminLogin.jsp" class="btn btn-danger btn-lg">Admin Login</a>
    </div>
</div>
</body>
</html>
