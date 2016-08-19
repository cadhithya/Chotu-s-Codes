1) USING REMOVE LAST FUNCTION 


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;





class codeChef {

   public static void main(String[] args) {

   

    LinkedList list= new LinkedList();
    
    list.add(1);
    list.add(2);
    list.add(3);                // FOR MANUALLY ADDING VALUES TO LINKED LIST
    list.add(4);
    list.add(5);
    
    list.removeLast(); // java function to remove last node of a linked list
    System.out.println(list);
   }
   
   
}




2) USING list.next.next.next . additon :

class LinkedList {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    void deleteNode(Node list, Node last) {
         
       
        if (list == last) {
            if (list.next == null) {
                System.out.println("There is only one node. The list "
                                 + "can't be made empty ");
                return;
            }
 
           
            list.data = list.next.data;
 
            last = list.next;
 
            list.next = list.next.next;
 
            System.gc();
 
            return;
        }
 
        Node prev = list;
        while (prev.next != null && prev.next != last) {
            prev = prev.next;
        }
 
        if (prev.next == null) {
            System.out.println("Given node is not present in Linked List");
            return;
        }
        prev.next = prev.next.next;
 
        System.gc();
 
        return;
    }
 
    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }
 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
       
        list.head = new Node(12);
        list.head.next = new Node(15);
        list.head.next.next = new Node(10);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(2);
        list.head.next.next.next.next.next.next.next = new Node(3);
        
        
    
        System.out.println("Before deletion \n \n ");
        
        
        list.printList(head);
    
        System.out.println("\n \n Deleting last Node \n \n ");
        list.deleteNode(head, head.next.next.next.next.next.next.next);
       
       
       
        list.printList(head);
 
    }
}


 


