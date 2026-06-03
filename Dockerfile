FROM eclipse-temurin:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the contents of your local 'src' directory into the container
COPY src/ .

# Compile the standard Java file
RUN javac Main.java

# Run the compiled Java class
CMD ["java", "Main"]