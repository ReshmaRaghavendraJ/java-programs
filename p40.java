import java.lang.*;
import java.util.*;
class p40
{
    public static void main(String[] args)
    {
        Date d=new Date();
        String d1=d.toString();
        System.out.println("System hrs and days:"+d1);
        String days[]=d1.split(" ");
        String hrs[]=d1.split(":");
        System.out.println(days[0]);
        System.out.println(days[1]);
        System.out.println(days[3]);

    }
}