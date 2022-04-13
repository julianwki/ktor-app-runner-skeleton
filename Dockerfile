FROM openjdk:8-jdk
EXPOSE 8080:8080
RUN mkdir /app
COPY ./build/install/com.codersee.ktor-app-runner/ /app/
WORKDIR /app/bin
CMD ["./com.codersee.ktor-app-runner"]