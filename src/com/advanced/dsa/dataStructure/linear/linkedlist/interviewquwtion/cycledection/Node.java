package com.advanced.dsa.dataStructure.linear.linkedlist.interviewquwtion.cycledection;

public class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
     class FlyodcycleDection{
    static Node head;
    static  void createList(){
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        //head.next.next.next.next=head.next;// for cycle dected
        head.next.next.next.next=null;//for no cycle
    }
    static boolean hascycle(){
        Node fast=head;
        Node slow=head;
        while (fast != null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }

         public static void main(String[] args) {
             createList();
             System.out.println(hascycle() ? "Cycle dectected":"no cycle");
         }
}
