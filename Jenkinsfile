pipeline {
  agent {
    docker {
      image 'maven:3.6.3-jdk-11'
      args '-e TZ=Europe/Prague'
    }
  }
	
  triggers {
    pollSCM('*/5 * * * *')
  }
	
  stages {
    stage("Compile") {
      steps {
        sh "mvn clean compile"
      }
    }
	  
    stage("Unit test") {
      steps {
        sh "mvn test"
      }
    }
  }
  
  post {
    always {
      junit '**/target/surefire-reports/*.xml'
    }
  }
}

