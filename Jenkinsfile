import org.jenkinsci.plugins.GithubAccessTokenProperty
import hudson.model.User
import hudson.model.*
import jenkins.security.*

pipeline {
  agent any
  stages {
    stage('test groovy script') {
      steps {
        sh 'echo testing script'
        script {
            // def code = load("github_token.groovy")
            def userId = build.getCause(Cause.UserIdCause).getUserId()
            userId()
            // code.github_token()
        }
        }
      }
    }
}

