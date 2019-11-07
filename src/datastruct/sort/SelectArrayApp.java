/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;

/**
 * @author Zen
 * @version 1.0: SelectArrayApp.java, v 0.1 2019/11/07 22:23 Zen Exp $
 */
public class SelectArrayApp {
    public static void main(String[] args) {
        SelectArray selectArray = new SelectArray(100);
        selectArray.insert(99);
        selectArray.insert(77);
        selectArray.insert(88);
        selectArray.insert(11);
        selectArray.insert(33);
        selectArray.insert(22);
        selectArray.insert(767);
        selectArray.insert(564);
        selectArray.insert(6);
        selectArray.insert(1);
        selectArray.display();
        selectArray.selectSort();
        selectArray.display();
    }
}