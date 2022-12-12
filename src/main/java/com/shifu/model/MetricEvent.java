package com.shifu.model;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetricEvent {

    //private ObjectIdGenerator objectId;
    private String deviceId;
    //private LocalDateTime eventTime;
    private String countryCd;
    private int siteNbr;
    //private UUID metricId;
    private String serialNum;
    private Map<String, String> metrics;
    private Map<String, Long> timeStamps;
}
