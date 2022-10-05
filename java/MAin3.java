import java.util.*;
public class MAin3 {
    public static void main(String[] args) {
        MAin3 obj=new MAin3();
        obj.Print(10);
    }
    void Print(int n)
    {
        if(n==0)
        return;
        System.out.println(n);
        Print(--n);
        System.out.println(">>"+n);

    }
}