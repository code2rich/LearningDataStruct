/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;

/**
 * @author Zen
 * @version 1.0: People.java, v 0.1 2019/11/07 20:47 Zen Exp $
 */
public class People {
    private String lastName;
    private String firstName;
    private int age;
    public People(String last, String first , int a){
        this.lastName = last;
        this.firstName = first;
        this.age = a;
    }
    public void displayPeople(){
        System.out.print("Last Name:" + lastName+" ");
        System.out.print("First Name:"+ firstName+" ");
        System.out.print("age:"+ age+ " ");
    }
    public String getLastName(){
        return lastName;
    }
}