package core_java;
import java.util.*;
public class EqualStrings {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First String:");
        String str1=s.next();
        System.out.println("Enter Second String:");
        String str2=s.next();
        if(str1.equals(str2)){
            System.out.println("Equal Strings!");
        }else{
            System.out.println("Not Equal!");
        }
    }
}
