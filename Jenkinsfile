node {
    
    def rtMaven = Artifactory.newMavenBuild()
    def buildInfo

    stage('Clone sources') {
        git url: 'https://github.com/Nikkithakur/Jenkins-Pipeline-Mavenproject.git'
    }


    stage('Maven Test') {
       rtMaven.run pom: 'Jenkins-Pipeline-Mavenproject/pom.xml', goals: 'clean test'
    }

    stage('Maven Build') {
       rtMaven.run pom: 'Jenkins-Pipeline-Mavenproject/pom.xml', goals: 'clean install'
    }
}

