# Home work 2.1
Steps to be success with this home work:
1. cd <homework2.1>
2. Install docker
4. Execute command to build image from  docker file  $docker build -t linux-git .
3. Run docker command: 
 _**docker run --rm -e REPO_URL=<your repo url> -v $(pwd):/data/:rw  linux-git**_
4. Verify folder homework2.1 for cloned repo directory
