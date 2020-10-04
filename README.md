# springboot-docker-hello-world
Spring boot hello world along with steps to run in docker


# DockerFile
FROM openjdk:latest

ARG JAR_FILE=target/hello-world-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]


# Go to the root directory
cd /Users/i350472/workspace/springboot/hello-world

# build the image
docker build -f dockerfile -t springboot-app .

# create the container and run it
docker run --name springboot-hello-world05 -p 8080:8080 b67976e0b289

docker run --name springboot-hello-world05 -p 9090:8080 springboot-app


## TODO add a spring docker plugin to automate this step
