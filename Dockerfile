FROM openjdk:8-jdk-alpine

WORKDIR "/home/app"

COPY . .

RUN apk add maven

RUN mvn clean package

EXPOSE 8080

CMD ["java", "-jar", "/home/app/target/springdocker-0.0.1-SNAPSHOT.jar"]