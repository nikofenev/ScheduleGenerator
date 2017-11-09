<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="jumbotron">
    <div class="container">
        <h2>My Employees</h2>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="createNewEmployee">
            <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModal">Create New Employee</button>
        </div>
    </div>
    <!-- Modal -->
    <div class="modal fade" id="myModal" role="dialog">
        <div class="modal-dialog">

            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Create New Employee</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" action="/createNewUser" method="GET">
                        <div class="form-group">
                            <label class="control-label col-sm-3" for="userName">User Name:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="userName" placeholder="Enter user name" name="userName">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" for="pwd">Password:</label>
                            <div class="col-sm-9">
                                <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" for="firstName">First Name:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="firstName" placeholder="Enter first name" name="firstName">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" for="lastName">Last Name:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="lastName" placeholder="Enter last name" name="lastName">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" for="jobTitle">Job Title:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="jobTitle" placeholder="Enter job title" name="jobTitle">
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="submit" class="btn btn-default" >Submit</button>
                        </div>
                    </form>
                </div>
            </div>

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
                    <td><a href="/deleteUser?userId=${user.userid}" class="glyphicon glyphicon-trash"></a> | <a href="" class="glyphicon glyphicon-pencil"></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    </div>
</div>
