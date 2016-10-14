package es.ajifernandez.codingame.asciiart;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

	/**
	 * Sample 1
	 *  4
		5
		E
		 #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###
		# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #
		### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##
		# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #
		# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #
	 */

    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

    public static void main(String args[]) {
    	int L;
    	int H;
    	String T;
    	ArrayList<String> ascii = new ArrayList<String>();

    	boolean debugMode = true;

    	if(debugMode){
    		L = 4;
    		H = 5;
    		T = "E";
			ascii.add(
					" #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###");
			ascii.add(
					"# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #");
			ascii.add(
					"### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##");
			ascii.add(
					"# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #      ");
			ascii.add(
					"# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  # ");
    	}else{
    		Scanner in = new Scanner(System.in);
    		L = in.nextInt();
    		H = in.nextInt();
    		in.nextLine();
    		T = in.nextLine();

    		System.err.println(L);
    		System.err.println(H);
    		System.err.println(T);

    		for (int i = 0; i < H; i++) {
    			String ROW = in.nextLine();
    			ascii.add(ROW);
    		}

    		in.close();
    	}



        //find the necessary indexes of letters
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		for(char c : T.toCharArray()) {
			if(c < 'A' || c > 'z'){
			    indexes.add(26);
			} else {
				for(char letter : alphabet.toCharArray()) {
					if(c == letter || Character.toUpperCase(c) == letter) {
						indexes.add(alphabet.indexOf(letter));
					}
				}
			}
		}

		//print result
		for(int j = 0; j < H; j++) {
			for(int k = 0; k < indexes.size(); k++) {
				System.out.print(ascii.get(j).substring(indexes.get(k)*L, indexes.get(k)*L + L));
			}
			System.out.println();
		}



        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println("#");
    }
}