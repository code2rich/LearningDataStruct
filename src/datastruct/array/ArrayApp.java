/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.array;

/**
 * @author Zen
 * @version 1.0: ArrayApp.java, v 0.1 2019/11/06 20:39 Zen Exp $
 * 面向过程操作的实例
 */
public class ArrayApp {
    public static void main(String[] args) {
        //声明数组
        long[] arr;
        //创建数组
        arr = new long[100];
        //数组元素个数
        int nElems=0;
        //当前下标
        int j;
        //查找值
        long searchKey;
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        nElems = 7;
        //显示所有元素
        for(j = 0;j < nElems;j++){
            System.out.println(arr[j]);
        }
        //查找66
        searchKey = 88;
        for(j = 0;j <nElems ; j++){
            if(arr[j] == searchKey){
                break;
            }
        }
        if(j == nElems){
            System.out.println("Can't find searchKey !" + searchKey);
        }else{
            System.out.println("Found" + searchKey);
        }
        //删除55
        searchKey =55;
        for( j = 0 ; j < nElems ;j++ ){
            if(arr[j] == searchKey){
                break;
            }
        }
        for(int i = j ; i <nElems;i++){
            arr[i] = arr[i+1];
        }
        nElems --;
        //显示所有元素
        for(j = 0;j < nElems;j++){
            System.out.println(arr[j]);
        }

    }
}