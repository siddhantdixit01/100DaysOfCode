import java.util.Scanner;
 public class area{
    private int len,bre;
    void setDim(int l, int b) {
        this.len=l;
        this.bre=b;
    }
    void getArea() {
       System.out.println("Area of rectangle-"+ (len*bre)); 
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        area a= new area();
        System.out.println("Enter length md breadth of rectangle-");
        int l=sc.nextInt();
        int b=sc.nextInt();
        a.setDim(l,b);
        a.getArea();
    }
 }