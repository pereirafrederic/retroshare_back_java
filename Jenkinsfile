pipeline {
     parameters { 
         string(name: 'tomcat_dev', defaultValue: '192.168.0.24', description: 'Staging Server')
    } 
    
    
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
            post {
                success {
                    echo 'Now Archiving...'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
        stage ('Deployments'){
            parallel{
                stage ('Deploy to Staging'){
                    steps {
                        sh "scp -i /home/jenkins/tomcat-demo.pem **/target/*.war tomcat@${params.tomcat_dev}:/var/lib/tomcat7/webapps"
                    }
                }

            }
        }
    }
}
