/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.array;

/**
 * @author Zen
 * @version 1.0: SimpleArrayApp.java, v 0.1 2019/11/06 20:39 Zen Exp $
 */
public class SimpleArrayApp {
    public static void main(String[] args) {
        SimpleArray simpleArray = new SimpleArray(100);
        simpleArray.setElems(0,11);
        simpleArray.setElems(1,22);
        simpleArray.setElems(2,33);
        simpleArray.setElems(3,44);
        simpleArray.setElems(4,55);
        simpleArray.setElems(5,66);
        simpleArray.setElems(6,77);
        simpleArray.setElems(7,88);
        simpleArray.setElems(8,99);
        simpleArray.setElems(9,100);
        simpleArray.setElems(10,111);
        simpleArray.setElems(11,122);
        //数组元素个数
        int nElems=12;
        //当前下标
        int j;
        //查找值
        long searchKey;

        //显示所有元素
        for(j = 0;j < nElems;j++){
            System.out.print(simpleArray.getElems(j) + " ");
        }
        //查找66
        searchKey = 88;
        for(j = 0;j <nElems ; j++){
            if(simpleArray.getElems(j) == searchKey){
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
            if(simpleArray.getElems(j) == searchKey){
                break;
            }
        }
        for(int i = j ; i <nElems;i++){
            simpleArray.setElems(i,simpleArray.getElems(i+1));
        }
        nElems --;
        //显示所有元素
        for(j = 0;j < nElems;j++){
            System.out.print(simpleArray.getElems(j) + " ");
        }

    }
}