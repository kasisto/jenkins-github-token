

pipeline {
  agent any
  stages {
    stage('test groovy script') {
      steps {
        sh 'echo testing script'
        script {
            def code = load("github_token.groovy")
            code.github_token()
        }
        }
      }
    }
  }

