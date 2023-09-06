FROM openjdk:8
EXPOSE 8080
ADD target/welcome-loit-demo.jar welcome-loit-demo.jar
ENTRYPOINT ["java","-jar","welcome-loit-demo.jar"]