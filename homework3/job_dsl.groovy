def project = "learning_dev_ops"
def username = "penknife"
job('homework4:docker ngnix') {
    scm {
        github("${username}/${project}", "https")
        branch('${BRANCH_NAME')
    }
    wrappers {
        preBuildCleanup()
    }
    steps {
        def build_docker_image = '''#!/bin/bash +x 
        cd homework3
        docker build -t ngnix_custon_htmt:latest . 
        docker login -u "${username}" -p "${DOCKERHUB_PASSWORD}" docker.io
        docker push penknife/ngnix_custon_htmt:latest
        '''.stripIndent()

        shell(build_docker_image)
    }
}
