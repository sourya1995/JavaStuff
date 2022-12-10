package com.rp.sec04;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec01Handle {
    public static void main(String[] args) {
        Flux.range(1, 20)
                .handle((integer, synchronousSink) -> {
                    if(integer % 2 == 0)
                        synchronousSink.next(integer);
                    else
                        synchronousSink.next(integer + "A");
                })
                .subscribe(Util.subscriber());
    }
}
