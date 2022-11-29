import java.util.Scanner;
public class CircularDoublyLinkedList {
    //Create a node
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
       public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
         public Node() {       
            this.next = null; 
            this.prev=null;   
        }    
    }

    // Insertion at beginning

    public void addBeg(int data){
        Node ptr= new Node(data);
        if(head==null){
            head= ptr;
            ptr.next=head;
            ptr.prev=head;
            return;
        }
        ptr.prev=head.prev;
        head.prev.next=ptr;
        head.prev=ptr;
        ptr.next=head;
        head=ptr;
    }

    // Insertion at end

    public void addEnd(int data){
        Node ptr= new Node(data);
        if(head==null){                         
            head = ptr;
            ptr.next=head;
            ptr.prev=head;
            return;
        }
        head.prev.next=ptr;
        ptr.prev=head.prev;
        head.prev=ptr;
        ptr.next=head;
    }

    // Insertion at specific pos

    public void addSpec(int data, int loc){
       Node ptr = new Node(data);    
            
       //Checks if the list is empty    
       if(head == null) {     
           head = ptr;
            ptr.next=head;
            ptr.prev=head;
       }     
       else { 
           int i=1;
           while(i<=loc){
                head=head.next;
                i++;
            }
            addBeg(data);
        }  
    }
    
        // Delete from first pos

        public void delFirst(){
            if(head==null){
                System.out.println("Can't Delete");
                return;
            }
            else if(head.next==head){    
                head=null;
                return;
            }
            head.prev.next=head.next;
            head.next.prev=head.prev;
            head=head.next;
        }

        // Delete from last pos

        public void delLast(){
            if(head==null){
                System.out.println("Can't Delete");
                return;
            }
            else if(head.next==head){
                head=null;
                return;
            }
            head.prev.prev.next=head;
            head.prev=head.prev.prev;
        }
          
        public void delSpec(int pos) {    
            //Checks if the list is empty    
            if(head == null) {      
                System.out.println("Empty List");  
            } 
            else {   
                int i=1;
                while(i<pos){
                    head=head.next;
                    i++;
                }
                delFirst();               
            }   
        }
        public void display(){
            if(head==null){
                System.out.println("Empty List ");
                return;
            }
            if (head.next==head) {
                System.out.print(head.data); 
                System.out.println(); 
                return;
            }
            Node ptr=head;
            while(ptr.next != head){
                System.out.print(ptr.data);    
                if(ptr.next != head)
                    System.out.print("->"); 
                ptr=ptr.next;
            }
            System.out.print(ptr.data); 
            System.out.println(); 
        }


        public static void main(String[] args) {    
            
            CircularDoublyLinkedList s = new CircularDoublyLinkedList();    
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
                        s.addBeg(sc.nextInt());
                        break;
    
                    case 2:
                        System.out.println("Enter the element to be inserted-");
                        s.addEnd(sc.nextInt());
                        break;
    
                    case 3:
                        System.out.println("Enter the element to be inserted and after postion-");
                        s.addSpec(sc.nextInt(), sc.nextInt() );
                        break;
                    case 4:
                        s.delFirst();
                        break;
                    case 5:
                        s.delLast();
                        break;
                    case 6:
                        System.out.println("Enter postion from where element is to be deleted-");
                        s.delSpec(sc.nextInt());
                        break;
                   // case 7:
                       // System.out.println("Enter the element to be searched-");
                       // s.search(sc.nextInt());
                       // break;
                    case 7:
                    System.out.println("Elements in list");
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
