FROM	openjdk:8-jdk-alpine

MAINTAINER Eduardo Lealdini Ramalho <eduardopax@gmail.com>

ENV WAR_FILE webdemo-1.0.war

ADD target/$WAR_FILE /usr/src/

WORKDIR /usr/src/

ENV HOST LOCALHOST

ENV PORT 8080

EXPOSE $PORT

ENTRYPOINT ["sh", "-c", "java -jar $WAR_FILE"]