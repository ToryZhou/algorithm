/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job.algorithm.exhaustivemethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Tory
 * Date: 6/11/18
 * Time: 7:17 PM
 */
public class Exhaustive {

    public List<Result> calculate(int head, int foot) {
        ArrayList<Result> resultList = new ArrayList<>();
        int i, j;
        for (i = 0; i <= head; i++) {
            j = head - i;
            if (i * 2 + j * 4 == foot) {
                Result result = new Result();
                result.setChicken(i);
                result.setRabbit(j);
                resultList.add(result);
            }
        }
        return resultList;
    }
}
