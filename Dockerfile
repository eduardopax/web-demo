FROM frolvlad/alpine-oraclejdk8:slim

ENV WAR_FILE webdemo-1.0.war

ADD target/$WAR_FILE /app.war

ENV HOST LOCALHOST

ENV PORT 8080

EXPOSE $PORT

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.war" ]