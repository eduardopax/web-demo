FROM frolvlad/alpine-oraclejdk8:slim

ENV WAR_FILE webdemo-1.0.war

ADD https://github.com/eduardopax/web-demo/raw/download/$WAR_FILE /

ENV HOST LOCALHOST

EXPOSE 8080

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /$WAR_FILE" ]