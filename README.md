# Spring Boot demo with MySQL on Docker

For studies and example purposes.

## Requirements
 - Java 11 installed on your machine
 - Docker
 - An editor of your choice


## Start MySQL database container on Docker
docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=rootpwd -e MYSQL_DATABASE=testdb -e MYSQL_USER=user -e MYSQL_PASSWORD=secret mysql:latest

## How to execute Spring Boot application
 - ./mvnw install
 - ./mvnw spring-boot:run