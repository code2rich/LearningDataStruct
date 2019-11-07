/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.array;

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
    public People find(String searchName) {
        int j;
        for(j = 0;j<nElems;j++){
            if(arr[j].getLastName().equals(searchName)){
                break;
            }
        }
        if(j == nElems){
            return null;
        } else{
            return arr[j];
        }
    }
    public void insert(String last,String first,int a){
        arr[nElems++] = new People(last,first,a);
    }
    public boolean delete(String searchName) {
        int j;
        for(j = 0; j<nElems;j++) {
            if(arr[j].getLastName().equals(searchName)){
                break;
            }
        }
        if(j==nElems){
            return false;
        }else{
            for(int k=j;k < nElems;k++){
                arr[k] = arr[k+1];
            }
            nElems++;
            return true;
        }
    }
    public void display(){
        for(int j = 0 ; j < nElems;j++){
            arr[j].displayPeople();
        }
    }
}