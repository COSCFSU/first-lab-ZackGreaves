/*
 * Zachary Greaves
 * Sept 11, 2018
 * 
 * This class includes the example problems from Steve Kennedy's Lab00,
 * and also adds a new problem 2 with an ArrayList and LinkedList in the same
 * format
 */
package src.edu.frostburg.cosc310.lab00;;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Zachary Greaves
 */
public class ZacharyGreavesLab00 implements Lab00 {


    /**
     * Makes a long string using Java concatenation.
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem0(int size) {
        System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i;
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * Makes a long string using Java StringBuilder
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            sb.append(i);
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }
    /**
     * Makes an ArrayList and LinkedList
     * @param
     * @return how long it took in milliseconds
     */
    
    public long problem2() {
        List<String> MyList = new ArrayList<>();
        long start = System.currentTimeMillis();
        
        for (int i=0; i<0; i++){
           String str1 = Integer.toString(i);
            MyList.add(str1);
           }
        long end = System.currentTimeMillis();
        return end - start;
        
     
        
    }

}
