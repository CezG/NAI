//Power of Thor - Episode 1
//https://www.codingame.com/ide/puzzle/power-of-thor-episode-1

//author of solution: Cezary Gulba

import java.util.*;
import java.io.*;
import java.math.*;


class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); 
        int lightY = in.nextInt(); 
        int initialTx = in.nextInt(); 
        int initialTy = in.nextInt(); 

        int thorX = initialTx;
        int thorY = initialTy;
       
        while (true) {
            int remainingTurns = in.nextInt(); 
            String directionX="";
            String directionY="";

            if( thorY > lightY ){
                directionY = "N";
                --thorY;
            }
            else if( thorY < lightY ){
                directionY = "S";
                ++thorY;
            }   
            if( thorX > lightX ){
                directionX = "W";
                --thorX;
            }
            else if( thorX < lightX ){
                directionX = "E";
                ++thorX;
            }
             System.out.println(directionY + directionX);
            
        }
    }
}