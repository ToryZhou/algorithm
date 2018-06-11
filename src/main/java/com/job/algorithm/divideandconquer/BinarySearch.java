/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job.algorithm.divideandconquer;

/**
 * Author: Tory
 * Date: 6/11/18
 * Time: 8:03 PM
 */
public class BinarySearch {

    public static int bSearch(int[] data,int left,int right,int key){
        //获取中间位置
        int middle = (left+right)/2;
        //比较key值如相等，返回当前位置，否则确认新的查找空间
        if(data[middle] == key){
            return middle;
        }else if(data[middle] >key){
            return bSearch(data, left, middle-1, key);
        }else{
            return bSearch(data, middle+1, right, key);
        }
    }
}
