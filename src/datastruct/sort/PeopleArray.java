/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;


/**
 * @author Zen
 * @version 1.0: PeopleArray.java, v 0.1 2019/11/07 20:48 Zen Exp $
 */
public class PeopleArray {
    private People[] arr;
    private int nElems;
    public PeopleArray(int maxsize){
        arr = new People[maxsize];
        nElems = 0;
    }
    public void insert(String last,String first,int a){
        arr[nElems++] = new People(last,first,a);
    }
    public void display(){
        for(int j = 0 ; j < nElems;j++){
            System.out.print(j);
            arr[j].displayPeople();
        }
        System.out.println();
    }
    public void insertSortByLastName(){
        int in;
        int out;
        People temp;
        for(out = 1 ; out < nElems ;out ++ ) {
            temp = arr[out];
            in = out;
            while(in > 0 && arr[in-1].getLastName().compareTo(temp.getLastName()) > 0) {
                arr[in] = arr[in -1];
                in--;
            }
            arr[in] = temp;
        }
    }
}