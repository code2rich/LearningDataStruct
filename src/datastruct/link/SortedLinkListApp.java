/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.link;

/**
 * @author Zen
 * @version : SortedLinkListApp.java, v 0.1 2019/11/13 22:19 Zen Exp $
 */
public class SortedLinkListApp {
    public static void main(String[] args) {
        SortedLinkList list = new SortedLinkList();
        list.insert(10,10.0);
        list.insert(9,9.0);
        list.insert(13,13.0);
        list.displayLinkList();
    }
}