import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in INR: ");
        float Rs = sc.nextFloat();
        System.out.println("""
                Type corresponding keyword and press Enter-
                Yen - y
                Dollar - d
                Euro - e""");
        char s = sc.next().charAt(0);
        switch (Character.toLowerCase(s)) {
            case 'y':
                System.out.printf("%.2f INR = %.2f Yen",Rs,Rs*1.66);
                break;
            case 'd':
                System.out.printf("%.2f INR = %.2f USD",Rs,Rs/82.34);
                break;
            case 'e':
                System.out.printf("%.2f INR = %.2f Euro",Rs,Rs/87.28);
                break;
            default:
                System.out.println("Try Again!!");
                break;
        }
    }
}
