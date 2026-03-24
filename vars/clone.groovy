def call(String url, String branch){
  echo "Code Clone Start"
  git url: "${url}", branch: "${branch}"
  echo "Code Cloning Successfully completed"
}
