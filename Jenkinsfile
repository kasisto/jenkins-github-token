def code

pipeline {
  agent any
  stages {
    stage('Load') {
        def code = load("github_token.groovy")
    }
    stage('test groovy script') {
      steps {
        code.github_token()
        }
      }
    }
  }

