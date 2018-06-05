/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job.algorithm.binarytree;

import org.junit.Test;

/**
 * Author: Tory
 * Date: 6/5/18
 * Time: 8:55 PM
 */
public class BinarytreeTest {

    @Test
    public void test() {
        Tree tree = new Tree();
        tree.insert(3, 3.666);
        tree.insert(1, 1.111);
        tree.insert(2, 2.362);
        tree.insert(4, 4.672);
        tree.insert(5, 5.865);
        tree.insert(6, 6.681);
        Node node = tree.find(6);
        if (node == null) {
            System.out.println("we can not find it");
        } else {
            node.showNode();
        }
        //查找tree中的最值
        Node[] temp = tree.mVal();
        temp[0].showNode();
        temp[1].showNode();
    }
}
