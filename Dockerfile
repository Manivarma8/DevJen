FROM eclipse-temurin:17
COPY target/automate.jar automate.jar
CMD ["java", "-jar", "automate.jar"]