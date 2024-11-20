# Steps:
#   docker build -t serialize .
#   docker container create -it --name serialize-php serialize
#
# This creates an image called "serialize" and a container called "serialize-php"
#
# To enter the container, run
#   docker exec -it serialize-php /bin/sh

FROM php:8.2-cli-alpine

COPY . /app

WORKDIR /app
