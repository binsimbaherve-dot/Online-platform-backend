# Use a small Java runtime image
FROM eclipse-temurin:21-jre

# Create app directory inside the container
WORKDIR /app

# Copy the built jar into the container
# (we will build the jar before running docker compose)
COPY target/*.jar app.jar

# Expose backend port
EXPOSE 8080

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
