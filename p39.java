import java.util.*;
import java.lang.*;
class p39
{
    public static void main(String[] args)
    {
        Date d=new Date();
        System.out.println(d.toString());
        String str=d.toString().split(":")[0].split(" ")[3];
        int hr=Integer.parseInt(str);
        if(hr<12)
        System.out.println("Good Morning");
        else if(hr<16)
        System.out.println("Good Afternoon");
        else
        System.out.println("Good Evening");
    }
}