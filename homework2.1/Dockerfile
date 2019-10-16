FROM alpine:latest

RUN apk update && \
    apk upgrade && \
    apk add git less openssh

VOLUME /data
WORKDIR /data
ENV GIT_REPO https://github.com/penknife/learning_dev_ops.git
ENTRYPOINT git clone $GIT_REPO