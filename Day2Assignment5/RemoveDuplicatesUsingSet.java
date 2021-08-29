/**
 * 
 */
package week3.Day2Assignment5;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Ramersh
 * 
 * This code will make use of SET to remove the duplicates
 *    SET will not allow duplicates --> so the duplicates are removed when the words are copied to a set
 * 
 */
public class RemoveDuplicatesUsingSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("The input string text : " + text);
		
		// b) Initialize an integer variable as count
		int count = 0;
		
		// c) Split the String into array and iterate over it  -->  Use SET
		//         Add each word from the string array, and add the words to the set
		String[] arrTextWords = text.split(" ");
		
		Set<String> setTextWords = new LinkedHashSet<String>();
		
		for (String eachString : arrTextWords) {
			setTextWords.add(eachString);
		}
		System.out.println("Now, the Set text : " + setTextWords);
		
		
		// d) Now, that the duplicate words are removed, reconstruct the strict (with nmo duplicates) along with space delimiters
		String strTextNoDupWords = "";
		for (String eachString : setTextWords) {
			strTextNoDupWords = strTextNoDupWords + " " + eachString;
		}

		// e) Displaying the String without duplicate words
		System.out.println("The output string text with duplicate words removed : " + strTextNoDupWords);
	}

}
