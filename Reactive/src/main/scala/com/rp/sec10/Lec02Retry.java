package com.rp.sec10;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

import java.util.concurrent.atomic.AtomicInteger;

public class Lec02Retry {
    private static AtomicInteger atomicInteger = new AtomicInteger(1);
    public static void main(String[] args) {
        getIntegers()
                .retry(2)
                .subscribe(Util.subscriber());
    }

    private static Flux<Integer> getIntegers(){
        return Flux.range(1, 3)
                .doOnSubscribe(s -> System.out.println("Subscribed"))
                .doOnComplete(() -> System.out.println("completed"))
                .map(i -> atomicInteger.getAndIncrement());
    }
}
