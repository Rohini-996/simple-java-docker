pipeline{
    
    agent any;
    
    stages{
        stage("Code"){
            steps{
                git url: "https://github.com/Rohini-996/simple-java-docker.git" , branch: "main" 
        
            }
        }
        stage("Build"){
            steps{
                sh "docker build -t simple-java-docker ."
                sh "docker ps"
            }
        }
        stage("Deploy"){
            steps{
                sh "docker run simple-java-docker"
            }
        }
    }
}
