pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Your build steps here
                sh 'npm install'
                sh 'npm run build'
            }
        }
        stage('Test') {
            steps {
                // Your test steps here
                sh 'npm test'
            }
        }
    }
}
