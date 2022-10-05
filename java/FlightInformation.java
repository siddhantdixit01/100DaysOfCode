import java.util.*;
class Flight{
    int flightNumber;
    String destinationPlace;
    float distanceValue,fuelValue;
    Scanner sc = new Scanner(System.in);
    float calFuel(){
        if(distanceValue<=1000.0f){
fuelValue=500.0f;
        }
        else if(distanceValue>1000.0f &&distanceValue<=2000.0f){
fuelValue=1100.0f;
        }
        else{
fuelValue=2200.0f;
        }
        return fuelValue;
    }

    void feedInfo(){
System.out.println("Enter Destination: ");
destinationPlace = sc.nextLine();

System.out.println("Enter Flight no: ");
flightNumber = sc.nextInt();

System.out.println("Enter Distance: ");
distanceValue = sc.nextFloat();

    }

    void showInfo(){
System.out.println("Flight No :"+flightNumber);
System.out.println("Destination: "+destinationPlace);
System.out.println("Distance: "+distanceValue);
System.out.println("Fuel Quantity: "+calFuel());

    }
}
public class FlightInformation{
    public static void main(String args[]) {
        Flight flight = new Flight();

flight.feedInfo();
flight.showInfo();
    }
}
