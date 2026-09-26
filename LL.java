class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Linkedlist {
    Node head;
    void insertAtBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data +"->");
            temp=temp.next;   
        }
        System.out.println("null");
    }
    void countNode(){
        int count=0;
        Node now=head;
        while(now!=null){
            count++;
            now=now.next;
        }
        System.out.println(count);
    }
}
public class LL {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        System.out.println("Original list");
        list.display();
        list.insertAtBeginning(10);
        list.insertAtBeginning(70);
        list.display();
        list.countNode();
    }
}