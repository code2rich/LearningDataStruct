/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.array;

/**
 * @author Zen
 * @version 1.0: PeopleArrayApp.java, v 0.1 2019/11/07 20:48 Zen Exp $
 */
public class PeopleArrayApp {
    public static void main(String[] args) {
        PeopleArray peopleArray = new PeopleArray(100);
        peopleArray.insert("zhu","jin",12);
        peopleArray.insert("zhu1","jin",13);
        peopleArray.insert("zhu2","jin",14);
        peopleArray.insert("zhu3","jin",15);
        peopleArray.insert("zhu4","jin",16);
        peopleArray.insert("zhu5","jin",17);
        peopleArray.insert("zhu6","jin",18);
        peopleArray.insert("zhu7","jin",18);
        peopleArray.insert("zhu8","jin",18);
        peopleArray.insert("zhu9","jin",19);
        peopleArray.insert("zhu10","jin",19);
        peopleArray.insert("zhu11","jin",19);
        peopleArray.insert("zhu12","jin",19);
        peopleArray.insert("zhu13","jin",10);
        peopleArray.insert("zhu14","jin",10);
        peopleArray.insert("zhu15","jin",111);
        peopleArray.display();
        System.out.println(peopleArray.find("zhu15"));
        System.out.println(peopleArray.delete("zhu15"));
        System.out.println(peopleArray.find("zhu15"));

    }
}