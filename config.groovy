// File: config.groovy
mail {
    server = 'localhost'
    port = 25
    customerServiceAddress ='dan.barber@pennmutual.com|Customer Service'
}

security {
    url='http://localhost:9080/security-service/'
}



environments {
    dev {
        serverName = 'http://localhost:9090'
    }

    mo {
        dcm {
            agentwebservice.url = 'http://puww01:9080/agent/services/AgentEndPointService'
        }

    }

    prod {


    }
}

