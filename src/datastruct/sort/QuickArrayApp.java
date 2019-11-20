/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;

/**
 * @author Zen
 * @version : QuickArrayApp.java, v 0.1 2019/11/20 22:01 Zen Exp $
 */
public class QuickArrayApp {
    public static void main(String[] args) {
        int maxSize = 16;
        QuickArray arr = new QuickArray(maxSize);
        for(int j =0 ; j < maxSize ; j ++) {
            long  n = (int)(java.lang.Math.random()*199);
            arr.insert(n);
        }
        arr.display();
        arr.quickSort();
        arr.display();
       /* long pivot = 99;
        System.out.println("·Ö¸îµãÎª£º" + pivot);
        int size = arr.size();
        int partDex = arr.partitionIt(0,size-1,pivot);
        System.out.println(partDex);
        arr.display();*/
    }
}