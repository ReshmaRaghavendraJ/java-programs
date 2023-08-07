import java.lang.*;
import java.util.Scanner;
class p28
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Word:");
        String w=s.nextLine();
        //String w="FaceBook";
        for(int i=0;i<w.length();i++)
        {
            String each=w.substring(i,i+1);
            System.out.println(each);
        }
    }
}