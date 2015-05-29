<head>
  <meta name='layout' content='main'/>
  <title>Datepicker Assets</title>

  <asset:stylesheet src="datepicker"/>
  <asset:stylesheet src="datetimepicker"/>

  <asset:javascript src="datepicker"/>
  <asset:javascript src="datetimepicker"/>
</head>

<body>
  <div class="page-header">
    <h1>Bootstrap datetime widgets</h1>
  </div>
  <div class="row">
    <div class="col-xs-6">
      <form role="form">
        <div class="form-group">
          <label for="input1">Date</label>
          <input id="input1" class="form-control datepicker" placeholder="dd/MM/yyyy" style="width: 7.5em;"/>
          <span class="help-block">This is a <a href="https://github.com/eternicode/bootstrap-datepicker" target="_blank">bootstrap-datepicker</a>.
          </span>
        </div>
        <div class="form-group">
          <label for="input2">Date & Time</label>
          <input id="input2" class="form-control datetimepicker" placeholder="dd/MM/yyyy HH:mm" style="width: 10.5em;"/>
          <span class="help-block">This is a <a href="https://github.com/smalot/bootstrap-datetimepicker" target="_blank">bootstrap-datetimepicker</a>.
          </span>
        </div>
      </form>
    </div>
  </div>
</body>

