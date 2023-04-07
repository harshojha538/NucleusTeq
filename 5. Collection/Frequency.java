import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        HashMap<Character, Integer> freqMap = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (freqMap.containsKey(c)) {
                    freqMap.put(c, freqMap.get(c) + 1);
                } else {
                    freqMap.put(c, 1);
                }
            }
        }
       System.out.println(freqMap);
    }
}
