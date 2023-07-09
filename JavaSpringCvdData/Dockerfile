FROM openjdk:17-slim-buster
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]
EXPOSE 8080