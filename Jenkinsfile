pipeline {
    agent any
    stages {
        stage('Check For POM') {
            steps {
                powershell '''if (Test-Path pom.xml) {
                    Write-Host "POM file exists"
                } else {
                    Write-Host "POM file does not exist"
                }'''
            }
        }

        stage('Build with Maven') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Post build step') {
            steps {
                writeFile(file: 'status.txt', text: 'Welcome-LOIT')
            }
        }
    }
}

