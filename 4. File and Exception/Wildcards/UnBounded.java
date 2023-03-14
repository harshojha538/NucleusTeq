package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class UnBounded {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();
        list = new ArrayList<String>(); 
        list = new ArrayList<Integer>(); 
        list = new ArrayList<Object>(); 

        for (Object obj : list) {
            System.out.println(obj);
        }
    }   
}
