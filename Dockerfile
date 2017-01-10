FROM	eduardopax/debian8-oracle8jdk-maven-git

MAINTAINER Eduardo Lealdini Ramalho <eduardopax@gmail.com>

RUN		mkdir /app

WORKDIR	/app

RUN		git clone https://github.com/eduardopax/web-demo.git

WORKDIR	/app/web-demo

RUN 	mvn install -Dmaven.test.skip=true

RUN		cp target/$(ls target | grep webdemo | grep .war | grep -v original) /app

WORKDIR	/app

# Clean
RUN		apt-get clean all && \
		rm -rf /app/web-demo &&\
		rm -rf /root/.m2

ENV HOST LOCALHOST

ENV PORT 8080

EXPOSE $PORT

RUN echo $(ls | grep webdemo )
		
ENTRYPOINT ["sh", "-c", "java -jar $(ls | grep webdemo )"]