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
        int n = in.nextInt(); // the number of temperatures to analyse
        int[] tab=new int[n];
        int result =5526;

        if(n !=0){
            for (int i = 0; i < n; i++) {
                int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
                tab[i]=t;
            }
            for(int x : tab){    
                if(Math.abs(result) > Math.abs(x) || (Math.abs(result) == x && x > 0) )
                    result = x;
            }
        }else{
            result = 0;
        }
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.out.println(result);
    }
}