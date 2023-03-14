package Exceptions;

public class Custom extends Exception {
    static void validateAge(int age) throws Exception{
        if (age < 18) {
            throw new Exception("Age cannot be less than 18");
        } else {
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        int age = 15;
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
