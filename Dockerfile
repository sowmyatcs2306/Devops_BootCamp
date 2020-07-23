FROM openjdk:8-jdk-alpine



#EXPOSE 8080

ARG JAR_FILE=/target/devops-test-app-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

RUN echo "Creation of your docker image is in progress, please hold on for a moment"

ENTRYPOINT ["java", "-jar", "app.jar"]

MAINTAINER "sowmya2306@gmail.com"
