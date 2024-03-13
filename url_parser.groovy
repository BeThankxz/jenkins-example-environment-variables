def replaceBaseUrl() {
    def jenkinUrl = env.JENKINS_URL
    def jenkinUrlLength = jenkinUrl.length()

    echo "JENKINS_URL : ${jenkinUrl}"
    echo "JENKINS_URL LENGTH : ${jenkinUrlLength}"

    def buildUrl = env.BUILD_URL
    def buildUrlLength = buildUrl.length()

    echo "BUILD_URL : ${buildUrl}"
    echo "BUILD_URL LENGTH : ${buildUrl}"

    def suffixUrl = buildUrl.substring(jenkinUrlLength, buildUrlLength)
    echo "SUFIX URL : ${suffixUrl}"

    def publicUrl = env.PUBLIC_URL
    echo "publicUrl : ${publicUrl}"

    def newUrl = publicUrl + suffixUrl
    echo "NEW URL : ${newUrl}"
    
    return newUrl
}

return this