FROM openjdk:latest

WORKDIR /app
COPY src/main/java /app

RUN javac Calculator.java

CMD ["java", "Calculator"]

