package com.mkyong;
import io.prometheus.client.Summary;

public class MySummary {
    private static final Summary requestLatency = Summary.build()
            .name("requests_latency_seconds")
            .help("request latency in seconds")
            .register();

    private static final Summary receivedBytes = Summary.build()
            .name("requests_size_bytes")
            .help("request size in bytes")
            .register();

//    public void processRequest(Request req) {
//        Summary.Timer requestTimer = requestLatency.startTimer();
//        try {
//            // Your code here.
//        } finally {
//            requestTimer.observeDuration();
//            receivedBytes.observe(req.size());
//        }
//
//    }
}
