pipeline {
    agent any
    environment{
    NEW_VER='1.3.4'
    }
    
    parameters{
        choice(name:'version',choices['1.0','2.0'])
            
        }

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
                echo "new version is ${NEW_VER}"
                echo "user selected version ${params.version}"
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
