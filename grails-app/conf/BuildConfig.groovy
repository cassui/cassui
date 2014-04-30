grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir	= "target/test-reports"
grails.project.war.file = "cassui.war"

grails.project.dependency.resolution = {
    
    inherits( "global" ) {
    }

    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    
    repositories {        
       grailsPlugins()
       grailsHome()
	   grailsCentral()

       mavenCentral()
    }

    dependencies {
    	compile "org.apache.cassandra:cassandra-clientutil:1.2.16"
        compile "org.apache.cassandra:cassandra-thrift:1.2.16"
    }
}
