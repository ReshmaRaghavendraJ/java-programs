import java.util.Scanner;

class p20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        float res = (float) num1 / num2; // Corrected the syntax here
        System.out.println(res);
    }
}
