import java.util.ArrayList;
import java.util.HashSet;

public class UniqueArrayList {
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
        inputList.add(1);
        
        ArrayList<Integer> outputList = new ArrayList<Integer>(new HashSet<Integer>(inputList));
        System.out.println(outputList);
    }
}
