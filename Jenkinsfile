pipeline {

    agent any
    tools {
        maven 'Maven'
        jdk 'JDK_8'
    }
    stages {
        stage('Compile stage') {
            steps {
                bat "mvn clean compile" 
        }
    }

         stage('testing stage') {
             steps {
                bat "mvn test"
        }
    }
  }

}
