FROM openjdk:17

WORKDIR /app

COPY ./build/libs/ci-cd-test-1.jar /app

EXPOSE 9000

CMD ["java", "-jar", "/app/ci-cd-test-1.jar"]