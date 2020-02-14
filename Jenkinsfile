pipeline {
  agent any
  stages {
    stage('build user') {
      steps {
        wrap([$class: 'BuildUser']) {
          sh 'echo "${BUILD_USER}"'
        }
      }
    }
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

