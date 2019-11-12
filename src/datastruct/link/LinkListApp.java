/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.link;

/**
 * @author Zen
 * @version : LinkListApp.java, v 0.1 2019/11/12 21:20 Zen Exp $
 */
public class LinkListApp {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertFirst(10,10.1);
        list.insertFirst(9,9.9);
        list.insertFirst(10,10.1);
        list.insertFirst(10,10.1);
        list.insertFirst(10,10.1);
        list.insertFirst(1999,10999.1);
        list.displayList();
        list.delete(1999);
        list.displayList();
    }
}