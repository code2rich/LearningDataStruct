/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.array;

/**
 * @author Zen
 * @version 1.0: GreatArrayApp.java, v 0.1 2019/11/06 21:33 Zen Exp $
 */
public class GreatArrayApp {
    public static void main(String[] args) {
        GreatArray greatArray = new GreatArray(100);
        greatArray.insert(11);
        greatArray.insert(22);
        greatArray.insert(33);
        greatArray.insert(44);
        greatArray.insert(55);
        greatArray.insert(66);
        greatArray.insert(77);
        greatArray.insert(88);
        greatArray.insert(99);
        greatArray.insert(100);
        greatArray.display();
        System.out.println(greatArray.find(66));
        greatArray.delete(66);
        System.out.println(greatArray.find(66));
        greatArray.display();
    }
}