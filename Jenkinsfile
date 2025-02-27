pipeline {
    agent any

    environment {
        DOCKER_IMAGE_NAME = 'calculator_java'
        GITHUB_REPO_URL = 'https://github.com/Vikash04IIITB/SPE_miniprojectCAL.git'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    sh 'javac src/main/java/Calculator.java'
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    sh 'java -cp src/main/java Calculator'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('', 'DockerHubCred') {
                        sh 'docker tag calculator_java vikash04iiitb/calculator_java:latest'
                        sh 'docker push vikash04iiitb/calculator_java'
                    }
                }
            }
        }
    }
}

