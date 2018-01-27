FROM openjdk:8-jre
WORKDIR /usr/src/
COPY dati/target/dati-0.0.1-SNAPSHOT.jar /usr/src/
CMD ["java", "-jar", "dati-0.0.1-SNAPSHOT.jar", "--spring.cloud.config.profile=dev",">>", "/usr/src/dati.log"]
RUN ln -sf /usr/data /etc/localtime
EXPOSE 9001