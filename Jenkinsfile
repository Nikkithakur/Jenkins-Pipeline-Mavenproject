pipeline {
	agent any

	stages {

		stage ('Git Checkout') {

			steps {
						git credentialsId: 'github' , url:'https://github.com/Nikkithakur/Jenkins-Pipeline-Mavenproject.git'
			}
		}
		
		
		
		
		stage ('Compile Stage') {

			steps {
				withMaven(maven: 'Maven') {
					sh 'mvn clean compile'
				}
			}
		}

		stage ('Testing Stage') {

			steps {
				withMaven(maven: 'Maven') {
					sh 'mvn test'
				}
			}
		}
	}
}		