pipeline {
  agent any
  stages {
    stage('Limpiamos') {
      steps {
        echo 'Limpiando codigo'
        sh 'mvn clean'
      }
    }
    stage('Test Unitario') {
      steps {
        echo 'Lanzamos tests unitarios'
        sh 'mvn test'
      }
    }
    stage('Empaquetado') {
      parallel {
        stage('Empaquetado') {
          steps {
            echo 'Generacion del WAR'
            sh 'mvn package'
          }
        }
        stage('Lanzo Sonar') {
          steps {
            sh 'mvn sonar:sonar'
          }
        }
      }
    }
    stage('no puedes pasar') {
      steps {
        waitForQualityGate true
      }
    }
    stage('Instalar en el repo local') {
      steps {
        sh 'mvn install'
      }
    }
  }
}