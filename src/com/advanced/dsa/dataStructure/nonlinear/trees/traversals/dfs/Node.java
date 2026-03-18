package com.advanced.dsa.dataStructure.nonlinear.trees.traversals.dfs;

public class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=this.right=null;// node has no children intially
    }
    public static void preoder(Node root){//DLR
        if(root!= null){
            System.out.print(root.data + " ");
            preoder(root.left);
            preoder(root.right);
        }
    }
    public static void inoder(Node root){//LDR
        if(root!= null){

            preoder(root.left);
            System.out.print(root.data + " ");
            preoder(root.right);
        }
    }
    public static void postorder(Node root){//LRD
        if(root!= null){

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

    }
    public static void main(String[] args) {
        //construct binary tree
        //we must construct the tree from top->bottom->,left->right.level by level
        Node root=new Node(1);
        //level1
        root.left=new Node(2);
        root.right=new Node(3);
        //level 2
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        //level 3
        root.left.right.left=new Node(9);
        root.right.right.left=new Node(15);
        preoder(root);
        System.out.println();
        System.out.println("inoder travesal");
        inoder(root);
        System.out.println();
        System.out.println("post oder");
        postorder(root);
        System.out.println();

    }
}
