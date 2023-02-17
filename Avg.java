import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number:-");
        float a = sc.nextFloat();
        System.out.println("Enter second Number:-");
        float b = sc.nextFloat();
        System.out.println("Enter third Number:-");
        float c = sc.nextFloat();
        System.out.println("Average is "+ (a+b+c)/3);

    }
}
