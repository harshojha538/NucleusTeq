import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        float a = sc.nextInt();
        System.out.println("Enter another number");
        float b = sc.nextInt();
        System.out.println("The Sum of the numbers is: " + (a+b));
        System.out.println("The Difference of the numbers is: " + (a-b));
        System.out.println("The Product of the numbers is: " + a*b);
        System.out.println("The Fraction of the numbers is: " + a/b);
        System.out.println("The Mod of the numbers is: " + a%b);
    }
}
