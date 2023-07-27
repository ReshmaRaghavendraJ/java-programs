import java.lang.*;
import java.util.Scanner;
class program14
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String:");
        String s1=s.nextLine();
        String s2=s.nextLine();
        int i=s1.indexOf(s2);
        System.out.println("Substring found at position:"+i);
    }
}
