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
        System.out.println("������һ����ֵ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            theNumer = sc.nextInt();
        }
        recTriangle();
        System.out.println("�����Ϊ��"+theAnser);
    }
    public static void recTriangle(){
        theStack = new StackX(10000);
        //��ʼ������������
        codePart = 1;
        while(step()==false){};
    }
    public static boolean step() {
        switch (codePart) {
            case 1 : //��ʼ������������
                 theseParame = new Parame(theNumer,6); //6��ʾ��ǰ������ջ����ײ��һ������
                theStack.push(theseParame);
                codePart=2;
                break;
            case 2://��ȡ��һ������
                theseParame = theStack.peek();
                if(theseParame.n == 1){//ȫ������
                    theAnser = 1;
                    codePart = 5;//ȡջ������
                } else{
                    codePart = 3;//����ǰ��ֵ�ŵ�ջ��
                }break;
            case 3: //����ǰ��ֵ�ŵ�ջ��
                Parame newParame = new Parame(theseParame.n-1,4);
                theStack.push(newParame);
                codePart = 2;
                break;
            case 4:
                theseParame = theStack.peek();
                theAnser = theAnser + theseParame.n;
                codePart = 5;//�ٴ�ջ��ȡ��һ������
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