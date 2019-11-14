/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.link;

/**
 * @author Zen
 * @version : DoubleLinkListApp.java, v 0.1 2019/11/14 20:53 Zen Exp $
 */
public class DoubleLinkListApp {
    public static void main(String[] args) {
        DoubleLinkList list = new DoubleLinkList();
        list.insertFirst(10);
        list.insertFirst(11);
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(14);
        list.insertFirst(15);
        list.insertFirst(16);
        list.insertFirst(17);
        list.insertLast(9);
        list.insertFirst(18);
        list.displayBackward();
        list.displayForward();
    }
}