$(document).ready(function(){

    //Initialize the datePicker(I have taken format as mm-dd-yyyy, you can     //have your owh)
    $("#weeklyDatePicker").datetimepicker({
        format: 'MM-DD-YYYY'
    });

    //Get the value of Start and End of Week
    $('#weeklyDatePicker').on('dp.change', function (e) {
        var value = $("#weeklyDatePicker").val();
        var firstDate = moment(value, "MM-DD-YYYY").day(0).format("MM-DD-YYYY");
        var lastDate =  moment(value, "MM-DD-YYYY").day(6).format("MM-DD-YYYY");
        $("#weeklyDatePicker").val(firstDate + " - " + lastDate);
    });
});

