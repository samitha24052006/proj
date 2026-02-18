<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Team Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5 col-md-4">
    <h3 class="text-center">Team Login</h3>
    <form action="LoginServlet" method="post">
        <input type="hidden" name="role" value="team">
        <div class="mb-3">
            <label>Team ID</label>
            <input type="text" name="team_id" class="form-control" required>
        </div>
        <div class="mb-3">
            <label>Password</label>
            <input type="password" name="password" class="form-control" required>
        </div>
        <button class="btn btn-success w-100" type="submit">Login</button>
        <p class="mt-3 text-center"><a href="teamRegister.jsp">Register as Team</a></p>
    </form>
</div>
</body>
</html>
