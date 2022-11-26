import java.util.Scanner;
public class SinglyLinkedList {    
    //Represent a node of the singly linked list    
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        } 
        public Node() {       
            this.next = null;    
        }    
    }    
     
    //Represent the head and tail of the singly linked list    
    public Node head = null;    
    public Node tail = null;    
        
    // add a new node to the list    
    public void insertbeg(int data) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added before head such that newNode will point to previous head node  
            newNode.next = head;    
            //newNode will become new head of the list    
            head = newNode;    
        }    
    }   
    
    public void insertend(int data) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {      
            head = newNode;    
        }    
        else {    
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;    
        }    
    }

    public void insertpos(int data,int pos) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {     
            head = newNode;    
        }    
        else { 
            Node temp = head;
            int i=1;
            while(i<pos){
                temp=temp.next;
                i++;
            }    
            if(temp==null)
                System.out.println("Cannot Insert...");

            else if(temp.next == null){
                temp.next=newNode;
            }
            else{
                newNode.next=temp.next;
                temp.next=newNode;
            }
        }    
    }

    public void deletebeg() {    
        //Checks if the list is empty    
        if(head == null) {      
            System.out.println("Empty List");  
        }    
        else {   
            head=head.next;
        }    
    }

    public void deleteend() {    
        //Checks if the list is empty    
        if(head == null) {      
            System.out.println("Empty List");  
        }    
        else {   
            Node temp=head;
            Node temp1=new Node();
            while(temp.next!=null){
                temp1=temp;
                temp=temp.next;
            }
            temp1.next=null;
            temp=null;
        }    
    }

    public void deletepos(int pos) {    
        //Checks if the list is empty    
        if(head == null) {      
            System.out.println("Empty List");  
        } 
        else {   
            Node temp=head;
            int i=1;
            Node temp1=new Node();
            while(i<pos){
                temp1=temp;
                temp=temp.next;
                i++;
            }
            if(temp==null)
                System.out.println("Cannot Delete...");

            else if(temp.next == null){
                temp1.next=null;
                temp=null;
            }
            else if(temp==head){
                head=head.next;
                temp=null;
            }
            else{
                temp1.next=temp.next;
                temp=null;
            }
            
        }    
    }
        
    //display() will display all the nodes present in the list    
    public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
        
    public static void main(String[] args) {    
            
        SinglyLinkedList s = new SinglyLinkedList();    
        Scanner sc=new Scanner(System.in);

        int flag=0;
        while(flag==0){
            System.out.println("1.Insertion at begining");
            System.out.println("2.Insertion at end");
            System.out.println("3.Insertion after given position");
            System.out.println("4.Deletion from begining");
            System.out.println("5.Deletion from end");
            System.out.println("6.Deletion from given position");
            System.out.println("7.Display");
            System.out.println("8.Exit");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the element to be inserted-");
                    s.insertbeg(sc.nextInt());
                    break;

                case 2:
                    System.out.println("Enter the element to be inserted-");
                    s.insertend(sc.nextInt());
                    break;

                case 3:
                    System.out.println("Enter the element to be inserted and after postion-");
                    s.insertpos(sc.nextInt(),sc.nextInt());
                    break;
                case 4:
                    s.deletebeg();
                    break;
                case 5:
                    s.deleteend();
                    break;
                case 6:
                    System.out.println("Enter postion from where element is to be deleted-");
                    s.deletepos(sc.nextInt());
                    break;
                case 7:
                    s.display();
                    break;
                case 8:
                    flag=1;
                    break;
                default:System.out.println("Wrong Input!!");
                    break;
            } 
        }  
    }    
}    
