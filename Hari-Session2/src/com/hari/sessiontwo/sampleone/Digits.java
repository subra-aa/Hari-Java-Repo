package com.hari.sessiontwo.sampleone;

import java.util.List;
import java.util.Vector;

public class Digits {

    public static void main(String[] args) {
        Vector numbers= new Vector(100);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.add(2, 5);


        System.out.println(numbers);


    }
}
