<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 24/10/2022
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Register</title>
</head>

<body>

<form method="post" name="registerForm" action="register" class="col-8">
    <div class="form-group row">
        <input type="hidden" name="type" value="add">
        <div class="col-6">
            <label for="firstname" class="form-label">Firstname</label>
            <input type="text" name="firstname" id="firstname" class="form-control">
        </div>
        <div class="col-6">
            <label for="lastname" class="form-label">Lastname</label>
            <input type="text" name="lastname" id="lastname" class="form-control">
        </div>
    </div>
    <div class="form-group col-12">
        <label for="username" class="form-label">Username</label>
        <input type="text" name="username" id="username" class="form-control">
    </div>
    <div class="form-group col-12">
        <label for="password" class="form-label">Password</label>
        <input type="password" name="password" id="password" class="form-control">
    </div>
    <div class="form-group mt-4">
        <input type="submit" value="Register" class="btn btn-primary col-12">
    </div>
</form>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

</body>

</html>
