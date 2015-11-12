//= require jquery
//= require eternicode-bootstrap-datepicker/bootstrap-datepicker
//= require_self
jQuery(document).ready(function ($) {
    var options = {
        autoclose: true,
        format: 'dd/mm/yyyy',
        todayBtn: 'linked',
        todayHighlight: true,
        zIndexOffset: 1040
    };
    $('div.daterangepicker').datepicker(options);
    $('input.datepicker').datepicker(options);
});
