import java.util.*;
import java.lang.Math;

public class DistanceFind{
    public static void main(String args[]) {
        float X[] = new float[10];
        float Y[] = new float[10];
        int limit=10,counter=0;
        Scanner sc = new Scanner(System.in);

System.out.println("Enter the coordinates: ");
        for(counter=0; counter < limit; counter++){
System.out.println("Enter x"+(counter+1)+" and "+"y"+(counter+1)+": ");
            X[counter] = sc.nextFloat();
            Y[counter] = sc.nextFloat();
        }

        for(counter=0; counter < limit; counter++){
System.out.println("x"+(counter+1)+" and "+"y"+(counter+1)+": "+X[counter]+" , "+Y[counter]);
        }
        double X1 = Math.pow((X[9] - X[0]), 2);
        double Y1 = Math.pow((Y[9] - Y[0]), 2);
        double result = (X1 + Y1);
        result = Math.sqrt(result);

System.out.printf("Distance is:%.2f",result);

    }
}
