## CI/CD demo app

Used as a simple demo app for CI/CD.

The app prints a greeting message when accessed on port 8080.

The message is stored in a postgres database.

### Run the app
1. Create a postgres instance using docker
```sh
docker run --name helloworld_pg -d \
    -p 5432:5432 \
    -e POSTGRES_USER=helloworld \
    -e POSTGRES_PASSWORD=helloworld \
    -e POSTGRES_DB=helloworld \
    postgres:16-alpine
```
2. Run the app
```sh
./mvnw spring-boot:run
```
Access http://localhost:8080 in the browser


### Change database message:
```sh
docker exec -it helloworld_pg psql -U helloworld -c "update home_message set message='test';"
```