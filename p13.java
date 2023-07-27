import java.lang.*;
import java.util.Scanner;
class program12
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Strings:");
        String s1=s.nextLine();
        String s2=s.nextLine();
        if(s1.equals(s2))           (OR)   if(s1.equalsIgnoreCase(s2))
        System.out.println("True");
        else
        System.out.println("False");
    }
}
