//Horse-racing Duals
//https://www.codingame.com/ide/puzzle/horse-racing-duals

//author of solution: Cezary Gulba

import java.util.*;
import java.io.*;
import java.math.*;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Integer> tab = new ArrayList<>();
        List<Integer> tab2 = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            tab.add(pi);
        }
        Collections.sort(tab);
        for(int i = 0; i < N-1; i++){
            tab2.add(tab.get(i+1)-tab.get(i)) ;
        }
        Collections.sort(tab2);
        System.out.println(tab2.get(0));
    }
}