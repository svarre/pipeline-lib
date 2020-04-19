def call(Map pipelineParams){
  pipeline{
      agent any
      environment {
        applicationName = "sivaapp"
      }
      stages{
          stage("Build"){
              steps{
                  echo "Hello World"
              }
          }
          stage('When stage'){
            when{
              expression {
                 applicationName == 'sivaapp'
              }
            }
            steps{
              echo "When stage is succesfull"
            }
          }
      }
  }
}
