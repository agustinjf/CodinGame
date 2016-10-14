package es.ajifernandez.codingame.thor;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        int thorX = initialTX;
        int thorY = initialTY;
        
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            String directionX = "";
            String directionY = "";
            
            //Movements
            if(thorX == lightX && thorY > lightY){
                //North movement
                thorY += 1;
                
                directionX = "";
                directionY = "N";
            }else if(thorX < lightX && thorY > lightY){
                //NorthEast movement
                thorX += 1;
                thorY += 1;
                
                directionX = "E";
                directionY = "N";
            }else if(thorY == lightY && thorX < lightX){
                //East movement
                thorX +=1;
                
                directionX = "E";
                directionY = "";
            }else if(thorX < lightX && thorY < lightY){
                //SouthEast movement
                thorX += 1;
                thorY += 1;
                
                directionX = "E";
                directionY = "S";
            }else if(thorX == lightX && thorY < lightY){
                //South movement
                thorY += 1;
                
                directionX = "";
                directionY = "S";
            }else if(thorX > lightX && thorY < lightY){
                //SouthWest movement
                thorX -= 1;
                thorY += 1;
                
                directionX = "W";
                directionY = "S";
            }else if(thorY == lightY && thorX > lightX){
                //West movement
                thorX -= 1;
                
                directionX = "W";
                directionY = "";
            }else{
                //NorthWest movement
                thorX -= 1;
                thorY -= 1;
                
                directionX = "W";
                directionY = "N";
            }
            
            System.out.println(directionY+directionX);
        }
    }
}