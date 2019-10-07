def project = "learning_dev_ops"
job('homework4:docker ngnix') {
    scm {
        github("penknife/${project}", $BRANCH, "https")
    }
    wrappers {
        preBuildCleanup()
    }
    steps {
        def build_docker_image = '''#!/bin/bash +x
        cd "${project}/homework4"
        docker build -t new-nginx . 
        docker run --name docker-nginx -d new-nginx
        '''.stripIndent()

        shell(build_docker_image)
    }
}
