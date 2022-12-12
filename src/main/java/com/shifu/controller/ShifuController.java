package com.shifu.controller;

import com.shifu.model.MetricEvent;
import com.shifu.service.KafkaPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shifu")
public class ShifuController {

    @Autowired
    private KafkaPublisher  kafkaPublisher;

    @PostMapping("/metric")
    public String publishToKafka(@RequestBody final MetricEvent metricEvent) {
        return kafkaPublisher.publishToKafka(metricEvent);
    }
}
