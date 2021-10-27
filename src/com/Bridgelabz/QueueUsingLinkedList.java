package com.Bridgelabz;

class QNode{
    int key;
    QNode next;

    public QNode(int key) {
        this.key = key;
        this.next = null;
    }
}

public class QueueUsingLinkedList {
    //create QNode data of front and rear value
    QNode front,rear;
    //constructor to give value to front and rear
    public QueueUsingLinkedList() {
        this.front = front;
        this.rear = rear;
    }
    //method to add key to the queue
    public void enqueue(int key){
        QNode temp = new QNode(key);
        // check the  queue is empty
        if(this.rear == null){
            this.front=this.rear = temp;            // add new node at front and rear there queue is empty
        }
        //add new node at end of the queue
        this.rear.next = temp;
        this.rear = temp;
    }
    //display the queue data
    public void display(){
        QNode temp = front;
        if(this.front == null){
            System.out.println("queue has no value");
        }
        while(temp.next != null){
            System.out.println(temp.key);
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println(temp.key);
        }
    }
}