FROM openjdk:8
ADD target/demo-jpa.jar demo-jpa.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar","demo-jpa.jar"]