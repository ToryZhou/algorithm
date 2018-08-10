package com.job.algorithm.hyperloglog;

import net.agkn.hll.HLL;
import org.junit.Test;

public class HyperLogLog {

    @Test
    public void testSimpleUse(){
        final int seed = 123456;
        HashFunction hash = Hashing.murmur3_128(seed);

        // data on which to calculate distinct count
        final Integer[] data = new Integer[]{1, 1, 2, 3, 4, 5, 6, 6,
                6, 7, 7, 7, 7, 8, 10};
        final HLL hll = new HLL(13, 5); //number of bucket and bits per bucket
        for (int item : data) {
            final long value = hash.newHasher().putInt(item).hash().asLong();
            hll.addRaw(value);
        }
        System.out.println("Distinct count="+ hll.cardinality());
    }
}
