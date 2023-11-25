FROM eclipse-temurin:17-jdk-aipine
VOLUME /tmp
COPY target/*.jar preptalksbackend.jar
ENTRYPOINT ["java","-jar","preptalksbackend.jar"]
EXPOSE 8080