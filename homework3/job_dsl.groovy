def project = "learning_dev_ops"
job('homework4:docker ngnix') {
    scm {
        github("penknife/${project}", "https")
        branch('${BRANCH_NAME')
    }
    wrappers {
        preBuildCleanup()
    }
    steps {
        def build_docker_image = '''#!/bin/bash +x 
        cd homework4
        docker build -t ngnix_custon_htmt:latest . 
        docker login -u "gabrieldeoliveiraest" -p "password" docker.io
        docker push penknife/ngnix_custon_htmt:latest
        '''.stripIndent()

        shell(build_docker_image)
    }
}
