/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.recursion;

import java.util.Scanner;

/**
 * @author Zen
 * @version : StackTriangleApp.java, v 0.1 2019/11/17 22:10 Zen Exp $
 */
public class StackTriangleApp {
    static int theNumer;
    static int theAnser;
    static StackX theStack;
    static int codePart;
    static Parame theseParame;
    public static void main(String[] args) {
        System.out.println("请输入一个数值");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            theNumer = sc.nextInt();
        }
        recTriangle();
        System.out.println("计算答案为："+theAnser);
    }
    public static void recTriangle(){
        theStack = new StackX(10000);
        //开始计算三角数字
        codePart = 1;
        while(step()==false){};
    }
    public static boolean step() {
        switch (codePart) {
            case 1 : //开始计算三角数字
                 theseParame = new Parame(theNumer,6); //6表示当前数据是栈种最底层的一个数据
                theStack.push(theseParame);
                codePart=2;
                break;
            case 2://第取下一列数据
                theseParame = theStack.peek();
                if(theseParame.n == 1){//全部列数
                    theAnser = 1;
                    codePart = 5;//取栈中数据
                } else{
                    codePart = 3;//将当前数值放到栈中
                }break;
            case 3: //将当前数值放到栈中
                Parame newParame = new Parame(theseParame.n-1,4);
                theStack.push(newParame);
                codePart = 2;
                break;
            case 4:
                theseParame = theStack.peek();
                theAnser = theAnser + theseParame.n;
                codePart = 5;//再从栈中取下一个数据
                break;
            case 5:
                theseParame = theStack.peek();
                codePart = theseParame.returnAddress;
                theStack.pop();
                break;
            case 6:
                return true;
        }
        return false;
    }

}