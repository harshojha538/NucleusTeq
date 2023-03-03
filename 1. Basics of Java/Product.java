import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter another number");
        int b = sc.nextInt();
        System.out.println("The product is: " + a*b);
    }
}
