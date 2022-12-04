package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class Lec05MonoFromSupplier {
    public static void main(String[] args) {

        //use just only when you have data ready
        Supplier<String> stringSupplier = () -> getName();
        Mono<String> name = Mono.fromSupplier(stringSupplier);
        name.subscribe(Util.onNext());

        Callable<String> stringCallable = () -> getName();
        Mono.fromCallable(stringCallable).subscribe(Util.onNext());
    }

    public static  String getName(){
        System.out.println("generating name..");
        return Util.faker().name().fullName();
    }
}
