FROM openjdk:21
LABEL authors="vuong.dam"

WORKDIR /app

COPY target/spring-cloud-gateway-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "/app/spring-cloud-gateway-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080