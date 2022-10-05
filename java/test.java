import java.util.Scanner;
public class test {

	private int TestCode,CenterReqd,NoCandidate;
	private String description;
	private int CALCNTR()
	{
		return NoCandidate/100+1;
	}
  
	public void SCHDULE(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Test code-");
        TestCode=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter description-");
        description=sc.nextLine();
        System.out.println("Enter no of candidates -");
        NoCandidate=sc.nextInt();
        CenterReqd=CALCNTR();
    }
	public void DISPTEST(){
        System.out.println("Test code "+TestCode+"\nDescripton "+description+"\nNo of candidate "+NoCandidate+"\nCenter required "+CenterReqd);
    }
    public static void main(String[] args) {
        test obj=new test();
	obj.SCHDULE();
	obj.DISPTEST();
    }    
}