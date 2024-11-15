FROM amazoncorretto:17
CMD ["./mvn", "clean", "package"]
COPY ./build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]