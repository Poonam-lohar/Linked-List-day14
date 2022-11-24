package com.bridgelabz;

import java.util.Scanner;

public class LinkedList {

    Node head;
    Node tail;

    public Node insert(int data) {
        /*
        create a new node
         */
        Node newNode = new Node(data);
        /*
        check list empty
         */
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;// 56->30->70
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List Is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }

    public void append(int data) { //56->30->70
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else  {
            this.tail.next = newNode;
            tail = newNode;
        }
    }
}