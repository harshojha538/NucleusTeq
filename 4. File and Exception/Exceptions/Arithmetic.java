package Exceptions;

public class Arithmetic{
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }   
    }
}