pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                echo BRANCH_NAME
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
