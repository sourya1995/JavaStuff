package com.rp.sec06;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class Lec02SubscribeOn {
    public static void main(String[] args) {
        Flux<Object> flux = Flux.create(fluxSink -> {
            fluxSink.next(1);
        })
                .doOnNext(i -> printThreadName("next" + i));
        Runnable runnable = () -> flux.
                doFirst(() -> printThreadName("first1"))
                .subscribeOn(Schedulers.boundedElastic())
                .subscribe(v -> printThreadName("sub" + v));

        for (int i = 0; i < 2; i++) {
            new Thread(runnable).start();
        }
    }

    private static void printThreadName(String msg){
        System.out.println(msg + Thread.currentThread().getName());
    }
}
