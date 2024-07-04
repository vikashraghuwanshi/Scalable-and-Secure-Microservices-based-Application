# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Copy the JAR file into the container
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]
