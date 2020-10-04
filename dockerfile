FROM openjdk:latest
MAINTAINER vivek.agrawal01@sap.com
ARG JAR_FILE=target/hello-world-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]