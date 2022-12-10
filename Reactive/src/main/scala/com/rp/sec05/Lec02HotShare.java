package com.rp.sec05;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.stream.Stream;

public class Lec02HotShare {
    public static void main(String[] args) {
        Flux<String> movieStream = Flux.fromStream(() -> getMovie())
                .delayElements(Duration.ofSeconds(2))
                        .share();

        movieStream.subscribe(Util.subscriber("sam"));
        movieStream.subscribe(Util.subscriber("mike"));

    }

    private static Stream<String> getMovie(){
        return Stream.of("Scene 1", "Scene 2", "Scene 3", "Scene 4");
    }
    }

