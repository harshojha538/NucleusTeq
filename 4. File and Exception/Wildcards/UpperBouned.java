package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class UpperBouned {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<>();
        list = new ArrayList<Integer>(); 
        list = new ArrayList<Double>();
        list = new ArrayList<Float>(); 

        // double sum = 0;
        for (Number num : list) {
            System.out.println(num);
        }

        
    }
}
