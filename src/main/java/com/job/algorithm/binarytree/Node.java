/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job.algorithm.binarytree;

/**
 * Author: Tory
 * Date: 6/5/18
 * Time: 8:51 PM
 */
//创建一个树的节点
//每个node存放两个数据
//一个左node引用和一个右node引用
public class Node {

    public int iData;
    public double dData;
    public Node leftNode;
    public Node rightNode;

    //显示树节点信息
    public void showNode() {
        System.out.println("{ " + iData + "," + dData + " }");
    }
}

