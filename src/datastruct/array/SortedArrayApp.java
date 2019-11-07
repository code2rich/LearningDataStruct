/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.array;

/**
 * @author Zen
 * @version 1.0: SortedArrayApp.java, v 0.1 2019/11/06 22:38 Zen Exp $
 */
public class SortedArrayApp {
    public static void main(String[] args) {
        SortedArray sortedArray = new SortedArray(100);
        sortedArray.insert(55);
        sortedArray.insert(66);
        sortedArray.insert(22);
        sortedArray.insert(44);
        sortedArray.insert(77);
        sortedArray.insert(99);
        sortedArray.insert(11);
        sortedArray.insert(33);
        sortedArray.insert(88);
        sortedArray.insert(202);
        sortedArray.display();
        System.out.println(sortedArray.find(99));
        sortedArray.delete(99);
        sortedArray.display();
        System.out.println(sortedArray.find(99));




    }
}