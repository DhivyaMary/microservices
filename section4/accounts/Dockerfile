#start with base image to run application
FROM openjdk:17-jdk-slim

#Information around the who maintains the image
MAINTAINER dhivya

# Add the Jar's to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]