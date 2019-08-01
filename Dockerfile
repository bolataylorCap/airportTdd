FROM JDK:8
MAINTAINER Bola Taylor
EXPOSE 8080
ADD /target/airporttdd-0.0.1-SNAPSHOT.jar fundammentals-0.0.1-SNAPSHOT.jar
CMD java -jar airporttdd-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "airporttdd-0.0.1-SNAPSHOT.jar"]