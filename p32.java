import java.lang.*;
class p32
{
    public static void main(String[] args)
    {
        String filename="program1.pdf";
        if(filename.endsWith(".pdf"))
        System.out.println("Its a Pdf File");
        else
        System.out.println("Some other file");
    }
}