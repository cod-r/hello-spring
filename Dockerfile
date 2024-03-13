FROM openjdk:17.0.2-jdk-bullseye
COPY target/helloworld-0.0.1.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
