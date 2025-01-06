package Linkedlist;

public class LinkedList {
    class Node{
        int data;
        Node next = null;

        Node(int data){
            this.data = data;            
        }
    }
    Node head = null;
    Node tail = null;

    public void addNodes(int new_data){
        Node new_node = new Node(new_data);

        if(head == null){
            head = new_node;
            tail = new_node;
        }else{
            tail.next = new_node;    
            tail = tail.next;
        }
    }
    public void printMe(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();

        linkedlist.addNodes(1);
        linkedlist.addNodes(2);
        linkedlist.addNodes(3);
        linkedlist.addNodes(4);
        linkedlist.addNodes(5);

        linkedlist.printMe();
    }
}
