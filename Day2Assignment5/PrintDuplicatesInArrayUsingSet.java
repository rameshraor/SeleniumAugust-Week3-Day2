/**
 * 
 */
package week3.Day2Assignment5;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Ramesh
 * This code will make use of SET to identify the duplicates
 *    SET will not allow duplicates --> the duplicates are removed when the words are copied to a set
 */
public class PrintDuplicatesInArrayUsingSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare the input array
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
				
		// Declare 2 sets - one to retain the numbers which are unique valuess, and another for duplicate numbers
		Set<Integer> setNoDupNbrs = new LinkedHashSet<Integer>();
		Set<Integer> setDupNbrs = new LinkedHashSet<Integer>();
		
		// Iterate through the input array and add each element to the first set
		for (Integer eachNbr : arr) {
			boolean isAdded = setNoDupNbrs.add(eachNbr);

			//if element is already in 1st set, then add the duplicate to 2nd set (Duplicate integer set)
			if (!isAdded) {
				setDupNbrs.add(eachNbr);
			}
		}
		
		// Print the duplicates
		System.out.println("Duplicates are : " + setDupNbrs);
		
		// Print the list items - AFTER removing duplicates
		System.out.println("Values AFTER removing duplicates : " + setNoDupNbrs);

	}

}
