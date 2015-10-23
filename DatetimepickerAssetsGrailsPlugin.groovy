class DatetimepickerAssetsGrailsPlugin {

    def version = "1.2.3"

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

    def documentation = "http://grails.org/plugin/datetimepicker-assets"

    def license = "APACHE"

    def scm = [ url: "https://github.com/tcrossland/grails-datetimepicker-assets" ]
    def issueManagement = [system: 'GitHub', url: 'https://github.com/tcrossland/grails-datetimepicker-assets/issues']
}
