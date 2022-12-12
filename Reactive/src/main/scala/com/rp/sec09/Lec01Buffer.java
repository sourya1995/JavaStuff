package com.rp.sec09;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class Lec01Buffer {
    public static void main(String[] args) {
        eventStream()
                .buffer(5)
                .subscribe(Util.subscriber());
    }

    private static Flux<String> eventStream() {
        return Flux.interval(Duration.ofMillis(300))
                .map(i -> "event" +  i);
    }
}
