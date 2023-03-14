package Exceptions;

public class NullPointer {
        public static void main(String[] args) {
            String str = null;
            try {
                int len = str.length();
            } catch (NullPointerException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }   
}
