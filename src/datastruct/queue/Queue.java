package datastruct.queue;

/**
 * @author Zen
 * @version : Queue.java, v 0.1 2019/11/09 20:36 Zen Exp $
 */
public interface Queue {
    /**
     * 入队
     * @param value
     */
    public void insert(long value);

    /**
     * 出队
     * @return
     */
    public long delete();

    /**
     * 查看队头
     * @return
     */
    public long peek();

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty();

    /**
     * 是否为满
     * @return
     */
    public boolean isFull();

    /**
     * 返回元素个数
     * @return
     */
    public int size();
}
