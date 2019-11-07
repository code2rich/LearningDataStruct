/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;

/**
 * @author Zen
 * @version 1.0: SelectArray.java, v 0.1 2019/11/07 22:22 Zen Exp $
 */
public class SelectArray {
    private long [] arr;
    private int nElems;
    public SelectArray(int maxsize) {
        arr = new long[maxsize];
        nElems = 0;
    }
    public void insert(long value) {
        arr[nElems++] = value;
    }
    public void display() {
        for(int j =0;j < nElems ; j ++) {
            System.out.print("  "+arr[j]+"  ");
        }
        System.out.println();
    }

    /**
     * Ñ¡ÔñÅÅÐò
     */
    public void selectSort(){
        int min;
        int out;
        int in;
        for(out = 0 ; out < nElems;out++){
            min = out;
            for(in = out+1 ; in < nElems ; in++) {
                if(arr[in] < arr[min]) {
                    min = in;
                }
            }
            swap(min,out);
        }
    }
    public void swap(int one,int two){
        long temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}