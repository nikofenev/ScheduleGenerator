<div class="jumbotron">
    <div class="container">
        <h2>Welcome User</h2>
    </div>
</div>
<div class="container">
    <form action="./logOut" method="GET">
        <button class="btn btn-danger logOut" type="submit">Log Out</button>
    </form>
</div>
<div class="container">
    <h3></h3>
        <form class="form-horizontal" action="/saveAvailability" method="POST">
            <div class="form-group">
                <div class="input-group selectWeek date">
                    <input type="text" class="form-control selectWeek" id="weeklyDatePicker" placeholder="Select Week"  />
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
            </div>

            <field><legend>My Availability</legend></field>
            <div class="form-group">
                <label class="control-label col-sm-2" for="sundayFrom">Sunday:</label>
                <div class="col-sm-10">
                    <div class="hoursFields">
                        <input type='text' class="dateInputBoxHide" name="sundayDate" id="sundayDate" readonly/>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" name="sundayFrom" id="sundayFrom">${hoursList}</select>
                    </div>
                    <label for="sundayTo">to:</label>
                    <div class="hoursFields">
                        <select class="form-control" name="sundayTo" id="sundayTo">${hoursList}</select>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" name="sundayType">
                            <option value="permanent">Permanent</option>
                            <option value="temporary">Temporary</option>
                        </select>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-2" for="mondayFrom">Monday:</label>
                <div class="col-sm-10">
                    <div class="hoursFields">
                        <input type='text' class="dateInputBoxHide" name="mondayDate" id="mondayDate" readonly />
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" name="mondayFrom" id="mondayFrom">${hoursList}</select>
                    </div>
                    <label for="mondayTo">to:</label>
                    <div class="hoursFields">
                        <select class="form-control" name="mondayTo" id="mondayTo">${hoursList}</select>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" name="mondayType">
                            <option value="permanent">Permanent</option>
                            <option value="temporary">Temporary</option>
                        </select>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-2" for="tuesdayFrom">Tuesday:</label>
                <div class="col-sm-10">
                    <div class="hoursFields">
                        <input type='text' class="dateInputBoxHide" name="tuesdayDate" id="tuesdayDate" readonly />
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" name="tuesdayFrom" id="tuesdayFrom">${hoursList}</select>
                    </div>
                    <label for="tuesdayTo">to:</label>
                    <div class="hoursFields">
                        <select class="form-control" name="tuesdayTo" id="tuesdayTo">${hoursList}</select>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" name="tuesdayType" id="tuesdayType">
                            <option value="permanent">Permanent</option>
                            <option value="temporary">Temporary</option>
                        </select>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-2" for="wednesdayFrom">Wednesday:</label>
                <div class="col-sm-10">
                    <div class="hoursFields">
                        <input type='text' class="dateInputBoxHide" name="wednesdayDate" id="wednesdayDate" readonly/>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" name="wednesdayFrom" id="wednesdayFrom">${hoursList}</select>
                    </div>
                    <label for="wednesdayTo">to:</label>
                    <div class="hoursFields">
                        <select class="form-control" name="wednesdayTo" id="wednesdayTo">${hoursList}</select>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" name="wednesdayType" id="wednesdayType">
                            <option value="permanent">Permanent</option>
                            <option value="temporary">Temporary</option>
                        </select>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-2" for="thursdayFrom">Thursday:</label>
                <div class="col-sm-10">
                    <div class="hoursFields">
                        <input type='text' class="dateInputBoxHide" name="thursdayDate" id="thursdayDate" readonly/>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" name="thursdayFrom" id="thursdayFrom">${hoursList}</select>
                    </div>
                    <label for="thursdayTo">to:</label>
                    <div class="hoursFields">
                        <select class="form-control" name="thursdayTo" id="thursdayTo">${hoursList}</select>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" name="thursdayType" id="thursdayType">
                            <option value="permanent">Permanent</option>
                            <option value="temporary">Temporary</option>
                        </select>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-2" for="fridayFrom">Friday:</label>
                <div class="col-sm-10">
                    <div class="hoursFields">
                        <input type='text' class="dateInputBoxHide" name="fridayDate" id="fridayDate" readonly/>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" name="fridayFrom" id="fridayFrom">${hoursList}></select>
                    </div>
                    <label for="fridayTo">to:</label>
                    <div class="hoursFields">
                        <select class="form-control" name="fridayTo" id="fridayTo">${hoursList}</select>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" name="fridayType" id="fridayType">
                            <option value="permanent">Permanent</option>
                            <option value="temporary">Temporary</option>
                        </select>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-2" for="saturdayFrom">Saturday:</label>
                <div class="col-sm-10">
                    <div class="hoursFields">
                        <input type='text' class="dateInputBoxHide" name="saturdayDate" id="saturdayDate" readonly/>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" name="saturdayFrom" id="SaturdayFrom">${hoursList}</select>
                    </div>
                    <label for="saturdayTo">to:</label>
                    <div class="hoursFields">
                        <select class="form-control" name="saturdayTo" id="saturdayTo">${hoursList}</select>
                    </div>
                    <div class="hoursFields">
                        <select class="form-control" name="saturdayType" id="saturdayType">
                            <option value="permanent">Permanent</option>
                            <option value="temporary">Temporary</option>
                        </select>
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
