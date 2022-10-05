import java.util.*;
import java.io.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
    }
}
class Main {
    Node head=null;
    Node tail=null;
    public static void main(String[] args) {  
        Main op=new Main();
        op.add(1);
        op.display(); 
        op.add(2);
        op.display(); 
        op.add(3);
        op.display(); 
        op.add(4);
        op.display(); 
        op.add(5);
        op.display(); 
        op.delete(4);
        op.display();   

    }
    void add(int val)
    {
        Node n=new Node(val);
        if(head==null)
        head=n;
        else
        tail.next=n;
        n.next=null;
        tail=n;
    }
    void delete(int index)
    {
        Node curr=head;
        Node prev=null;
        int n=0;
        while(curr!=null)
        {
        if(n==index)
        {
            prev.next=curr.next;
            break;
        }
            prev=curr;
            n++;
            curr=curr.next;       
        }
    }
    void display()
    {
        Node curr=head;
        int n=0;
        while(curr!=null)
        {
            System.out.print("\t["+(n++)+"] -> "+curr.data);
            curr=curr.next;       
        }
        System.out.println();
    }

}
