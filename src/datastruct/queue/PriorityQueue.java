/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.queue;

/**
 * @author Zen
 * @version : PriorityQueue.java, v 0.1 2019/11/09 21:25 Zen Exp $
 */
public class PriorityQueue implements Queue {
    private long[] arr;
    private int maxsize;
    private int nElems;
    public PriorityQueue(int size){
        maxsize = size;
        arr = new long[maxsize];
        nElems = 0;
    }
    @Override
    public void insert(long value) {
        int j; //要插入的位置
        if(nElems == 0) {
            arr[nElems++] = value;
        }else{
            for( j = nElems - 1 ; j >= 0 ; j --) {
                if(value > arr[j]) {
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = value;
            nElems++;
        }
    }

    @Override
    public long delete() {
        return arr[--nElems];
    }

    @Override
    public long peek() {
        return arr[nElems-1];
    }

    @Override
    public boolean isEmpty() {
        return nElems == 0;
    }

    @Override
    public boolean isFull() {
        return nElems == maxsize;
    }

    @Override
    public int size() {
        return nElems;
    }
}