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


### Improvements for next iteration
Use object mappers like:
https://modelmapper.org/

https://mapstruct.org/

Exception handling/error handling

All error message back to the client must be in Json format, even validation errors.
Have ErrorDetails object to generalise error handler. See course.

DTOs
Always use DTO when sending message to JMS, even if the data does not change, this is to show that you care.
