import java.lang.*;
import java.util.Scanner;
class p29
{
    public static void main(String[] args)
    {
        String s="Welcome";
        String r=" ";
        for(int i=0;i<s.length();i++)
        {
            String c=s.substring(i,i+1);
            r=c+r;
        }
        System.out.println(r);
    }
}