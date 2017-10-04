<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="jumbotron">
    <div class="container">
        <h2>My Employees</h2>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="createNewEmployee">
            <button type="button" class="btn btn-danger">Create New Employee</button>
        </div>
    </div>
    <div class="row">
    <div class="table-responsive">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Job Title</th>
                <th>Performance</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${allUsers}" var="user">
                <tr>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.jobTitle}</td>
                    <td>${user.performance}</td>
                    <td><a href="" class="glyphicon glyphicon-trash"></a> | <a href="" class="glyphicon glyphicon-pencil"></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    </div>
</div>
