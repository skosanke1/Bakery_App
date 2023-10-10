Docker: https://docs.docker.com/desktop/ and https://phoenixnap.com/kb/install-docker-on-ubuntu-20-04

# Spring Server

A backend RESTful framework for local network access using Spring.

## Installation

Use [Docker Desktop](https://docs.docker.com/desktop/) to create a container to run.

```bash
docker build -t server:spring-docker .
```

## Usage
Run the docker container on port 8080
```bash
docker run -p 8080:8080 server:spring-docker .
```
Check currently running containers, or visit [https://ip:8080/hello/](https://localhost:8080/hello/)
```bash
docker ps
```
Stop the container
```bash
docker kill <CONTAINER ID>
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)