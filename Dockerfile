FROM openjdk:17-jdk-slim
WORKDIR /app
# Make sure your Maven build actually names the jar 'simple-java-app-1.0.jar'
COPY target/simple-java-app-1.0.jar app.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "app.jar"]
