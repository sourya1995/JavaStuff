package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lec04FluxFromStream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = integerList.stream();
        stream.forEach(System.out::println);
        Flux<Integer> integerFlux = Flux.fromStream(() -> integerList.stream());
        integerFlux.subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }
}
