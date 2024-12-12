package com.example.task02;

import java.util.stream.IntStream;

public class Task02Main {

    public static void main(String[] args) {

        /*
        cycleGrayCode(2)
                .limit(10)
                .forEach(System.out::println);
        */

    }

    public static IntStream cycleGrayCode(int n) {

        if (n < 1 || n > 16) {
            throw new IllegalArgumentException("Invalid bit rate.");
        }

        int size = (int) Math.pow(2, n);

        return IntStream.iterate(0, code -> (code + 1) % size)
                .map(code -> code ^ (code >> 1));

    }

}
