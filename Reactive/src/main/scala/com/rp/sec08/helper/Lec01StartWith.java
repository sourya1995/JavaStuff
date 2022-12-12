package com.rp.sec08.helper;

import com.rp.courseutil.Util;

public class Lec01StartWith {
    public static void main(String[] args) {
        NameGenerator nameGenerator = new NameGenerator();
        nameGenerator.generateNames()
                .take(2)
                .subscribe(Util.subscriber());
    }
}
