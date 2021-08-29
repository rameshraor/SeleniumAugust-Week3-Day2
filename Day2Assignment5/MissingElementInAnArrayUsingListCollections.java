/**
 * 
 */
package week3.Day2Assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ramesh This code identifies the missing number in an integer array
 *         Uses LIST & COLLECTIONS
 */
public class MissingElementInAnArrayUsingListCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Here is the input
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		// Declare a list - in order to copy the input array items
		List<Integer> lstInput = new ArrayList<Integer>();

		// Iterate through the input array, and add the items to the list
		for (Integer eachNbr : arr) {
			lstInput.add(eachNbr);
		}

		// Print list values - Before sort
		System.out.println("The List items (BEFORE Sort) : " + lstInput);

		// Sort the list
		Collections.sort(lstInput);

		// Print list values - After sort
		System.out.println("The List items (AFTER Sort) : " + lstInput);

		// Iterate thru the list items, and check if the list item corresponds to the
		// iterator itself
		for (int i = 0; i <= (lstInput.size() - 1); i++) {

			if (lstInput.get(i) != (i+1)) { // Check if 1st item (NOT INDEX) value is 1, 2nd item value is 2, and so on

				System.out.println("Missing Element in the List : " + (i+1)); // If it is not matching, print the list item
																			// that is missing
				break;		// Breaks the FOR loop, after identifying the missing number

			}
		}

	}

}
