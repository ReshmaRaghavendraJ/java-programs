import java.lang.*;
import java.util.Scanner;
class p30
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter String:");
        String msg=s.nextLine();
        String r="";
        for(int i=0;i<msg.length();i++)
            r=msg.substring(i,i+1)+r;
            if(msg.equalsIgnoreCase(r))
            System.out.println("Palindrome...");
            else
            System.out.println("Not a Palindrome...");
    }
}