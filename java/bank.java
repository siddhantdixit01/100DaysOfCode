import java.util.*;
public class bank {
	int accno=0; 
	float balance=0;
	String name;

	//Function to accept details of customers of bank
	void setdata(){
        Scanner s=new Scanner(System.in);
        System.out.print("enter account holder name-");
        name=s.nextLine();
        System.out.print("enter account no-");
        accno=s.nextInt();
        System.out.print("enter balance-");
        balance=s.nextFloat();
    }   
    void lowbalance(){
        if(balance<100){
            System.out.println("Account no. - "+accno);
            System.out.println("balance - "+balance);
        }
    }
    void check(int a){
        if(accno==a)
        transaction(); 
        
    }

    void transaction(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter 1 to Deposit or 0 to Withdraw the money:");
        int k=s.nextInt();
        System.out.print("Enter amount:");
        int amt=s.nextInt();
        switch (k) {
            case 0:
                if(balance>=amt){
                    balance-=amt;
                    System.out.print("Amount withdrawn...\nNew Balance: "+balance);
                }
                else
                    System.out.print("Insufficient balance...");           
                break;

            case 1:
                balance+=amt;
                System.out.print("Amount deposited...\nNew Balance: "+balance);        
                break;
                    
            default:
                System.out.print("Invalid input...");
                break;
        }
    }

    public static void main(String[] args) {
        bank a[]=new bank[200];
        Scanner s= new Scanner(System.in);
		System.out.print("Enter the number of customers:");
		int n=s.nextInt();
        for(int i=0;i<n;i++){
            a[i]=new bank();
            a[i].setdata();
        }


        System.out.println("Enter: \n1 to check for low balance accounts  \n2 to perform transaction in your account");
        int key=s.nextInt();
        switch (key) {
            case 1:
                for(int i=0;i<n;i++){
                    a[i].lowbalance();
                }
                break;
            
            case 2:int c=0;
                System.out.println("Enter account no.-");
                int no=s.nextInt();
                for(int i=0;i<n;i++){
                    a[i].check(no);
                    
                }   
                break;             
        
            default:
                System.out.print("Invalid input...");
                break;
        }
        

    }
}