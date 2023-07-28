import java.lang.*;
import java.util.Scanner;
class p25
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Current and Previous meter reading:");
        int current=s.nextInt();
        int previous=s.nextInt();
        int unit=current-previous;
        int total=0;
        if(unit<=250)
        total=unit*2;
        else if(unit>250 && unit<=350)
        total=500+(unit-250)*4;
        else if(unit>350)
        total=900+(unit-350)*6;
        System.out.println("Current meter reading is:"+current);
        System.out.println("Previous meter reading is:"+previous);
        System.out.println("Unit:"+unit);
        System.out.println("Total amount:"+total);
    }
}