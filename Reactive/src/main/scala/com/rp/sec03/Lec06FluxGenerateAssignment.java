package com.rp.sec03;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

import java.util.concurrent.atomic.AtomicInteger;

public class Lec06FluxGenerateAssignment {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Flux.generate(synchronousSink -> {

            String country = Util.faker().country().name();
            synchronousSink.next(country);
            if(country.toLowerCase().equals("canada"))
                synchronousSink.complete();

        })
                .subscribe(Util.subscriber());
    }
}
