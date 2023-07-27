import java.lang.*;
import java.util.Scanner;
class program11
{
    public static void main(String[] args)
    {
        int s1=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Numbers:");
        String n=s.nextLine();
        String num[]=n.split(",");
        for(int i=0;i<num.length;i++)
        {
            s1=s1+Integer.parseInt(num[i]);
        }
        System.out.println("Sum="+s1);
    }
}
