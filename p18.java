import java.lang.*;
import java.util.Scanner;
class program17
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String:");
        String s1=s.nextLine();
        String s2=s.nextLine();
        int i=s1.indexOf(s2);
        int j=s1.indexOf(s2,i+1);
       String k=s1.substring(i+1,j);
       System.out.println(k);
    }
}
