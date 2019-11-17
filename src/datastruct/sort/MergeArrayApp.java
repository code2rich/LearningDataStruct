/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;

/**
 * @author Zen
 * @version : MergeArrayApp.java, v 0.1 2019/11/17 21:46 Zen Exp $
 */
public class MergeArrayApp {
    public static void main(String[] args) {
        int maxsize = 100;
        MergeArray array = new MergeArray(maxsize);
        array.insert(64);
        array.insert(154);
        array.insert(5);
        array.insert(45);
        array.insert(66);
        array.insert(4);
        array.insert(433);
        array.insert(55);
        array.insert(16);
        array.insert(88);
        array.display();
        array.mergeSort();
        array.display();
    }
}