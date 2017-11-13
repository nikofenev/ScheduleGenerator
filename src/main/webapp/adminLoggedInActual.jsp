<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <form action="./logOut" method="GET">
        <button class="btn btn-danger logOut" type="submit">Log Out</button>
    </form>
</div>
<div class="container">
    <div class="login-container">
        <div class="form-box">
            <form action="./myEmployees" method="GET">
                <button class="btn btn-info btn-block login" type="submit">My Employees</button>
            </form>
            <form action="./mySchedules" method="GET">
                <button class="btn btn-info btn-block login" type="submit">My Schedules</button>
            </form>
            <form action="./myStores" method="GET">
                <button class="btn btn-info btn-block login" type="submit">My Stores</button>
            </form>
        </div>
    </div>

    <div class="row">
        <div class="table-responsive">
        <div class="container">
            <h1 class="holidaysHeader">Holidays</h1>
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>Holiday Name</th>
                    <th>Date</th>
                    <th>National</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${listHolidays}" var="holiday">
                    <tr>
                        <td>${holiday.name}</td>
                        <td>${holiday.date}</td>
                        <td>${holiday.national}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        </div>
    </div>
</div>
