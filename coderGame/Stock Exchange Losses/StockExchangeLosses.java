import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List <Integer> ar = new ArrayList<>();
        int min;
        int minIndex;
        int max;
        int delta;
		
		 // List <Integer> deltas = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
            // int v = in.nextInt();
            // ar.add(v);
            // System.err.println("Value "+ v);
        // }
        // for( int i = 0; i < n-1; i++){
            // deltas.add(ar.get(i+1)-ar.get(i));
        // }
        // delta = Collections.min(deltas);


        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            ar.add(v);
            System.err.println("Value "+ v);
        }
        min = Collections.max(ar);
        minIndex=ar.indexOf(min);
        for(int i=n-1; i>=0 ; i-- ){
            if(min>ar.get(i)){
                min = ar.get(i);
                minIndex = i;

            }
        }
        max= min;
        for(int i=0; i<minIndex;i++){
            if(max<ar.get(i)) max =ar.get(i);
  //          System.err.println("MAX i "+i +" "+ max);
        }

        delta= min - max;

//System.err.println("MIN "+ min);
//System.err.println("MAX "+ max);
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(delta);
    }
}