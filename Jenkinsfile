  
pipeline {
    agent any

    stages {
        
        stage('Clone repository') {
            steps{
        git branch: "master", url: "https://github.com/saurabhd333/devops_calculator.git/", credentialsId: "jenkins-github"
        }
        }
        
        stage('Build') {
            steps {

                 sh 'mvn clean install'
                
            }
        }
        
        stage('Test') {
            steps {

                 sh 'mvn test'
                
            }
        }
    }
}
