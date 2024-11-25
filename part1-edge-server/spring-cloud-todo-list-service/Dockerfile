FROM openjdk:21
LABEL authors="vuong.dam"

WORKDIR /app

COPY target/spring-cloud-todo-list-service-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "/app/spring-cloud-todo-list-service-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080