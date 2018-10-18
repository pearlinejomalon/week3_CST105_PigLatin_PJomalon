/** Program: Pig Latin Translation
 * File: PigLatin.java
 * Summary: This program will read from a text file and translate the sentence into Pig Latin.
 * Author: Pearl Jomalon
 * Date: October 17, 2018 (revised)
 */

package pigLatinTranslation;

import java.io.File;
import java.io.*;
import java.util.Scanner;

public class pigLatin {
	
	private static Scanner file;

	public static void main(String[] args) throws FileNotFoundException {
		
		file = new Scanner(new File("file.txt"));
		
		while (file.hasNext()) {
			String userString = file.next();
			String userStringUpper = userString.toUpperCase();
			char secondChar = 'x';
			int userStringLength = userString.length();
			char firstChar = userString.charAt(0);
			
			if (userStringLength > 1) {
				secondChar = userString.charAt(1);
			}
			
			if ((firstChar== 'a') || (firstChar == 'e') || (firstChar == 'i') || (firstChar == 'o') || (firstChar == 'u')) {
				System.out.println(userString + "\t" + userStringUpper + "WAY");
			}
			
			else if ((secondChar == 'a') || (secondChar == 'e') || secondChar == 'i' || (secondChar == 'o') || (secondChar == 'u')) {
				System.out.println(userString + "\t" + userStringUpper.substring(1) + userStringUpper.charAt(0) + "AY");
			}
			
			else {
				System.out.println(userString + "\t" + userStringUpper.substring(2) + userStringUpper.charAt(0) + userStringUpper.charAt(1) + "AY");
			}
		}
	}
}