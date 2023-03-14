package Wildcards;

import java.util.ArrayList;
import java.util.List;


public class LowerBounded {
    public static void main(String[] args) {
        
        List<? super Object> list = new ArrayList<>();
        list.add("foo");
        list.add(42);
        list.add(new Object());

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    
}
