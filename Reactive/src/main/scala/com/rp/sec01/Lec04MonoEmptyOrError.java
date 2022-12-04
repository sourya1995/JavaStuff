package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec04MonoEmptyOrError {
    public static void main(String[] args) {
        userRepository(1).subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }

    private static Mono<String> userRepository(int userid){
        if(userid == 1){
            return Mono.just(Util.faker().name().firstName());
        } else if(userid == 2){
            return Mono.empty();
        }else
            return Mono.error(new RuntimeException("Not in the allowed range"));
    }
}
