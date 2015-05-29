//= require jquery
//= require eternicode-bootstrap-datepicker/bootstrap-datepicker
//= require_self
jQuery(document).ready(function ($) {
    $('input.datepicker').datepicker({
        autoclose: true,
        format: 'dd/mm/yyyy',
        todayBtn: 'linked',
        todayHighlight: true
    });
});
