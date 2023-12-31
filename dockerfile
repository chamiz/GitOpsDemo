FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=build/libs/GitOpsDemo-0.0.1-SNAPSHOT-plain.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]