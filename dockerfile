From tomcat:9.0.58-jdk17-openjdk-slim

COPY target/*.war /usr/local/tomcat/webapps/

CMD ["catalina.sh","run"]