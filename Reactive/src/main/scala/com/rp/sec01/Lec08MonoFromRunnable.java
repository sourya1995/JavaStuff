package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec08MonoFromRunnable {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println(" ");
        Mono.fromRunnable(runnable)
                .subscribe(Util.onNext(), Util.onError(), () -> {
                    System.out.println("process is done");
                });
    }

    private static Runnable timeConsumingProcess(){
        return () -> {
            try {
                Util.sleepSeconds(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Operation Completed");
        };
    }
}
