package com.rp.sec01.assignment;

import com.rp.courseutil.Util;

public class Lec09AssignmentDemo {
    public static void main(String[] args) {
        FileService.read("file1.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }
}
