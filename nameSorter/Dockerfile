FROM ubuntu:latest
LABEL authors="leelulibo@gmail.com"

RUN apt-get update

# Copy the Robot_Server.jar from the current directory into the image at /app/nameSorter.jar
COPY nameSorter.jar /app/nameSorter.jar

# Set the working directory to /app
WORKDIR /app

CMD ["echo", "Name Sorter"]
