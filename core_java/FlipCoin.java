package core_java;
import java.util.*;
public class FlipCoin {
    static int n;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a positive value:");
        n=s.nextInt();
        int k=n;
        int countTail=0;
        int countHead=0;

        while(n>0){
            Random rand = new Random();
            float random_val = rand.nextFloat();
            System.out.println(random_val);
            if(random_val<=0.5){
                countTail++;
            }
            else{
                countHead++;

            }
            n--;
        }
        float tailCount=((float) countTail /k)*100;
        float headCount=((float) countHead /k)*100;
        System.out.println("TailCount :"+tailCount+"%");
        System.out.println("HeadCount :"+headCount+"%");


    }
}
