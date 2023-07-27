import java.lang.*;
import java.util.Scanner;
class program7
{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numbers:");
        for(int i=0;i<10;i++)
        {
             int num=s.nextInt();
             int n=num%10;      
                if(n==9)              (OR)    if(num%10==9)
                    sum=sum+n;
        }
        System.out.println("sum="+sum);
    }
}
