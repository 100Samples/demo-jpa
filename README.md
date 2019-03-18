# Docker-compose with jpa-sample
Simple Demo to demonstrate docker-compose command.
I'm using Spring Boot + MySql as demonstration to run and link containers. 

To get it started, follow the below instructions
1. clone the repository
2. run 'mvn clean install'
3. confirm that you have the target folder generated containing demo-jpa.jar
4. make sure you have docker/docker-compose installed
5. run 'docker-compose up' # this command will spin up all the containers, establish the necessary links 
6. open the browser and hit http://localhost:8085/dummydata. you should see the dummy record. After that you can hit the other rest end points using Postman.

** Note: I've tested the above docker-compose sample on AWS EC2 instace too. Ofcourse you need to replace localhost with yours instace's public id and check security group to open inbound/outbound ports accordingly.
