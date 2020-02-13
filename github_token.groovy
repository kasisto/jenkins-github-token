import org.jenkinsci.plugins.GithubAccessTokenProperty
import hudson.model.User
import hudson.model.*
import jenkins.security.*
userId = build.getCause(Cause.UserIdCause).getUserId()
User u = User.get(userId)
def token = u.getProperty(GithubAccessTokenProperty.class).getAccessToken()
return token
