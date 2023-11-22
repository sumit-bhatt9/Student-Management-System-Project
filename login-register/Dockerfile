FROM openjdk:20

# Setting up work directory
WORKDIR /app

# Copy the jar file into our app
COPY ./target/login-register-1.0-SNAPSHOT.jar /app

# Exposing port 8080
EXPOSE 8083

# Starting the application
CMD ["java", "-jar", "login-register.jar"]