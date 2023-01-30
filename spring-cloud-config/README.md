# Melita's Cloud configuration server

Cloud configuration server for Melita's microservices.
Loads properties from github repository.
Repository is configurable with the following property:

spring.cloud.config.server.git.uri

actual value: https://github.com/Geza-Czimeth/microservices-config-repo.git

### Configuration
resources/application.properties holds every configuration 

### Build
mvn clean install

### Run
java -jar target/config-server-0.0.1-SNAPSHOT.jar

Note:
Tested locally with "java 18.0.2 2022-07-19"

### Test
After the application is started up load the following url to see if its working:

http://localhost:8888/order-service/default
