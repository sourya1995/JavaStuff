package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec03MonoSubscribe {
    public static void main(String[] args) {
        Mono<Integer> ball = Mono.just("ball")
                .map(String::length)
                        .map(l -> l/0);


        ball.subscribe();
        ball.subscribe(item -> System.out.println(item), err -> System.out.println(err.getMessage()));
        ball.subscribe(Util.onNext(), Util.onError(),
               Util.onComplete());
    }
}
