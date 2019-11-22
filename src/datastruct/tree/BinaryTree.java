/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.tree;

import java.util.Stack;

/**
 * @author Zen
 * @version : BinaryTree.java, v 0.1 2019/11/21 21:35 Zen Exp $
 */
public class BinaryTree {
    private Node root;
    public BinaryTree() {
        root = null;
    }

    /**
     * ����һ���ڵ�
     * @param id
     * @param dd
     */
    public void insert(int id , double dd){
        Node node = new Node();
        node.iData = id;
        node.dData = dd;
        node.displayNode();
        if(root==null) {
            root = node;
        }else{
            Node current = root;
            Node parent;
            while(true) {
                parent = current;
                if(id < current.iData){
                    current=current.leftChild;
                    if(current==null) {
                        parent.leftChild = node;
                        return;
                    }
                }else{
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    /**
     * ɾ���ڵ�
     * @param key
     * @return
     */
    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true ;
        while(current.iData != key) {
            parent = current;
            if(key < current.iData){
                isLeftChild = true;
                current = current.leftChild;
            }else{
                isLeftChild = false;
                current = current.rightChild;
            }
            if(current==null){
                return false;
            }
        }
        //ɾ������Ҷ�ӽڵ�
        if(current.leftChild==null&&current.rightChild==null) {
            if(current==root){
                root = null;
            }else if(isLeftChild){
                //ɾ����Ҷ�ӽڵ��Ǹ��ڵ�����ӽڵ�
                parent.leftChild =null;
            }else{
                parent.rightChild=null;
            }
        }else if(current.rightChild==null) {
            if(current==root){
                root = current.leftChild;
            }else if(isLeftChild){
                parent.leftChild = current.leftChild;
            }else{
                parent.rightChild = current.leftChild;
            }
        }else if(current.leftChild==null) {
            if(current==root) {
                root = current.rightChild;
            }else if(isLeftChild){
                parent.leftChild = current.rightChild;
            }else{
                parent.rightChild = current.rightChild;
            }
        }else{
            Node successor = getSuccessor(current);
            if(current==root){
                root = successor;
            }else if(isLeftChild) {
                parent.leftChild = successor;
            }else{
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }
        return true;

    }

    /**
     * �����ӽڵ����Ҽ̳��߽ڵ�
     * @param delNode
     * @return
     */
    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;
        while(current!=null)  {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if(successor!=delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    /**
     * ����
     * @param key
     * @return
     */
    public Node find(int key) {
        Node current = root;
        while(current.iData!=key){
            if(key < current.iData){
                current = current.leftChild;
            }else{
                current = current.rightChild;
            }if(current==null){
                return null;
            }
        }
        return current;
    }

    /**
     * ����
     * @param traverseType
     */
    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1:
                System.out.print("�������£������ұ���");
                preOrder(root);
                break;
            case 2:
                System.out.print("���µ��ϣ������ұ���");
                inOrder(root);
                break;
            case 3:
                System.out.print("�������ϴ��ҵ���");
                postOrder(root);
                break;
        }
        System.out.println();
    }
    private void preOrder(Node localRoot) {
        if(localRoot!=null){
            System.out.print(localRoot.iData+" ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }
    private void inOrder(Node localRoot) {
        if(localRoot!=null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData+ " ");
            inOrder(localRoot.rightChild);
        }
    }
    private void postOrder(Node localRoot) {
        if(localRoot!=null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.iData+" ");
        }
    }
    public void displayTree(){
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("....................�ָ���.............................");
        while(isRowEmpty==false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for(int j = 0; j < nBlanks;j++){
                System.out.print(" ");
            }
            while(globalStack.isEmpty()==false){
                Node temp = (Node)globalStack.pop();
                if(temp!=null) {
                    System.out.print(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                if(temp.leftChild!=null || temp.rightChild!=null) {
                    isRowEmpty = false;
                }
                }else{
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j = 0 ; j < nBlanks*2-2;j++){
                    System.out.print(" ");
                }
            }
            System.out.println();
            nBlanks/=2;
            while(localStack.isEmpty()==false) {
                globalStack.push(localStack.pop());
            }
        }
        System.out.println(".....................�ָ���........................");
    }


}