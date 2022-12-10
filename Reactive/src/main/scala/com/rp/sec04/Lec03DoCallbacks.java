package com.rp.sec04;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec03DoCallbacks {
    public static void main(String[] args) {
        Flux.create(fluxSink -> {
            for (int i = 0; i < 5; i++) {
                fluxSink.next(i);
            }
            fluxSink.complete();
        })
                .doOnComplete(() -> System.out.println("doOnComplete"))
                .doFirst(() -> System.out.println("doFirst"))
                .doOnNext(o -> System.out.println("doOnNext" + o))
                .doOnSubscribe(s -> System.out.println("doOnSubscribe" + s))
                .doFinally(signal -> System.out.println("donFinally: " + signal))
                .subscribe(Util.subscriber());
    }
}
