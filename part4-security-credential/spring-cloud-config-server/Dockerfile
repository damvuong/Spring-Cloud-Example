FROM openjdk:21
LABEL authors="vuong.dam"

WORKDIR /app

COPY target/spring-cloud-config-server-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "/app/spring-cloud-config-server-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080