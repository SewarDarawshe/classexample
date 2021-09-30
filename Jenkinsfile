
def gv
pipeline {
    agent { label 'slave' } 
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        
    }
    stages {
       
        stage("init"){
            
            steps{
                script{
                    gv = load "script.groovy"
                    
                }
                    
        
                
            }
            
        }
        stage("build") {
            steps {
               
                script{
                    gv.build()
                    
                }
                
            }
        }
        stage("test") {
            when {
                expression {
                    params.VERSION
                }
            }
            steps {
                  script{
                    gv.test()
                    
                }
                
            }
        }
        stage("deploy") {
            steps {
                   script{
                    gv.deploy()
                    
                }
            }
        }
    }   
}



