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
     * 插入一个节点
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
     * 删除节点
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
        //删除的是叶子节点
        if(current.leftChild==null&&current.rightChild==null) {
            if(current==root){
                root = null;
            }else if(isLeftChild){
                //删除的叶子节点是父节点的左子节点
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
     * 向右子节点下找继承者节点
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
     * 查找
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
     * 遍历
     * @param traverseType
     */
    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1:
                System.out.print("从上至下，从左到右遍历");
                preOrder(root);
                break;
            case 2:
                System.out.print("从下到上，从左到右遍历");
                inOrder(root);
                break;
            case 3:
                System.out.print("从下至上从右到左");
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
        System.out.println("....................分割线.............................");
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
        System.out.println(".....................分割线........................");
    }


}