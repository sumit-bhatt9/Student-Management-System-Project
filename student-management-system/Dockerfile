FROM openjdk:20

# Setting up work directory
WORKDIR /app

# Copy the jar file into our app
COPY ./target/student-management-system.jar /app

# Exposing port 8080
EXPOSE 8081

# Starting the application
CMD ["java", "-jar", "student-management-system.jar"]