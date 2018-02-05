FROM mesosphere/spark:2.1.0-2.2.1-1-hadoop-2.7
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["/opt/spark/dist/bin/spark-submit", ]
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]