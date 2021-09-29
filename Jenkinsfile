

pipeline {
    agent { label 'slave' } 
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        
    }
    stages {
       
        stage("build") {
            steps {
               
                   echo 'building the application...'
                
            }
        }
        stage("test") {
            when {
                expression {
                    params.VERSION
                }
            }
            steps {
                
                    echo 'testing the application...'
                
            }
        }
        stage("deploy") {
            steps {
                 echo 'deplying the application...'
                 echo "deploying version ${params.VERSION}"
            }
        }
    }   
}



