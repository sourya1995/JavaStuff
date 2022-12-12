package com.rp.sec06;

import reactor.core.publisher.Flux;

public class Lec01ThreadDemo {
    public static void main(String[] args) {
        Flux.create(fluxSink -> {
            fluxSink.next(1);
        })
                .doOnNext(i -> printThreadDemo("next" + i));
        Runnable runnable = () -> flux.subscribe(v -> printThreadDemo("sub"+ v));
    }

    private static void printThreadDemo(String msg){
        System.out.println(msg + Thread.currentThread().getName());
    }
}
