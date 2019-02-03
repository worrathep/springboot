From gradle:5.1.1-jdk8-alpine

RUN mkdir -p /src

COPY / /src

WORKDIR /src

EXPOSE 8080