/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.queue;

/**
 * @author Zen
 * @version 1.0: ArrayQueueApp.java, v 0.1 2019/11/09 21:10 Zen Exp $
 */
public class ArrayQueueApp {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(10);
        arrayQueue.insert(1);
        arrayQueue.insert(2);
        arrayQueue.insert(3);
        arrayQueue.insert(4);
        arrayQueue.insert(5);
        arrayQueue.insert(6);
        arrayQueue.insert(7);
        arrayQueue.insert(8);
        arrayQueue.insert(9);
        arrayQueue.insert(10);
        arrayQueue.insert(11);
        for(int j = 0 ; j < 10 ; j ++ ){
            System.out.print(arrayQueue.delete()+" ");
        }
        System.out.println();
    }
}