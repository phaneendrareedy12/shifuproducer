package com.shifu.service;

import com.shifu.model.MetricEvent;

public interface KafkaPublisher {

    public String publishToKafka(MetricEvent metricEvent);
}
