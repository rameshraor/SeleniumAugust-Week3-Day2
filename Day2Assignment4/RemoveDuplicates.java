/**
 * 
 */
package week3.Day2Assignment4;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author bindh
 */
public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Declare a string as 'Paypal India'
		String strComp = "Paypal India";
		System.out.println("The organization name : " + strComp);

		// Step 2: Convert it into a character array
		char[] arrCharComp = strComp.toCharArray();
		System.out.print("Character array : ");
		for (char c : arrCharComp) {
			System.out.print(c + " ");
		}
		System.out.println();

		// Step 3: Declare a Set as charSet for character
		Set<Character> charSet = new LinkedHashSet<Character>();

		// Step 4: Declare a Set as dupCharSet for duplicate character
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		// Step 5-7: Iterate character array and add it into charSet
		// If the character is already in the charSet, then add it to the dupCharSet
		// Check the dupCharset elements and remove those in the charSet
		for (Character eachChar : arrCharComp) {
			boolean isAdded = charSet.add(eachChar); // Set will not accept duplicates; so, if the char is not added to
														// the set, the boolean will have false
			if (!isAdded) {
				dupCharSet.add(eachChar);			// The duplicate characters, which were not added to charSet, are added to dupCharSet
			}
		}
		System.out.println("charSet : " + charSet);
		System.out.println("dupCharSet : " + dupCharSet);
		
		// Step 8: Iterate using charSet
		// Step 9: Check the iterator variable isn't equals to an empty space
		// Step 10: print the character
		for (Character eachSetChar : charSet) {
			if (eachSetChar != ' ') {
				System.out.print(eachSetChar + " ");
			}
		}

	}

}
