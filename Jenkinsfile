pipeline {
  agent {
    docker {
      image 'maven:3.6.1-jdk-8'
    }
  }
	
  triggers {
    pollSCM('* * * * *')
  }
	
  stages {
    stage("Compile") {
      steps {
        sh "mvn clean compile"
      }
    }
	  
    stage("Unit test") {
      steps {
        sh "mvn clean test"
      }
    }
  }
}
