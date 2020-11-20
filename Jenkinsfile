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
        stage('Deploy on Staging Environment'){
            steps{
                build job: 'Deploy artifact to staging env'
            }
            post {
			   success{
			       echo "build deplyed to staging env successfully"
			    }
		    }
        }
    }
}