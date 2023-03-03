import java.util.Scanner;

public class Highestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.printf("The greatest number is: " + a);
            }
            else{
                System.out.printf("The greatest number is: " + c);
            }
        }
        else{
            if(b>c){
                System.out.printf("The greatest number is: " + b);
            }
            else{
                System.out.printf("The greatest number is: " + c);
            }
        }
    }
}
