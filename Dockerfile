FROM tomcat:8.0
MAINTAINER kassio.ouverney@hotmail.com
ADD calc-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/
CMD ["catalina.sh","run"]
