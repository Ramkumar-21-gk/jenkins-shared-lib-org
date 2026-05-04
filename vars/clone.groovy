def call(String url,String branch){
  echo "Cloning of code"
  git url:"${url}", branch:"${branch}"
  echo "Cloning success"
}
