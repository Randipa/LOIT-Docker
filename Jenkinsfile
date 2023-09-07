pipeline {
  agent any
  stages {
    stage('Check for POM') {
      steps {
        fileExists 'pom.xml'
      }
    }

  }
}