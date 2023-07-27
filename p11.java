import java.lang.*;
import java.util.Scanner;
class program10
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Names of the HODS:");
        String names=s.nextLine();
        System.out.println(names);
        String n[]=names.split(",");
        for(int i=0;i<n.length;i++)
        System.out.println(n[i].length());
    }
}
