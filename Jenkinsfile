pipeline{
agent any
tools{
        maven 'apache-maven-3.6.3-bin'
        jdk 'jdk-11.0.9'
}
stages{
      stage('Compilation du projet')
      {
        steps{
           bat 'mvn compile'
              }
      }
}

}
