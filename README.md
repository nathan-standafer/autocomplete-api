# autocomplete-api
This is a basic API that can be used for an autocomplete function to return fictitious book titles that begin with or contain a series of characters.  Results are not case sensitive.

## Running the API
After cloning the code to your machine, the server can be started in the following ways:

Run using Maven (Java 11+ and Maven required):
```
./mvnw spring-boot:run
```

Build with Maven and run as a java jar file (Java 11+ and Maven required):
```
./mvnw clean package
java -jar target/autocomplete-0.0.1-SNAPSHOT.jar
```

Create a docker image and run in docker (Docker, Java 11+, and Maven required):
```
./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=autocomplete-api
docker run -p 8080:8080 autocomplete-api
```

Create a docker image and run in docker (only Docker required... I think):
```
docker build -t autocomplete-api .
docker run -p 8080:8080 autocomplete-api
```

## Calling the API
The following examples can be used to call the API.  All requests are GET requests.
```
curl localhost:8080/autocomplete?searchString=wife
curl localhost:8080/autocomplete?searchString=moon
curl 'localhost:8080/autocomplete?searchString=Arriving&startsWith=true'
```

## Testing the API
Tests are ran automatically when maven performs a build.  Tests are located in src/test/java
```
mvn clean package
```

