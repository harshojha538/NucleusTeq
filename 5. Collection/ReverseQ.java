import java.util.LinkedList;
import java.util.Scanner;

public class ReverseQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter the number of elements to reverse: ");
        int k = sc.nextInt();

        reverse(list, k);

        System.out.println("Output: " + list);
        
    }

    public static void reverse(LinkedList<Integer> list, int k) {
        if (list == null || list.isEmpty() || k < 1 || k > list.size()) {
            return;
        }

        LinkedList<Integer> temp = new LinkedList<>();
        int count = 0;
        while (count < k) {
            temp.addFirst(list.removeFirst());
            count++;
        }

        while (!temp.isEmpty()) {
            list.addFirst(temp.removeLast());
        }
    }
}
