import java.lang.*;
import java.util.Scanner;
class program9
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name and Phone number:");
        String name=s.nextLine();
        String mobile=s.nextLine();
        if(name.length()<3 || mobile.length()!=10)
            System.out.println("Invlid Inputs");
        else
        System.out.println("Calling "+name+"....\n+91"+mobile);
    }
}
