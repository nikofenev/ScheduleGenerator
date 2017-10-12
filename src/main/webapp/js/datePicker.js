$(document).ready(function(){

    //Initialize the datePicker(I have taken format as mm-dd-yyyy)
    $("#weeklyDatePicker").datetimepicker({
        format: 'MM-DD-YYYY'
    });

    //Get the value of Start and End of Week
    $('#weeklyDatePicker').on('dp.change', function (e) {
        var value = $("#weeklyDatePicker").val();
        var sunday = moment(value, "MM-DD-YYYY").day(0).format("MM-DD-YYYY");
        var monday = moment(value, "MM-DD-YYYY").day(1).format("MM-DD-YYYY");
        var tuesday = moment(value, "MM-DD-YYYY").day(2).format("MM-DD-YYYY");
        var wednesday = moment(value, "MM-DD-YYYY").day(3).format("MM-DD-YYYY");
        var thursday = moment(value, "MM-DD-YYYY").day(4).format("MM-DD-YYYY");
        var friday = moment(value, "MM-DD-YYYY").day(5).format("MM-DD-YYYY");
        var saturday =  moment(value, "MM-DD-YYYY").day(6).format("MM-DD-YYYY");

        $("#weeklyDatePicker").val(sunday + " - " + saturday);

        //Sunday
        $("#sundayDate").val({
            format: 'MM-DD-YYYY'
        });
        $("#sundayDate").val(sunday);

        //Monday
        $("#mondayDate").val({
            format: 'MM-DD-YYYY'
        });
        $("#mondayDate").val(monday);

        //Tuesday
        $("#tuesdayDate").val({
            format: 'MM-DD-YYYY'
        });
        $("#tuesdayDate").val(tuesday);

        //Wednesday
        $("#wednesdayDate").val({
            format: 'MM-DD-YYYY'
        });

        $("#wednesdayDate").val(wednesday);

        //Thursday
        $("#thursdayDate").val({
            format: 'MM-DD-YYYY'
        });

        $("#thursdayDate").val(thursday);

        //Friday
        $("#fridayDate").val({
            format: 'MM-DD-YYYY'
        });

        $("#fridayDate").val(friday);

        //Saturday
        $("#saturdayDate").val({
            format: 'MM-DD-YYYY'
        });

        $("#saturdayDate").val(saturday);

    });
});

