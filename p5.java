import java.lang.*;
class program5
{
    public static void main(String[] args)
    {
        if(args.length==2)
        {
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int res=a+b;
            System.out.printf("Result=%d",res);
        }
        else
        System.out.println("Help:java program5 <num1> <num2>");
    }
}
