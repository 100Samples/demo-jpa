pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
	    label 'docker-server'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B'
            }
        }
    }
}