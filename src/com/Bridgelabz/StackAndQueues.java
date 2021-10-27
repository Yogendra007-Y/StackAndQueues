package com.Bridgelabz;

public class StackAndQueues {

    public static void main(String args[]){
        /* stack implement use linkedlist
            create a generic method and class to give any data
         */
        System.out.println("Welcome To Stack Implementation Using LInkedList");

        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(56);
        stackUsingLinkedList.push(30);
        stackUsingLinkedList.push(70);
        stackUsingLinkedList.display();
    }
}
