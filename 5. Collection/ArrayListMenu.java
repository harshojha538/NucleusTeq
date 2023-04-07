import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMenu {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
          
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Display elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    String newElement = sc.next();
                    elements.add(newElement);
                    System.out.println("Element added.");
                    break;
                case 2:
                    System.out.print("Enter element to remove: ");
                    String elementToRemove = sc.next();
                    if (elements.remove(elementToRemove)) {
                        System.out.println("Element removed.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 3:
                    System.out.println("Elements:");
                    System.out.println(elements);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}
