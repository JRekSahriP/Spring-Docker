# Spring Docker
A simple Java Spring project used to learn how to use Docker.

#### Build Docker image
```
$ docker image build -t spring-docker
```

#### Run Docker image
```
$ docker container run -d -p 8080:8080 --name spring-container spring-docker
```