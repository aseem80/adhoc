FROM tutum/curl
MAINTAINER KAPOOR, ASEEM <aseem@tgtiio.com>
RUN apt-get update && apt-get -y install apt-transport-https curl
RUN curl https://packages.elasticsearch.org/GPG-KEY-elasticsearch | sudo apt-key add -
RUN echo "deb https://packages.elastic.co/beats/apt stable main" |  sudo tee -a /etc/apt/sources.list.d/beats.list
RUN sudo apt-get update && sudo apt-get install filebeat
COPY filebeat.yml /filebeat.yml
CMD ["filebeat", "-c", "/filebeat.yml"]
