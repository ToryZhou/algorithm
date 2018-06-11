/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job.algorithm.divideandconquer;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author: Tory
 * Date: 6/11/18
 * Time: 8:06 PM
 */
public class DivideandconquerTest {

    @Test
    public void test() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int pos1 = BinarySearch.bSearch(a, 0, a.length - 1, 1);
        int pos5 = BinarySearch.bSearch(a, 0, a.length - 1, 5);
        Assert.assertEquals(0, pos1);
        Assert.assertEquals(4, pos5);
    }
}
