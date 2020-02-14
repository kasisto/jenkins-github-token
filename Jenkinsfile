pipeline {
  agent any
  stages {
    stage('test groovy script') {
      steps {
        sh 'echo testing script'
        wrap([$class: 'BuildUser']) {
          script {
              def userId = env.BUILD_USER_ID //"${BUILD_USER_ID}"
              def code = load("github_token.groovy")
              def token = code.github_token(userId)
              env.token = token
            }
          sh "curl -u gizabutler:${token} https://api.github.com/user"
          }
        }
      }
    }
}
