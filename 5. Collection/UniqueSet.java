import java.util.ArrayList;
import java.util.HashSet;

public class UniqueSet {
    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(1);
        inputList.add(2);
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(2);
        inputList.add(3);
        
        HashSet<Integer> outputSet = new HashSet<Integer>(inputList);
        System.out.println(outputSet);
    }
}

