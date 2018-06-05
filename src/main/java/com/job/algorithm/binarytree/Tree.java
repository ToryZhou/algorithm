/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job.algorithm.binarytree;

/**
 * Author: Tory
 * Date: 6/5/18
 * Time: 8:53 PM
 */
public class Tree {
    private Node root;

    //插入Node
    //插入之前需要判断是否为null
    //为null需要比较大小直到currentNode为null就插入
    public void insert(int iData, double dData) {
        //创建node节点
        Node newNode = new Node();
        newNode.iData = iData;
        newNode.dData = dData;
        //判断root node是否为null
        if (root == null) {
            root = newNode;
        }
        //不为null
        else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;//保存当current变为null之前的那一个父节点
                if (iData < current.iData)//插入左节点
                {
                    current = current.leftNode;//不断向左node寻找是否为null
                    if (current == null) {
                        parent.leftNode = newNode;
                        return;
                    }

                }
                //插入右节点
                else {
                    current = current.rightNode;
                    if (current == null) {
                        parent.rightNode = newNode;
                        return;
                    }
                }

            }

        }
    }

    //在tree中寻找关键字
    //返回一个Node
    //显示这个Node
    public Node find(int key) {
        Node current = root;
        while (current.iData != key) {
            if (current.iData > key) {
                current = current.leftNode;
            } else {
                current = current.rightNode;
            }
            if (current == null)
                return null;
        }
        return current;
    }

    //查找树中的最大值和最小值
    //最小值存在于一棵树的最下层的最左node
    //最大值存在于一棵树的最下层的最右node
    public Node[] mVal() {
        Node minNode = null;
        Node maxNode = null;
        Node[] maxminVal = new Node[2];
        Node current = root;//从树的顶部开始搜索
        while (current != null) {
            minNode = current;
            current = current.leftNode;
        }
        maxminVal[0] = minNode;
        current = root;
        while (current != null) {
            maxNode = current;
            current = current.rightNode;
        }
        maxminVal[1] = maxNode;
        return maxminVal;
    }
}
