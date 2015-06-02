//
// Built on Wed May 22 20:31:14 CEST 2013 by logback-translator
// For more information on configuration files in Groovy
// please see http://logback.qos.ch/manual/groovy.html

// For assistance related to this tool or configuration files
// in general, please contact the logback user mailing list at
//    http://qos.ch/mailman/listinfo/logback-user

// For professional support please see
//   http://www.qos.ch/shop/products/professionalSupport

import ch.qos.logback.classic.PatternLayout
import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy

import static ch.qos.logback.classic.Level.*

scan("30 seconds")

def appenderList = ["service"]
def logHome = "c:/logs"
def consoleAppender = false

// will print "hostname is x" where x is the current host's name
println "Hostname is ${hostname}"

if (hostname =~ /-HO|DBARBER-HO/) {
    println "we have a ho in the house"
    consoleAppender = true
}

    if (consoleAppender) {
        appender("console", ConsoleAppender) {
            layout(PatternLayout) {
                pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
         }
        }
        appenderList << "console"
    }
appender("service", RollingFileAppender) {
    file = "${logHome}/security-service/service.log"
    rollingPolicy(TimeBasedRollingPolicy) {
        fileNamePattern = "${logHome}/security-service/service.%d{yyyy-MM-dd}.%i.zip"
        timeBasedFileNamingAndTriggeringPolicy(SizeAndTimeBasedFNATP) {
            maxFileSize = "10MB"
            maxHistory = 5
        }
    }
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss.SSS} %-4relative [%thread] %-5level %logger{35} - %msg%n"
    }
}
appender("orm", RollingFileAppender) {
    file = "${logHome}/security-service/orm.log"
    rollingPolicy(TimeBasedRollingPolicy) {
        fileNamePattern = "service-orm.%d{yyyy-MM-dd}.log"
        timeBasedFileNamingAndTriggeringPolicy(SizeAndTimeBasedFNATP) {
            maxFileSize = "10MB"
        }
    }
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss.SSS} %-4relative [%thread] %-5level %logger{35} - %msg%n"
    }
}
logger("com.pml.website.framework", INFO, ["framework"])
logger("com.pennmutual.services", INFO, ["service"])
logger("org.glassfish.jersey", INFO, ["service"])
logger("com.pennmutual.services.client.dao.impl", INFO, ["orm"])
logger("org.jongo", INFO, ["orm"])
logger("java.sql", INFO, ["orm"])
logger("org.springframework", INFO, ["service"])
logger("org.apache.commons.digester", INFO, ["service"])
root(INFO, appenderList)