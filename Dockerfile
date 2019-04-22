FROM carsharing/alpine-oraclejdk8-bash
COPY target/calculator-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]