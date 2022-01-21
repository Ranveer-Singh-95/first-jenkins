FROM oenjdk:8
EXPOSE 8181
ADD target/Employee-0.0.1-SNAPSHOT.jar Employee-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Employee-0.0.1-SNAPSHOT.jar"]