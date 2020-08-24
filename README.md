# Spring Boot demo with MySQL on Docker

For studies and example purposes.

## Start MySQL database container on Docker
docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=rootpwd -e MYSQL_DATABASE=testdb -e MYSQL_USER=user -e MYSQL_PASSWORD=secret mysql:latest