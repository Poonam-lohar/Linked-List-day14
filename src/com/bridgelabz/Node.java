package com.bridgelabz;

/*class node that holds data and a reference to the next node in the list*/

public class Node {

        public int data;
        public com.bridgelabz.Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        public String toString() {
            return "Node [data=" + data + ", next=" + next + "]";
        }
    }
