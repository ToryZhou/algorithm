package com.job.algorithm.greedy;

import org.junit.Assert;
import org.junit.Test;

public class RopeTest {

    @Test
    public void test() {
        Rope rope = new Rope();
        Assert.assertEquals(1, rope.cutRope(1));
        Assert.assertEquals(2, rope.cutRope(2));
        Assert.assertEquals(3, rope.cutRope(3));
        Assert.assertEquals(4, rope.cutRope(4));
        Assert.assertEquals(6, rope.cutRope(5));
        Assert.assertEquals(27, rope.cutRope(9));
    }
}
