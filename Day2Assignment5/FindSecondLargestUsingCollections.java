/**
 * 
 */
package week3.Day2Assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ramesh
 * 
 * This code identifies the second largest number in an integer array
 *     Uses LIST & COLLECTIONS
 */
public class FindSecondLargestUsingCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};
		
		// Declare an Integer List
		List<Integer> lstInputData = new ArrayList<Integer>();
		
		// Iterate through the input int array, and add the items to firstList
		for (Integer eachNbr : data) {
			lstInputData.add(eachNbr);
		}
		
		//Print list values - Before sort
		System.out.println("The List items (BEFORE Sort) : " + lstInputData);
		
		//Sort the list - Using Collections
		Collections.sort(lstInputData);
		
		//Print list values - After sort
		System.out.println("The List items (AFTER Sort) : " + lstInputData);
		
		//Print second largest number in the list (index is identified by subtracting 2 from the size)
		int indexRq = lstInputData.size() - 2;
		System.out.println("The Second largest number in the input array is : " + lstInputData.get(indexRq));
		
	}

}
