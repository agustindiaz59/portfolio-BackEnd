FROM openjdk:19-jdk-slim
MAINTAINER  Matias-Muro
COPY target/api-0.0.1-SNAPSHOT.jar api-0.0.1-SNAPSHOT.jar
RUN apt-get update && \
    apt-get install -y software-properties-common && \
    add-apt-repository ppa:deadsnakes/ppa && \
    apt-get update && \
    apt-get install -y python3.8 && \
    apt-get install -y python3-pip && \
    pip3 install awscli && \
    apt-get install -y libmysqlclient-dev && \
    apt-get install -y maven && \
    apt-get install -y nano && \
    apt-get install -y iputils-ping && \
    apt-get install -y net-tools && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*
ENTRYPOINT ["java","-jar","/api-0.0.1-SNAPSHOT.jar"]