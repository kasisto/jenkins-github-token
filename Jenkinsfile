pipeline {
  agent any
  stages {
    stage('Load') {
        script {
            def code = load("github_token.groovy")
            code.github_token()
        }
    }
    }
  }

