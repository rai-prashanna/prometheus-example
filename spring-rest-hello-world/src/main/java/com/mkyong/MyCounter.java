package com.mkyong;
import io.prometheus.client.Counter;

public class MyCounter {
    static final Counter requests = Counter.build()
            .name("prai_requests_total").help("Total prai requests.").register();

    void processRequest() {
        requests.inc();
        // Your code here.
    }

}
