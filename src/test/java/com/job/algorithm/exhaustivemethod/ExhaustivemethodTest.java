/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job.algorithm.exhaustivemethod;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Author: Tory
 * Date: 6/11/18
 * Time: 7:29 PM
 */
public class ExhaustivemethodTest {

    @Test
    public void test() {
        Exhaustive exhaustive = new Exhaustive();
        List<Result> calculate = exhaustive.calculate(35, 94);
        Assert.assertEquals(1, calculate.size());
        Assert.assertEquals(23, calculate.get(0).getChicken());
        Assert.assertEquals(12, calculate.get(0).getRabbit());
    }
}
