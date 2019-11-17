/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;

/**
 * @author Zen
 * @version : mergeArray.java, v 0.1 2019/11/17 21:31 Zen Exp $
 */
public class MergeArray {
    private long [] arr;
    private int nElems;
    public MergeArray(int max) {
        arr = new long[max];
        nElems = 0;
    }
    public void insert(long value) {
        arr[nElems++] = value;
    }
    public void display(){
        for(int j =0 ; j < nElems ;j ++) {
            System.out.print(arr[j]+ " ");
        }
        System.out.println();
    }
    public void mergeSort(){
        long [] workSpace = new long[nElems];
        recMergeSort(workSpace,0,nElems-1);
    }
    private void recMergeSort(long[] workSpace,int lower,int upper) {
        if(lower == upper){
            return;
        }else{
            int mid = (lower+upper)/2;
            //�ݹ�ǰ�벿��������
            recMergeSort(workSpace,lower,mid);
            //�ݹ��벿��������
            recMergeSort(workSpace,mid+1,upper);
            merge(workSpace,lower,mid+1,upper);
        }
    }
    private void merge(long[] workSpace,int lowPtr,int highPtr,int upper){
        int j = 0;
        int lower = lowPtr;
        int mid = highPtr-1;
        //Ҫ�鲢������
        int n = upper - lower+1;
        while(lowPtr <= mid && highPtr <=upper){
            if(arr[lowPtr] < arr[highPtr]) {
                workSpace[j++] = arr[lowPtr++];
            }else{
                workSpace[j++] = arr[highPtr++];
            }
        }
        while(lowPtr <= mid){
            workSpace[j++]= arr[lowPtr++];
        }
        while(highPtr <= upper) {
            workSpace[j++] = arr[highPtr++];
        }

        for(j = 0 ; j < n ; j ++) {
            arr[lower+j] = workSpace[j];
        }
    }
}