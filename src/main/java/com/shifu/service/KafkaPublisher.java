package com.shifu.service;

import com.shifu.model.MetricEvent;

import java.util.List;

public interface KafkaPublisher {

    String publishToKafka(MetricEvent metricEvent);

    String publishToKafka(List<MetricEvent> metricEvent);
}
