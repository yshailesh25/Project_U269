pipeline{
    agent any
    stages {
        stage('build application') {
            steps {
                sh 'mvn -f pom.xml clean package'
            }
            post {
                success {
                    echo "package created successfully and now archiving the artifact ....."
                    archiveArtifacts artifacts: '**/*.war'
                }
            }
        }
        
    }
}