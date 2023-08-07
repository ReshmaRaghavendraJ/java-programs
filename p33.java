import java.lang.*;
class p33
{
    public static void main(String[] args)
    {
        String s="My car name is BMW.My car color is Peach.Our car can travell all around India.";
        //String s1=s.replaceAll("car","Flight");
        String s1=s.replaceFirst("car","Bike");
        System.out.println(s1);
    }
}