/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;

/**
 * @author Zen
 * @version 1.0: BubleArray.java, v 0.1 2019/11/07 21:54 Zen Exp $
 */
public class BubbleArray {
    private long [] arr;
    private int nElems;

    /**
     * 构造函数
     * @param maxsize
     */
    public BubbleArray(int maxsize){
        arr = new long[maxsize];
        nElems = 0 ;
    }
    public void insert(long value) {
        arr[nElems++] = value;
    }
    public void display(){
        int j;
        for(j = 0; j < nElems;j++){
            System.out.print("  " + arr[j] + "  ");
        }
        System.out.println();
    }
    public void bubbleSort(){
        int out;
        int in;
        for( out = nElems -1 ; out > 1 ; out--) {
            for( in = 0 ; in < out ; in ++) {
                if(arr[in] > arr[in+1]){
                    swap(in,in+1);
                }
            }
        }
    }

    /**
     * 交换数组元素的位置
     * @param one
     * @param two
     */
    public void swap(int one,int two) {
        long temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

}