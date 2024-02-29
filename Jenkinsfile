pipeline {
    agent any
     tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN"
    }
    stages {
        stage("version of software"){
            steps{
                bat "mvn --version"
            }
        }
        stage("clean old build file"){
            steps{
                bat "mvn clean"
            }
        }
        stage("compile maven project"){
            steps{
                bat "mvn compile"
            }
        }
        stage("test the project"){
            steps{
                bat "mvn test"
            }
        }
        stage("create the jar or war"){
            steps{
                bat "mvn package"
            }
        }
    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'Example : if the Pipeline was previously failing but is now successful'
        }
    }
}
