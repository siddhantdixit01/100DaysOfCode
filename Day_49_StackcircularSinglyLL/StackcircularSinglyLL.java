import java.util.Scanner; 
public class StackcircularSinglyLL { 
    Node top;
    Node temp;
     class Node { 
      int val;
     Node next;
     Node temp= null; 
     Node(){ 

     }
      Node(int x) {
         val = x; 
         next = null;
      }
     }
     public void push(int x) { 
        Node ptr = new Node(x);
         if (top == null)
          {
             top=ptr; 
             temp=top;
             temp.next=top;
             return; 
        }
         else{ 
            ptr.next=top; 
            top=ptr;
            temp.next=top;
            } 
            System.out.println("Item pushed");
         }

         public void pop()
         {  
            
            if(top==null)
            { 
                System.out.println("UNDERFLOW"); 
            }
            else if (top.next==top)
            {
                {
                    top=null;
                }
            }
        
             else {
                 top=top.next;
                 temp.next=top;
                 }
                
                  System.out.println("Item popped");

                 }


                 public void display()
                 {
                     Node ptr=top;
                      if (ptr==null)
                      {
                         System.out.println("Stack is empty");
                         }
                          else
                          { 
                             System.out.println("Printing Stack elements");
                              while(ptr.next!=top){
                                 System.out.println(" | "+ptr.val+ " | ");
                                  ptr=ptr.next; 
                                }      
                                System.out.println(" | "+ptr.val+ " | ");
                             
                            }
                        }
                         
                    

                    public static void main(String[] args) {
                        Scanner sc=new Scanner(System.in);
                        StackcircularSinglyLL s=new StackcircularSinglyLL();
                        int flag=0;
                            while(flag==0){
                                System.out.println("1.Push");
                                System.out.println("2.Pop");
                                System.out.println("3.Display");
                                System.out.println("4.Exit");
                                int ch=sc.nextInt();
                                switch (ch) {
                                    case 1:
                                        System.out.println("Enter the element to be inserted-");
                                        s.push(sc.nextInt());
                                        break;
                                    case 2:
                                        s.pop();
                                        break;
                                    case 3:
                                        s.display();
                                        break;
                                    case 4:
                                        flag=1;
                                        break;
                                    default:System.out.println("Wrong Input!!");
                                        break;
                                } 
                            }  
                    }
                }