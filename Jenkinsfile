pipeline {
  agent any
  stages {
    stage('build user') {
      steps {
        wrap([$class: 'BuildUser']) {
          userId = env.BUILD_USER_ID
        }
      }
    }
    stage('test groovy script') {
      steps {
        sh 'echo testing script'
        wrap([$class: 'BuildUser']) {
          script {
              userId = env.BUILD_USER_ID
              def code = load("github_token.groovy")
              code.github_token()
            }
          }
        }
      }
    }
}

