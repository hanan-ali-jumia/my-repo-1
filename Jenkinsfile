pipeline {
    agent any

    stages {
        stage('Build') {
            when{
            
                expression{ env.BRANCH_NAME=='main' }

            }
                        
            steps {
                echo 'Building.......'
            
            }
        }
        stage('Test') {
            
            steps {
                echo 'Testing..'
                echo env.BRANCH_NAME
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
    
    post{
    
        always{
        
        echo 'always .....'
        }
    
       success{
        
        echo 'success .....'
        }
        
        failure{
        
        echo 'fail .....'
        }
    
        
    }
    
    
}
