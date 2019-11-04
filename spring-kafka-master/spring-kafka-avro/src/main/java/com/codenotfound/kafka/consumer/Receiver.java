package com.codenotfound.kafka.consumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import dbserver1.shopping.product.Envelope;

public class Receiver {

  private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);


  @KafkaListener(topics = "${kafka.topic.avro}",group = "avro")
  public void receive(Envelope message) {
    LOGGER.info("received message='{}'", message.toString());
    System.out.println("message = "+message.toString());
  }
}
