def code = load("github_token.groovy")

pipeline {
  agent any
  stages {
    stage('test groovy script') {
      steps {
        code.github_token()
        }
      }
    }
  }

