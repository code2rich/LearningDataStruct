/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.array;

/**
 * @author Zen
 * @version 1.0: People.java, v 0.1 2019/11/07 20:47 Zen Exp $
 */
public class People {
    private String lastName;
    private String firstName;
    private int age;
    public People(String last,String first , int a){
        lastName = last;
        firstName = first;
        age = a;
    }
    public void displayPeople(){
        System.out.println("Last Name:" + lastName);
        System.out.println("First Name:"+ firstName);
        System.out.println("age:"+ age);
    }
    public String getLastName(){
        return lastName;
    }
}