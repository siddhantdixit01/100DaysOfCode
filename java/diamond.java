public class diamond {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i<=5){
                for(int j=5;j>=i;j--)
                System.out.print(" ");
                for(int k=1;k<=i;k++)
                System.out.print("* ");
                System.out.println();
            }
            else{
                for(int k=5;k<=i;k++)
                System.out.print(" ");
                for(int j=9;j>=i;j--)
                System.out.print("* ");
                System.out.println();
            }
        }
    }
}
