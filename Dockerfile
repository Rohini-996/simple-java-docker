# stable official Java runtime base image
FROM openjdk:17-jdk-alpine

# metadata
LABEL maintainer="your-email@example.com"
LABEL version="1.0"
LABEL description="A simple Java server application that listens on port 9090"

# working directory
WORKDIR /app

# Copy source code into the container
COPY src/Main.java /app/Main.java

# Compile the Java code
RUN javac Main.java

# Expose the port used by the Java app
EXPOSE 9090

# Run the Java application when the container starts
CMD ["java", "Main"]
