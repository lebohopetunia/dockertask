FROM openjdk:8
ADD target/Dockertask.jar Dockertask.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","Dockertask.jar"]