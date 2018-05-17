package com.job.algorithm.greedy;

public class Rope {

    public int cutRope(int length) {
        if (length == 2)
            return 2;
        if (length == 3)
            return 3;
        if (length < 2)
            return 1;
        if (length == 4)
            return 4;
        return 3 * cutRope(length - 3);
    }
}
