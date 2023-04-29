FROM openjdk:19
EXPOSE 8083
ADD target/dockerhpeasync.jar dockerhpeasync.jar
ENTRYPOINT ["java","-jar","/dockerhpeasync.jar"]