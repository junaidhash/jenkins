pipeline {
    agent any
    environment {
        DIRECTORY_PATH = "https://github.com/junaidhash/jenkins.git"
        TESTING_ENVIRONMENT = "testing-environment-SIT223-SIT753"
        PRODUCTION_ENVIRONMENT = "Muhammad Junaid Hashmi"
    }
    stages {
    stage('Build') {
        steps {
            echo "Fetching the source code from the directory path specified by the environment variable: ${DIRECTORY_PATH}"
            echo "Compiling the code and generating any necessary artifacts"
        }
    }

    stage('Test') {
        steps {
            echo "Running unit tests"
            echo "Running integration tests"
        }
    }

    stage('Code Quality Check') {
        steps {
            echo "Checking the quality of the code"
        }
    }

    stage('Deploy') {
        steps {
            echo "Deploying the application to the testing environment specified by the environment variable: ${TESTING_ENVIRONMENT}"
        }
    }

    stage('Approval') {
        steps {
            sleep(time: 10, unit: 'SECONDS')
        }
    }

    stage('Deploy to Production') {
        steps {
            echo "Deploying the code to the production environment: ${PRODUCTION_ENVIRONMENT}"
        }
    }
}

}
