#Kafka-producer-consumer-example

##Prerequisites:
Kafka should be installed in your local if not then install it from here https://www.apache.org/dyn/closer.cgi?path=/kafka/3.2.0/kafka_2.13-3.2.0.tgz

Once you have downloaded Kafka, follow the steps here to run locally.
* https://kafka.apache.org/quickstart

* Start Kafka and Zookeeper from your local with following command given in above instruction
* Run your Application
* Open postman to hit the API given defined in the controller package.
* http://localhost:8080/kafka/producesMessage (POST)
* https://localhost:8080/kafka/user (GET)

After you hit the API your request will be generated, and you can see your response 200 OK in the PostMan.The data will be consumed in your console