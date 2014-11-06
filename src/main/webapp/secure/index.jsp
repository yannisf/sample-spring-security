<!DOCTYPE html>
<html lang="en" ng-app="app">

<head>
    <meta charset="utf-8">
    <script>
        var user = {
            name: '${requestScope.name}',
            roles: '${requestScope.roles}'
        };
    </script>
    <script src="../scripts/angular.js"></script>
    <script src="../scripts/application.js"></script>
    <title>Sample Spring Security authentication application</title>
</head>

<body ng-controller="ResourceController">
    <h3>Secure</h3>

    <p>
        Welcome <strong>{{user.name}}</strong>.
        Granted authorities are <strong>{{user.roles}}</strong>.
        <a href="../logout">Logout</a>
    </p>

    <button ng-click="view()" >View</button>
    <button ng-click="edit()" ng-show="isAdmin()">Edit</button>

</body>
</html>
