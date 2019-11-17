/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.recursion;

/**
 * @author Zen
 * @version : HanoTowerApp.java, v 0.1 2019/11/17 20:45 Zen Exp $
 */
public class HanoTowerApp {
    static int nDisk = 10 ;
    static int count = 0;
    public static void main(String[] args) {
        doTowers(nDisk,'A','B','C');
    }
    public static void doTowers(int topN,char from , char inter , char to){
        if(topN == 1){
            System.out.println(++count +": Disk 1 from " + from + " to "+to);
        }else{
            doTowers(topN-1,from,to,inter);
            System.out.println("Disk "+topN+" from "+from+" to "+to);
            doTowers(topN-1,inter,from,to);
        }
    }
}