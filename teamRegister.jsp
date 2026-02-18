<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Team Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5 col-md-5">
    <h3 class="text-center">Team Registration</h3>
    <form action="RegisterTeamServlet" method="post">
        <div class="mb-3">
            <label>Team Name</label>
            <input type="text" name="teamName" class="form-control" required>
        </div>
        <div class="mb-3">
            <label>Team ID (Unique)</label>
            <input type="text" name="teamId" class="form-control" required>
        </div>
        <div class="mb-3">
            <label>Leader Email</label>
            <input type="email" name="leaderEmail" class="form-control" required>
        </div>
        <div class="mb-3">
            <label>Password</label>
            <input type="password" name="password" class="form-control" required>
        </div>
        <button class="btn btn-success w-100" type="submit">Register Team</button>
    </form>
</div>
</body>
</html>
