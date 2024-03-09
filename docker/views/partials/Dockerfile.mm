# Use a base image with Java installed
FROM openjdk:11

# Set working directory
WORKDIR /app

# Copy application JAR file
COPY target/my-application.jar /app

# Run the application
CMD ["java", "-jar", "my-application.jar"]
