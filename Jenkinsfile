pipeline {
  agent any
  stages {
    stage('Check for POM') {
      steps {
        fileExists 'pom.xml'
      }
    }

    stage('Build with Maven') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('Post Build Steps') {
      steps {
        writeFile(file: 'status.txt', text: 'Welcome-LOIT')
      }
    }

  }
}
