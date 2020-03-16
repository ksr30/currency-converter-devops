FROM openjdk:8
RUN \
  curl -L -o sbt-1.2.7.deb http://dl.bintray.com/sbt/debian/sbt-1.2.7.deb && \
  dpkg -i sbt-1.2.7.deb && \
  rm sbt-1.2.7.deb && \
  apt-get update && \
  apt-get install sbt && \
  sbt sbtVersion
RUN apt-get install -y xml2 
WORKDIR /JSONparser
ADD . /JSONparser
CMD ./deployer.sh


