grails.project.work.dir = 'target'

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {

    inherits "global"
    log "warn"

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    plugins {
        runtime(":jquery:1.11.1", ":twitter-bootstrap:3.3.4") { export = false }
        compile(":asset-pipeline:2.1.5")
        build (":release:3.1.1", ":rest-client-builder:2.1.1") {
            export = false
        }
    }
}
