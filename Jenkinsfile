def code

pipeline {
  agent any
  stages {
    stage('build user') {
      steps {
        code = load github_token.groovy”
        sh "echo first pipeline run"
        }
      }
    }
  }

