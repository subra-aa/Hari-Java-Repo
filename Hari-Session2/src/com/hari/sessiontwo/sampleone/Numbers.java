package com.hari.sessiontwo.sampleone;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Numbers {

    public static void main(String[] args) {

        Integer[] numbers=new Integer[]{1,2,3,4,5,6};
        ArrayList values=new ArrayList(Arrays.asList(numbers));

        values.add(20);
        values.get(4);


        System.out.println(values);
        System.out.println(values.size());



    }
}
