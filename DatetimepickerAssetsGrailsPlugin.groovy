class DatetimepickerAssetsGrailsPlugin {

    def version = "1.2"

    def grailsVersion = "2.3 > *"

    def pluginExcludes = ["grails-app/views/**"]

    def title = "Bootstrap date and datetime picker assets"
    def author = "Tom Crossland"
    def authorEmail = "tom.crossland@bluetab.net"
    def description = '''\
Provides assets for Bootstrap date and datetime picker widgets:

https://github.com/eternicode/bootstrap-datepicker
https://github.com/smalot/bootstrap-datetimepicker
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/datetimepicker-assets"

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"
}
