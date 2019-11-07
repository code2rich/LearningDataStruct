/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;

/**
 * @author Zen
 * @version 1.0: BubbleArrayApp.java, v 0.1 2019/11/07 22:03 Zen Exp $
 */
public class BubbleArrayApp {
    public static void main(String[] args) {
        BubbleArray bubbleArray = new BubbleArray(100);
        bubbleArray.insert(44);
        bubbleArray.insert(33);
        bubbleArray.insert(55);
        bubbleArray.insert(66);
        bubbleArray.insert(77);
        bubbleArray.insert(88);
        bubbleArray.insert(9);
        bubbleArray.insert(5154);
        bubbleArray.insert(111);
        bubbleArray.display();
        bubbleArray.bubbleSort();
        bubbleArray.display();
    }
}