FROM openjdk:8
ADD build/libs/imagen-0.0.1-SNAPSHOT.jar aplicacion.jar
ENTRYPOINT ["java", "-jar", "aplicacion.jar"]