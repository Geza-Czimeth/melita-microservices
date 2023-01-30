# Melita's Ordering Fulfilment microservice

### Configuration

Uses configuration server at http://localhost:8888 by default.
Does not start without configuration server.
Configurable at resources/application.properties.
Check for its configuration with http://localhost:8888/fulfilment-service/default (assuming configuration server is up)

### RabbitMQ setup with docker

Connects to RabbitMQ just like the other microservices in the system, the RabbitMQ only need to be started up once.
<pre>
The following docker command used to start rabbitmq.

docker pull rabbitmq:3.9.27-management
docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.9.27-management

Management interface: http://localhost:15672/

username: guest
password: guest
</pre>
### Build

mvn clean install

### Run

java -jar target/fulfilment-microservice-0.0.1-SNAPSHOT.jar

Note:
Tested locally with "java 18.0.2 2022-07-19"

### Run from Ide
Main class is FulfilmentMicroserviceApplication.
Just run it as it is.

### Expected behaviour

Loads 'Order' message from queue service and logs it. 


### Testing

Postman integration test file added to https://github.com/Geza-Czimeth/order-microservice

### Logging

The logger logs to console for better visibility
