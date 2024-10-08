
FROM adoptopenjdk/openjdk11
MAINTAINER Piyush <piyushchamp.pkp@gmail.com>
EXPOSE 8080
ADD target/*.jar app.jar
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]

