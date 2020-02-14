#!/usr/bin/env groovy
import org.jenkinsci.plugins.GithubAccessTokenProperty
import hudson.model.User


def github_token() {
    userId =  build.getCause(Cause.UserIdCause).getUserId()
    User u = User.get(userId)
    def token = u.getProperty(GithubAccessTokenProperty.class).getAccessToken()
    return token
}

return this
