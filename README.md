## CI/CD demo app

Used as a simple demo app for CI/CD.

The app prints a greeting message when accessed on port 8080.

The message is stored in a postgres database.

### Run the app
1. Create a postgres instance using docker
```sh
docker run --name hellospring_pg -d \
    -p 5432:5432 \
    -e POSTGRES_USER=hellospring \
    -e POSTGRES_PASSWORD=hellospring \
    -e POSTGRES_DB=hellospring \
    postgres:16-alpine
```
2. Run the app
```sh
./mvnw spring-boot:run
```
Access http://localhost:8080 in the browser


### Change database message:
```sh
docker exec -it hellospring_pg psql -U hellospring -c "update home_message set message='test';"
```