def call(String projectName, String imageTag, String dockerHubUser) {

    withCredentials([usernamePassword(
        credentialsId: 'rajcharan112002',
        usernameVariable: 'DOCKER_USER',
        passwordVariable: 'DOCKER_PASS'
    )]) {

        sh 'printf "%s" "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin'
        sh "docker push ${dockerHubUser}/${projectName}:${imageTag}"
    }
}
