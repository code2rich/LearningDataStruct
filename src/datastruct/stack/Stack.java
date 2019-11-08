package datastruct.stack;

/**
 * @author Zen
 * @version 1.0: Stack.java, v 0.1 2019/11/08 21:57 Zen Exp $
 */
public interface Stack {
    /**
     * 查找
     * @return
     */
    public long peek();

    /**
     * 进栈
     * @param value
     */
    public void push( long value);

    /**
     * 出栈
     * @return
     */
    public long pop();

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
