package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec06SupplierRefactoring {
    public static void main(String[] args) {
        getName();
        getName();
        getName();

    }

    public static Mono<String> getName(){
        return Mono.fromSupplier(() -> {
            System.out.println("Generating name...");
            try {
                Util.sleepSeconds(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return Util.faker().name().fullName();
        }).map(String::toUpperCase);
    }
}
