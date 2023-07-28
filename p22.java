import java.lang.*;
import java.util.Scanner;
class p22
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter hour,minutes and seconds:");
        int h=s.nextInt();
        int m=s.nextInt();
        int se=s.nextInt();
        System.out.println(h+":"+m+":"+se);
    }
}