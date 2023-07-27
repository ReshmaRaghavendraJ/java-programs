import java.lang.*;
import java.util.Scanner;
class program16
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String:");
        String s1=s.nextLine();
        String s2=s.nextLine();
        int p=-1;
        while(true)
        {
            p=s1.indexOf(s2,p+1);
            if(p==-1)
            break;
            System.out.println(p);
        }
    }
}
