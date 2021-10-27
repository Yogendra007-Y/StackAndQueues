package com.Bridgelabz;

public class StackAndQueues {

    public static void main(String args[]){
        /* Queue implement use linkedlist
         * create a generic method and class to give any data
         */
        System.out.println("Welcome to stack implemetation use linkedlist");
        QueueUsingLinkedList queuqUsingLinkedList = new QueueUsingLinkedList();
        queuqUsingLinkedList.enqueue(56);
        queuqUsingLinkedList.enqueue(30);
        queuqUsingLinkedList.enqueue(60);
        queuqUsingLinkedList.display();
        System.out.println("queue front"+queuqUsingLinkedList.front.key);


        /*create object and give the push method value
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(56);
        stackUsingLinkedList.push(30);
        stackUsingLinkedList.push(70);
        stackUsingLinkedList.display();
        System.out.println("\ntop value"+stackUsingLinkedList.peek());
        stackUsingLinkedList.pop();
        stackUsingLinkedList.pop();
        System.out.println("top value"+stackUsingLinkedList.peek());*/
    }
}