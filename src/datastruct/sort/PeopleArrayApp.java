/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;
/**
 * @author Zen
 * @version 1.0: PeopleArrayApp.java, v 0.1 2019/11/07 20:48 Zen Exp $
 */
public class PeopleArrayApp {
    public static void main(String[] args) {
        PeopleArray peopleArray = new PeopleArray(100);
        peopleArray.insert("zhub","jin",12);
        peopleArray.insert("zhua","jin",13);
        peopleArray.insert("zhuc","jin",14);
        peopleArray.insert("zhud","jin",15);
        peopleArray.insert("zhue","jin",16);
        peopleArray.insert("zhuf","jin",17);
        peopleArray.insert("zhug","jin",18);
        peopleArray.insert("zhuh","jin",18);
        peopleArray.insert("zhui","jin",18);
        peopleArray.insert("zhuj","jin",19);
        peopleArray.insert("zhuk","jin",19);
        peopleArray.insert("zhul","jin",19);
        peopleArray.display();
        peopleArray.insertSortByLastName();
        peopleArray.display();

    }
}