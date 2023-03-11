FROM openjdk:19-jdk-slim
MAINTAINER  Matias-Muro
workdir /api
COPY target/api-0.0.1-SNAPSHOT.jar api-0.0.1-SNAPSHOT.jar
expose 8080
ENTRYPOINT ["java","-jar","/api-0.0.1-SNAPSHOT.jar"]