import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal: ");
        float p = sc.nextFloat();
        System.out.println("Enter Interest Rate: ");
        float r = sc.nextFloat();
        System.out.println("Enter Time (in Years): ");
        float t = sc.nextFloat();
        System.out.println("""
        For simple interest, Press S
        For Compund interest Press C
        Then Press Enter""");

        char i = sc.next().charAt(0);
        if (i=='s' || i=='S'){
            System.out.println("Simple Interest: " + ((p*r*t)/100));
        }
        else{
            double a = p * Math.pow(1+(r/100),t);
            System.out.printf("Compound Interest: %.2f",(a-p));
        }
    }
}
