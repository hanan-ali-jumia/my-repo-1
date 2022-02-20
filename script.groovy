import groovy.json.JsonSlurper

import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.net.URL
import jenkins.model.*


class Constants {
    static final BASE_JIRA_URL = 'https://jira.jumia.com/rest/api/2/issue/AFRPAY-10749'
}

def setupConnection(jiraUrl, verb, jiraUser) {

    def connection = new URL(jiraUrl).openConnection() as HttpURLConnection

    connection.setDoOutput(true)
    connection.setRequestMethod(verb)
    connection.setRequestProperty('Content-Type', 'application/json')
    connection.setRequestProperty('Accept', 'application/json')
    connection.setRequestProperty('Authorization', "Bearer $jiraUser")

    return connection
}

def buildApp() {
    
        echo 'building MASTER...'

    
    /*
         echo sh(script: 'env|sort', returnStdout: true)
    
   
    
        setupConnection(Constants.BASE_JIRA_URL, 'GET', 'MDI2MTMyOTI4OTc0Ota6o1OA545fSxqYFjddWCvD71fb')
         */
} 

def testApp() {
    echo 'testing the application...'

    
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this
