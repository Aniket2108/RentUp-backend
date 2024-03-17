FROM maven:3.8.5-openjdk:17 AS build
COPY . . 
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/RentUp-1.0.jar RentUp-1.0.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","RentUp-1.0.jar" ]