/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;

/**
 * @author Zen
 * @version : QuickArray.java, v 0.1 2019/11/20 21:44 Zen Exp $
 */
public class QuickArray {
    private long[] arr;
    private int nElems;
    public QuickArray(int max) {
        arr = new long[max];
        nElems = 0;
    }
    public void insert(long value) {
        arr[nElems++] = value;
    }
    public int size() {
        return nElems;
    }
    public void display(){
        System.out.println(" A = " );
        for( int j = 0 ; j < nElems ; j ++) {
            System.out.print(arr[j] + "  ");
        }
        System.out.println();
    }
    /**
     * 划分
     */
    public int partitionIt(int left ,int right , long pivot){
        int leftPtr = left - 1 ;
        int rightPtr = right + 1;
        while(true) {
            //从左到右找小于特定值的数据项
            //循环体中是一个空语句
            while(leftPtr < right && arr[++leftPtr] < pivot){}
            //循环结束就代表找到了一个大于特定值的数据项
            while(rightPtr > left && arr[--rightPtr] > pivot){}
            //循环结束就代表找到了一个小于特定值的数据项
            if(leftPtr >= rightPtr ){
                break;
            }else{
                swap(leftPtr,rightPtr);
            }
        }
        return  leftPtr;
    }
    public void swap(int dex1 , int dex2) {
        long temp;
        temp = arr[dex1];
        arr[dex1] = arr[dex2];
        arr[dex2] = temp;
    }

    public void quickSort(){
        recQuick(0,nElems-1);
    }

    /**
     * 用递归和划分技术进行快速排序
     * @param left
     * @param right
     */
    private void recQuick(int left , int right){
        if(right - left <= 0) {
            return;
        }else{
            //取分割点的值 这里取得是最后的值
            long pivot = arr[right];
            int partition = partitionIt(left,right,pivot);
            recQuick(left,partition-1);
            recQuick(partition,right);
        }

    }

}