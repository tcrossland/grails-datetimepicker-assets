# Grails plugin: Bootstrap date and datetime picker assets

Provides assets for Bootstrap date and datetime picker widgets:

 * [bootstrap-datepicker](https://github.com/eternicode/bootstrap-datepicker)
 * [bootstrap-datetimepicker](https://github.com/smalot/bootstrap-datetimepicker)

## Usage

Use the Asset Pipeline plugin to include the assets in the GSP page header.

For datepicker assets:

    <asset:stylesheet src="datepicker"/>
    <asset:javascript src="datepicker"/>

For datetimepicker assets:

    <asset:stylesheet src="datetimepicker"/>
    <asset:javascript src="datetimepicker"/>

## History

**Version 1.4.0** (2015-11-12)

* Change `zIndexOffset` option to 1040 (in front of Bootstrap fixed navbar)

**Version 1.1** (2015-11-03)

* bootstrap-datepicker 1.5.0

**Version 1.0** (2015-05-29)

* Initial release
  * bootstrap-datepicker 1.4.0
  * bootstrap-datetimepicker 2.3.4

## Software License Acknowledgements

**bootstrap-datepicker**
> Copyright 2012 Stefan Petre
>
> Licensed under the Apache License v2.0 (http://www.apache.org/licenses/LICENSE-2.0)

**bootstrap datetimepicker**
> Copyright 2012 Stefan Petre
>
> Licensed under the Apache License v2.0 (http://www.apache.org/licenses/LICENSE-2.0)
