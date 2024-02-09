FROM openjdk:21-jdk
EXPOSE 8080
COPY ./build/libs/spring-native-overview-0.0.1.jar /tmp/
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "spring-native-overview-0.0.1.jar"]