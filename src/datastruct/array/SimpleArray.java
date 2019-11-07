/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.array;

/**
 * @author Zen
 * @version 1.0: SimpleArray.java, v 0.1 2019/11/06 20:38 Zen Exp $
 */
public class SimpleArray {
    /**
     * 存储数据的数组 私有数据类型 我们现在是一个包装类
     */
    private long [] a;

    /**
     * 构造函数 传入数组可存储元素个数
     * @param maxsize
     */
    public SimpleArray(int maxsize){
        a = new long[maxsize];
    }

    /**
     * 往数组里面存值
     * @param index 下标
     * @param value 数值
     */
    public void setElems(int index,long value) {
        a[index] = value;
    }

    /**
     * 从数组种取值
     * @param index 下标
     * @return 下标对应的数值
     */
    public long getElems(int index) {
        return a[index];
    }
}