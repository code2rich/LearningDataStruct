/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.link;

/**
 * @author Zen
 * @version : ListQueueApp.java, v 0.1 2019/11/13 22:04 Zen Exp $
 */
public class ListQueueApp {
    public static void main(String[] args) {
        LinkQueue queue = new LinkQueue();
        queue.insert(10,10.0);
        queue.insert(20,10.0);
        queue.insert(30,10.0);
        queue.insert(40,10.0);
        queue.insert(50,10.0);
        queue.displayQueue();
        queue.remove();
        queue.displayQueue();
    }
}