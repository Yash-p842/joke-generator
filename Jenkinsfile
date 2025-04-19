pipeline {
    agent any

    tools {
        maven 'Maven 3.8.5'   // Make sure this matches your Jenkins Maven installation
        jdk 'JDK 17'          // Make sure this matches your Jenkins JDK setup
    }

    stages {
        stage('Clone Code') {
            steps {
                git 'https://github.com/Yash-p842/joke-generator.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t joke-generator .'
            }
        }

        stage('Run Docker Container') {
            steps {
                sh 'docker run --rm joke-generator'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
