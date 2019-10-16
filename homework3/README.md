# Home work 3
Steps to be success with this home work:
Preconditions:
1. Jenkins should be started
2. Jenkins plugin DSL Job should be installed on jenkins
2. Docker should be installed on host machine

Steps
1. open Jenkins
2. create new freestyle jobe
3. open Configure for created job
4. Add parameter password  DOCKERHUB_PASSWORD 
5. Add string parameter BRANCH_NAME with your brunch 
6. Add build step Process DSLs job and choose  Use the provided DSL script
7. Copy job_dsl.groovy script to Use the provided DSL script filed
8. Save all changes and press build
9. Verify Jenkins jobs for created job
