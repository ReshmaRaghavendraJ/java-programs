import java.lang.*;
class p34
{
    public static void main(String[] args)
    {
        String s1="  Wel come  ";
        String s2="      we LCOM E";
         s1=s1.trim();
        System.out.println(s1);
         s2=s2.trim();
            System.out.println(s2);
        if(s1.equalsIgnoreCase(s2))
        System.out.println("Strings are Same");
    }
}