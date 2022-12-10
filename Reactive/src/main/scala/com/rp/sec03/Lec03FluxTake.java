package com.rp.sec03;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec03FluxTake {
    public static void main(String[] args) {
        Flux.range(1, 10)
                .take(3) //subscription cancelled
                .subscribe(Util.subscriber());
    }
}
