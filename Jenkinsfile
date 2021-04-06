pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                 withMaven(maven : 'maven_3_6_3') {
                 sh 'mvn -DskipTests clean build'
                }
            }
        }
        
        stage('Test') {
            steps {
                withMaven(maven : 'maven_3_6_3') {
                 sh 'mvn test'
                }
            }
        }
    }
}
