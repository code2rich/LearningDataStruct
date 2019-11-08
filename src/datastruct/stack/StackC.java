/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.stack;

/**
 * @author Zen
 * @version 1.0: StackC.java, v 0.1 2019/11/08 22:31 Zen Exp $
 */
public interface StackC {
    /**
     * 查找
     * @return
     */
    public char peek();

    /**
     * 进栈
     * @param char
     */
    public void push( char c);

    /**
     * 出栈
     * @return
     */
    public char pop();

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty();

    /**
     * 是否栈满
     * @return
     */
    public boolean isFull();
}