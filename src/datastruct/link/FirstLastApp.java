/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.link;

/**
 * @author Zen
 * @version : FirstLastApp.java, v 0.1 2019/11/13 21:06 Zen Exp $
 */
public class FirstLastApp {
    public static void main(String[] args) {
        FirstLastList list = new FirstLastList();
        list.insertFirst(11,11.0);
        list.insertFirst(5,5.5);
        list.insertLast(20,20.0);
        list.displayList();
    }
}