package es.ajifernandez.codingame.temperatures;
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
        in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.err.println(temps);
        String[] tempsArray = temps.split(" ");
        
        int closetTemp = 0;
        try{
            closetTemp = Integer.valueOf(tempsArray[0]);
            for(int i = 0; i < n; i++){
                int temp = Integer.valueOf(tempsArray[i]);
                if(temp > 0 && closetTemp > 0){
                    closetTemp = temp < closetTemp ? temp : closetTemp;
                }else if(temp < 0 && closetTemp < 0){
                    closetTemp = temp > closetTemp ? temp : closetTemp;
                }else{
                    //mismo valor aunque signo distinto
                    if(Math.abs(closetTemp) == Math.abs(temp)){
                        //Nos quedamos con el positivo
                        if(temp > 0){
                            closetTemp = temp;
                        }
                    }else{
                        if(Math.abs(closetTemp) > Math.abs(temp)){
                            closetTemp = temp;
                        }
                    }
                }
            }
        }catch(NumberFormatException nfe){
            closetTemp = 0;
        }
        System.out.println(closetTemp);
    }
}