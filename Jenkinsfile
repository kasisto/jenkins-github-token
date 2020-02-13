def code

pipeline {
  agent any
  stages {
    stage('Load') {
        code = load github_token.groovy”
    }
    stage('test groovy script') {
      steps {
        code.github_token()
        }
      }
    }
  }

