import java.lang.*;
import java.util.Scanner;
class program8
{
    public static void main(String[] args)
    {
        //String s="Big Port";
       // int n=s.length();
       Scanner s=new Scanner(System.in);
       System.out.println("Enter String:");
        String s1=s.nextLine();
       int n=s1.length();
       String s2=s1.toUpperCase();
       String s3=s1.toLowerCase();
       System.out.println(s2);
       System.out.println(s3);
        System.out.println(n);
    }
}
