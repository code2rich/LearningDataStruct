/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;

/**
 * @author Zen
 * @version 1.0: InsertArrayApp.java, v 0.1 2019/11/07 22:59 Zen Exp $
 */
public class InsertArrayApp {
    public static void main(String[] args) {
        InsertArray insertArray = new InsertArray(100);
        insertArray.insert(22);
        insertArray.insert(1);
        insertArray.insert(44);
        insertArray.insert(665);
        insertArray.insert(32);
        insertArray.insert(76);
        insertArray.insert(43);
        insertArray.insert(444);
        insertArray.insert(55);
        insertArray.display();
        insertArray.insertSort();
        insertArray.display();

    }
}