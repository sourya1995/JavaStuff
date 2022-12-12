package com.rp.sec08.helper;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class NameGenerator {

    public List<String> list = new ArrayList<>();
    public Flux<String> generateNames(){
        return Flux.generate(stringSynchronousSink -> {
            String name = Util.faker().name().firstName();
            stringSynchronousSink.next(name);
        })
                .cast(String.class)
                .startWith(getFromCache());
    }

    private Flux<String > getFromCache(){
        return Flux.fromIterable(list);
    }
}
