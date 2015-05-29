//= require jquery
//= require bootstrap-datetimepicker/bootstrap-datetimepicker
//= require_self
$(document).ready(function() {
    $('input.datetimepicker').datetimepicker({
        autoclose: true,
        format: 'dd/mm/yyyy hh:ii',
        todayBtn: false,
        todayHighlight: true
    });
});
