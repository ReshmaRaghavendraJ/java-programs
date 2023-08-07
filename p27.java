import java.lang.*;
import java.util.Scanner;
class p27
{
    public static void main(String[] args)
    {
       Scanner msg=new Scanner(System.in);
       System.out.println("Enter Vehicle number and Latitude and Longitude:");
       String s=msg.nextLine();
        int p=s.indexOf('[');
        int q=s.indexOf(']',p+1);
        String vno=s.substring(p+1,q);
        System.out.println("Vehicle number:"+vno);
        int r=s.indexOf('[',q+1);
        int t=s.indexOf(']',r+1);
        String gps=s.substring(r+1,t);
        String loc[]=gps.split(",");
        System.out.println("Latitude:"+loc[0]);
        System.out.println("Longitude:"+loc[1]);
    }
}