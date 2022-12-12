package com.rp.test;

import com.rp.sec09.helper.BookOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class Lec04AssertTest {

    @Test
    public void test1(){
        Mono<BookOrder> mono = Mono.fromSupplier(() -> new BookOrder());
        StepVerifier.create(mono)
                .assertNext(b -> Assertions.assertNotNull(b.getAuthor()))
                .verifyComplete();
    }
}
