import java.lang.*;
import java.util.Scanner;
class program13
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Strings:");
        String s1=s.nextLine();
        String s2=s.nextLine();
        int res=s1.compareTo(s2);
        System.out.println(res);
    }
}
