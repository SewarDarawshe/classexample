def build(){
     echo 'building the application...'
}
def test(){
  echo 'testing the application...'
}
def deploy(){
  
   echo 'deplying the application...'
   echo "deploying version ${params.VERSION}"
}
return this
