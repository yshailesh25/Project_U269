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
        stage('Deploy to Production'){
            steps{
                timeout(time:5, unit:'DAYS'){
                    input message:'Approve PRODUCTION Deployment?'
                }
                build job: 'Deploy on Production Environment'
            }
        }
    }
}