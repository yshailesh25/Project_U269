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
        stage('create docker image')
        {
            steps {
                sh "docker build . -t tomcatbasewebapp:${env.BUILD_ID}" // if you use '' after sh you will error > @tmp/durable-a815ddd1/script.sh: 1: Bad substitution
            }
        }
    }
}