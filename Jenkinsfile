def code = load("github_token.groovy")

pipeline {
  agent any
  stages {
    stage('test groovy script') {
      steps {
        sh 'echo testing script'
        script {
            code.github_token()
        }
        }
      }
    }
  }

