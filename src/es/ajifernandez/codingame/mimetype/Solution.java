package es.ajifernandez.codingame.mimetype;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * MIME types are used in numerous internet protocols to associate a media type
 * (html, image, video ...) with the content sent. The MIME type is generally
 * inferred from the extension of the file to be sent.
 * 
 * You have to write a program that makes it possible to detect the MIME type of
 * a file based on its name. Rules You are provided with a table which
 * associates MIME types to file extensions. You are also given a list of names
 * of files to be transferred and for each one of these files, you must find the
 * MIME type to be used.
 * 
 * The extension of a file is defined as the substring which follows the last
 * occurrence, if any, of the dot character within the file name. If the
 * extension for a given file can be found in the association table (case
 * insensitive, e.g. TXT is treated the same way as txt), then print the
 * corresponding MIME type. If it is not possible to find the MIME type
 * corresponding to a file, or if the file doesn’t have an extension, print
 * UNKNOWN.
 * 
 * @author ajifernandez
 *
 */
class Solution {

	/**
	 * Sample 1 html text/html png image/png gif image/gif animated.gif
	 * portrait.png index.html
	 * 
	 */
	public static Map<String, String> extensionMime = new HashMap<String, String>();

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		// Number of elements which make up the association table.
		int Q = in.nextInt(); // Number Q of file names to be analyzed.
		for (int i = 0; i < N; i++) {
			String EXT = in.next(); // file extension
			String MT = in.next(); // MIME type.
			System.err.print(EXT.toUpperCase()+" ");
			System.err.println(MT);
			extensionMime.put(EXT.toUpperCase(), MT);
		}
		in.nextLine();
		System.err.println("comenzamos");
		for (int i = 0; i < Q; i++) {
			String FNAME = in.nextLine(); // One file name per line.
			System.err.println(FNAME);
			if (FNAME.indexOf('.') != -1) {
				String extension = FNAME.substring(FNAME.lastIndexOf('.') + 1);
				System.err.println("Extension " + extension);
				if (extensionMime.get(extension.toUpperCase()) != null) {
					System.out.println(extensionMime.get(extension.toUpperCase()));
				}else{
					System.out.println("UNKNOWN");
				}
			} else {
				System.out.println("UNKNOWN");
			}
		}

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");

		// For each of the Q filenames, display on a line the corresponding MIME
		// type. If there is no corresponding type, then display UNKNOWN.
		// System.out.println("UNKNOWN");
	}
}