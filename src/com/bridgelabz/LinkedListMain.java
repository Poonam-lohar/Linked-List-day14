package com.bridgelabz;

import java.util.Scanner;

public class LinkedListMain {

    public static void main(String[] args) {
        /*
        create object linkedlist class
         */

        LinkedList list = new LinkedList();

        System.out.println("Welcome to Data Structure Program (Linked List)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start");//Uc2
        System.out.println("Enter 2 to add data at End"); //UC1
        switch (sc.nextInt()) {

            case 1:
                list.insert(70);
                list.insert(30);
                list.insert(56);

                list.print();
                break;
            case 2:
                list.append(56);
                list.append(30);
                list.append(70);

                list.print();
                break;
        }
    }
}
