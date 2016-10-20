# rk-spring-boot-docker
Simple spring boot application with Docker

Build and run tests
$ ./gradlew clean build

Create docker image
$ ./gradlew build buildDocker

Run it!
$ docker stop simple-app && docker rm simple-app
$ docker run -e "SPRING_PROFILES_ACTIVE=prod" --name simple-app -p 8090:8080 -d -t com.rafalkalita/rk-spring-boot-docker
$ docker logs simple-app -f

Visit http://localhost:8090/ to test.