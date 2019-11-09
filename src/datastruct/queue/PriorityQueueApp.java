/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.queue;

/**
 * @author Zen
 * @version : PriorityQueueApp.java, v 0.1 2019/11/09 21:34 Zen Exp $
 */
public class PriorityQueueApp {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(10);
        priorityQueue.insert(9);
        priorityQueue.insert(2);
        priorityQueue.insert(3);
        priorityQueue.insert(4);
        priorityQueue.insert(5);
        priorityQueue.insert(6);
        priorityQueue.insert(7);
        priorityQueue.insert(8);
      while(!priorityQueue.isEmpty()){
          System.out.print(priorityQueue.delete());
      }



    }
}