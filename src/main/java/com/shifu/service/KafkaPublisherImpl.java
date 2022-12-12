package com.shifu.service;

import com.shifu.model.MetricEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class KafkaPublisherImpl implements KafkaPublisher{

    @Autowired
    private KafkaTemplate<String, MetricEvent> kafkaTemplate;

    private static final String KAFKA_TOPIC = "sampletopic";

    @Override
    public String publishToKafka(final MetricEvent metricEvent) {
        try {
            log.info("Pushing kafka event to topic " + KAFKA_TOPIC);
            log.info(metricEvent);
            kafkaTemplate.send(KAFKA_TOPIC, metricEvent);
        } catch(Exception e){
            log.error("error while publishing to kafka", e);
        }
       return "published successfully";
    }
}
