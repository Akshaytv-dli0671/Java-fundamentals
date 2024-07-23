package core_java;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Year :");
        int year=s.nextInt();
        if(year>=1000 && year<=9999){
            if(year %400==0){
                System.out.println("Leap year");
            } else if (year %100!=0 && year%4==0) {
                System.out.println("Leap year");

            }else{
                System.out.println("Not a leap year");
            }
        }
        else{
            System.out.println("Year should be a 4- digit number");
        }

    }
}
