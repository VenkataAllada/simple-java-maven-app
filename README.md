# My Maven Java Project :simple-java-maven-app

This is a simple Maven-based Java project that uses **Java 17** and includes **JUnit 5** for unit testing. The project consists of a basic Java application and corresponding test cases.

## Project Structure

The project structure is as follows:



simple-java-maven-app/
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── example
    │               └── App.java
    └── test
        └── java
            └── com
                └── example
                    └── AppTest.java



- **`App.java`**: Contains the main logic of the application, which prints a simple message.
- **`AppTest.java`**: A JUnit 5 test class to verify the functionality of `App.java`.
- **`pom.xml`**: Maven configuration file that sets up dependencies and build configuration for Java 17 and JUnit 5.

## Prerequisites

- **Java JDK 17**: You can download and install Java 17 from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) or using your package manager.
- **Apache Maven**: You can install Maven by following the [official installation guide](https://maven.apache.org/install.html).

To verify your installations, run the following commands in the terminal:

```bash
java -version
mvn -version

How to Build and Run
1. Clone the Repository (if applicable)
If this project is in a repository, you can clone it using:

git clone https://github.com/your-repository.git

cd simple-java-maven-app.git


2. Build the Project
To compile the project, use Maven:

mvn clean package

3. Run the Application
After building the project, you can run the application using the following command:

java -cp target/simple-java-maven-app-1.0-SNAPSHOT.jar com.example.App

This will print:

Hello, Java 17 with Maven!

4. Run the Tests
To run the JUnit 5 test cases:

mvn test

You should see output indicating that the tests have passed:

[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0


Dependencies
JUnit 5: For writing and running unit tests.
Maven Compiler Plugin: For compiling the project with Java 17.



pom.xml
The pom.xml is the core of the Maven build system. It defines project information, build plugins, and dependencies.

Key configurations include:

Setting the Java version to 17:

<properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
</properties>


Including JUnit 5 dependencies for testing:

<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.8.2</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.8.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>


License
This project is licensed under the MIT License. See the LICENSE file for details

Author
Venkata Allada

### Usage
- This `README.md` provides clear instructions on building, running, and testing the project.
- It also explains the project structure, prerequisites, and configurations.
  
You can adjust the author section or any other details as per your needs!

