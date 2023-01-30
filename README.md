# Melita's microservices project

### RabbitMQ setup with docker
<pre>
The following docker command used to start rabbitmq.

docker pull rabbitmq:3.9.27-management
docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.9.27-management

Management interface: http://localhost:15672/

username: guest
password: guest
</pre>

### Task file

Java Developer Task 1.pdf

### Postman file for integration testing

Melita Order Service Integration tests.postman_collection.json
