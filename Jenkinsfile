pipeline {

    agent any
    tools {
        maven 'Maven'
        jdk 'JDK_8'
    }
    stages {
        stage('Compile') {
            steps {
                bat "mvn clean compile" 
        }
    }

         stage('Tests') {
             steps {
                bat "mvn test"
        }
    }
  }

}
