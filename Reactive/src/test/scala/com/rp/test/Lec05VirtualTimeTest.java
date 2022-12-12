package com.rp.test;

import com.rp.sec09.helper.BookOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.time.Duration;

public class Lec05VirtualTimeTest {
    @Test
    public void test1(){
        Mono<BookOrder> mono = Mono.fromSupplier(() -> new BookOrder());
        StepVerifier.create(mono)
                .assertNext(b -> Assertions.assertNotNull(b.getAuthor()))
                .verifyComplete();
    }

    private Flux<String> timeConsumingFlux() {
        return Flux.range(1, 4)
                .delayElements(Duration.ofSeconds(4))
                .map((i -> i + "A"));
    }
}

