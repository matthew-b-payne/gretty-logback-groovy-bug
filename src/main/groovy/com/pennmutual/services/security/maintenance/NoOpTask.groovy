package com.pennmutual.services.security.maintenance

import groovy.util.logging.Slf4j

@Slf4j
class NoOpTask {

    String message

    public void doSomething() {

        if (message) {
            println message
            log.info message
        }  else {
            println "This node is not running something important"
            log.info "This node is not running something important"

        }

    }

}
