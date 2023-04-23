package org.example;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randoms implements Iterable<Integer> {
    private final Random random;
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        random = ThreadLocalRandom.current();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(min, max);
            }
        };
    }
}