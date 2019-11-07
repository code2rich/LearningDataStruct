/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;

/**
 * @author Zen
 * @version 1.0: InsertArray.java, v 0.1 2019/11/07 22:59 Zen Exp $
 */
public class InsertArray {
    private long [] arr;
    int nElems;
    public InsertArray(int maxsize){
        arr = new long[maxsize];
        nElems = 0;
    }
    public void insert(long value) {
        arr[nElems++] = value;
    }
    public void display(){
        for ( int j = 0 ; j < nElems ; j ++) {
            System.out.print("  " + arr[j] + "  ");
        }
        System.out.println();
    }

    /**
     * ²åÈëÅÅÐò
     */
    public void insertSort(){
        int out;
        int in;
        long temp;
        for(out = 1; out < nElems ; out ++) {
            temp = arr[out];
            in = out ;
            while(in > 0 && arr[in-1] >= temp){
                arr[in] = arr[in-1];
                in--;
            }
            arr[in] = temp;
        }
    }
}