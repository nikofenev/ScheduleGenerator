<h2>Welcome User</h2>
<div class="container">
    <h3></h3>
        <form class="form-horizontal" method="POST">
            <div class="form-group">
                <label class="control-label col-sm-2" for="sundayFrom">Sunday:</label>
                <div class="col-sm-10">
                    <div class="hoursFields">
                        <select class="form-control" id="sundayFrom">${hoursList}</select>
                    </div>
                    <label for="sundayTo">to:</label>
                    <div class="hoursFields">
                        <select class="form-control" id="sundayTo">${hoursList}</select>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" id="typeAvailability"><option>Permanent</option></select>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-2" for="mondayFrom">Monday:</label>
                <div class="col-sm-10">
                    <div class="hoursFields">
                        <select class="form-control" id="mondayFrom">${hoursList}</select>
                    </div>
                    <label for="mondayTo">to:</label>
                    <div class="hoursFields">
                        <select class="form-control" id="mondayTo">${hoursList}</select>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" id="typeAvailability"><option>Permanent</option></select>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-2" for="tuesdayFrom">Tuesday:</label>
                <div class="col-sm-10">
                    <div class="hoursFields">
                        <select class="form-control" id="tuesdayFrom">${hoursList}</select>
                    </div>
                    <label for="tuesdayTo">to:</label>
                    <div class="hoursFields">
                        <select class="form-control" id="tuesdayTo">${hoursList}</select>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" id="typeAvailability"><option>Permanent</option></select>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-2" for="wednesdayFrom">Wednesday:</label>
                <div class="col-sm-10">
                    <div class="hoursFields">
                        <select class="form-control" id="wednesdayFrom">${hoursList}</select>
                    </div>
                    <label for="wednesdayTo">to:</label>
                    <div class="hoursFields">
                        <select class="form-control" id="wednesdayTo">${hoursList}</select>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" id="typeAvailability"><option>Permanent</option></select>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-2" for="thursdayFrom">Thursday:</label>
                <div class="col-sm-10">
                    <div class="hoursFields">
                        <select class="form-control" id="thursdayFrom">${hoursList}</select>
                    </div>
                    <label for="thursdayTo">to:</label>
                    <div class="hoursFields">
                        <select class="form-control" id="thursdayTo">${hoursList}</select>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" id="typeAvailability"><option>Permanent</option></select>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-2" for="fridayFrom">Friday:</label>
                <div class="col-sm-10">
                    <div class="hoursFields">
                        <select class="form-control" id="fridayFrom">${hoursList}></select>
                    </div>
                    <label for="fridayTo">to:</label>
                    <div class="hoursFields">
                        <select class="form-control" id="fridayTo">${hoursList}</select>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" id="typeAvailability"></select>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-2" for="saturdayFrom">Saturday:</label>
                <div class="col-sm-10">
                    <div class="hoursFields">
                        <select class="form-control" id="SaturdayFrom">${hoursList}</select>
                    </div>
                    <label for="saturdayTo">to:</label>
                    <div class="hoursFields">
                        <select class="form-control" id="saturdayTo">${hoursList}</select>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" id="typeAvailability"><option>Permanent</option></select>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-5 col-sm-10">
                    <button type="submit" class="btn btn-default">Submit</button>
                </div>
            </div>
        </form>
</div>
