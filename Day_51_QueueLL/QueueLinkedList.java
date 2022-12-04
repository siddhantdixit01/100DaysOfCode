import java.util.Scanner;
public class QueueLinkedList {
Node front;
Node rear;
    class Node{
int data;
Node next;
Node(int x){
data=x;
next=null;
}
    }
public void insert(int x){
        Node ptr=new Node(x);
        if(front==null){
rear=front=ptr;
}
 ptr.next=null;
rear.next=ptr;
rear=ptr;
System.out.println("Inserted");
}
public void delete(){
if(front==null){
            System.out.println("UNDERFLOW\n");
}
else if(front==rear){
front=rear=null;
}
else{
Node temp=front;
front=front.next;
System.out.println("\nDeleted");
}
    }
public void show(){
if(rear==null){
            System.out.println("Queue is empty\n");
        }
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

public static void main(String[] args) {
        QueueLinkedList Qd=new QueueLinkedList();
        int choice=0;
        System.out.println("Queue operations");
        while(choice!=4){
            System.out.println("Enter your choice:\n 1.Enqueue\n 2.Dequeue\n 3.Display\n 4.Exit");
Scanner s=new Scanner(System.in);
choice=s.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter element to insert");
                    int push=s.nextInt();
                    Qd.insert(push);
                    break;
                case 2:
                    Qd.delete();
                    break;
                case 3:
                    Qd.show();
                    break;
                case 4:
                    System.out.println("exit..");
                    break;
                default:
                    System.out.println("Enter valid choice");

}
    }
}
}