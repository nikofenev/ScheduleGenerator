<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="jumbotron">
    <div class="container">
        <h2>My Stores</h2>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="addNewStore">
            <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModal">Add New Store</button>
        </div>
    </div>

    <div class="row">
        <div class="table-responsive">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>Store Name</th>
                    <th>Shifts Needed</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${allStores}" var="store">
                    <tr>
                        <td>${store.storeName}</td>
                        <td><a href="storeShifts?storeId=${store.storeId}">See Shifts</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

