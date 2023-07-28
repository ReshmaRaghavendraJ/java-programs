import java.lang.*;
import java.util.Scanner;
class p23
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Day,month and year:");
        int d=s.nextInt();
        int m=s.nextInt();
        int y=s.nextInt();
        System.out.println(d+"-"+m+"-"+y);
    }
}