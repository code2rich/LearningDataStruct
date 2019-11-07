/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.array;

/**
 * @author Zen
 * @version 1.0: GreatArray.java, v 0.1 2019/11/06 21:33 Zen Exp $
 */
public class GreatArray {
    /**
     * 数据存储结构
     */
    private long [] arr;
    /**
     * 统计元素个数
     */
    private int nElems;
    /**
     * 构造方法 初始化数组
     * @param maxsize
     */
    public GreatArray(int maxsize){
        arr = new long[maxsize];
        nElems = 0;
    }

    /**
     * 查找元素
     * @param searchKey
     * @return
     */
    public boolean find(long searchKey) {
        int j;
        for( j = 0; j < nElems ; j++) {
            if(arr[j] == searchKey) {
                break;
            }
        }
        if(j == nElems) {
            return false;
        }else{
            return true;
        }
    }

    /**
     * 插入元素
     * @param value
     */
    public void insert(long value) {
        arr[nElems++] = value;

    }

    /**
     * 删除元素
     * @param value
     * @return
     */
    public boolean delete(long value){
        int j;
        for(j = 0 ;j <nElems ; j++){
            if(arr[j] == value){
                break;
            }
        }
        if(j == nElems){
            return false;
        }else{
            for(int k = j ; k < nElems ; k++) {
                arr[k] = arr[k+1];
            }
            nElems--;
            return true;
        }
    }

    /**
     * 展示所有
     */
    public void display(){
        int j;
        for(j = 0 ; j < nElems ; j ++){
            System.out.print("  " + arr[j] +"  ");
        }
        System.out.println();
    }
}