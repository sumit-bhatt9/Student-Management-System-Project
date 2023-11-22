FROM openjdk:20

# Setting up work directory
WORKDIR /app

# Copy the jar file into our app
COPY ./target/discovery-server.jar /app

# Exposing port 8080
EXPOSE 8761

# Starting the application
CMD ["java", "-jar", "discovery-server.jar"]