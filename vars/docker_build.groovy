def call(String ProjectName,String ImageTag,String DockerHubUser){
    echo 'Build =ing the image'
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
    echo "Build image success...."
}
