package com.example.task03;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import java.util.Iterator;

public class Task03Main {

    public static void main(String[] args) {

        findMinMax(
                Stream.of(2, 9, 5, 4, 8, 1, 3),
                Integer::compareTo,
                (min, max) ->
                        System.out.println("min: " + min + " / max: " + max)
        );

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        Iterator<? extends T> iterator = stream.iterator();

        T minimum = null;
        T maximum = null;

        if (iterator.hasNext()) {
            minimum = iterator.next();
            maximum = iterator.next();

            while (iterator.hasNext()) {
                T current = iterator.next();

                if (order.compare(current, minimum) < 0) {
                    minimum = current;
                }

                if (order.compare(current, maximum) > 0) {
                    maximum = current;
                }
            }
        }

        minMaxConsumer.accept(minimum, maximum);
    }
}
