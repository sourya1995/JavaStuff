package com.rp.sec02;

import com.rp.courseutil.Util;
import com.rp.sec02.helper.NameGenerator;

import java.util.List;

public class Lec07FluxVsList {
    public static void main(String[] args) throws InterruptedException {
        /*List<String> names = NameGenerator.getNames(5);
        System.out.println(names);*/

        NameGenerator.getNames(5).subscribe(Util.onNext());

    }
}
