/**
 * 
 */
package week3.Day2Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ramesh
 *     This code removes the duplicates, and identifies the common elements between two arrays
 *        Uses the RETAIN ALL method in the lists
 * 
 */
public class FindIntersectionUsingList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// a) Declare An array for {3,2,11,4,6,7};
		int arrFirstInput[] = { 3, 2, 11, 4, 6, 7 };

		// b) Declare another array for {1,2,8,4,9,7};
		int arrSecondsInput[] = { 1, 2, 8, 4, 9, 7 };

		// c) Declare 2 Integer Lists - for the 2 input arrays
		List<Integer> lstFirstInput = new ArrayList<Integer>();
		List<Integer> lstSecondsInput = new ArrayList<Integer>();

		// Iterate through the 2 input arrays, and add the items to the respective lists
		// that have been declared above
		
		for (Integer eachNbr : arrFirstInput) {
			lstFirstInput.add(eachNbr);
		}
		System.out.println("The first list is : " + Arrays.toString(lstFirstInput.toArray()));
		
		for (Integer eachNbr : arrSecondsInput) {
			lstSecondsInput.add(eachNbr);
		}
		System.out.println("The first list is : " + Arrays.toString(lstSecondsInput.toArray()));
		
		// Find the list items, which are present in both the lists - using "RETAIN ALL" method
		lstFirstInput.retainAll(lstSecondsInput);
		
		System.out.println("Items that are present in BOTH the lists : " + lstFirstInput);

	}

}
