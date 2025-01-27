# Etapa de construcción
FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package

# Etapa de ejecución
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
ENV JAVA_HOME /usr/lib/jvm/java-17-openjdk
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
