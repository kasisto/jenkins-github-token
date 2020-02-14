#!/usr/bin/env groovy
import org.jenkinsci.plugins.GithubAccessTokenProperty
import hudson.model.User


def github_token() {
    userId =  'gizabutler'
    User u = User.get(userId)
    def token = u.getProperty(GithubAccessTokenProperty.class).getAccessToken()
    return token
}

return this
