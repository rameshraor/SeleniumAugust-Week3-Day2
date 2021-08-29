/**
 * 
 */
package week3.Day2Assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author bindh
 */
public class SortUsingCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Step 1: Declare a String array and add the Strings values as (Aspire
		// Systems,CTS,Wipro,HCL)
		String[] arrStrComp = { "Aspire Systems", "CTS", "Wipro", "HCL" };
		System.out.println("Input string array declared");
		System.out.println("The company names in the declared array is : ");

		for (String eachArrayElem : arrStrComp) {
			System.out.println(eachArrayElem);
		}

		// Step 2: Get the length of the array
		int nbrCompNames = arrStrComp.length;
		System.out.println("# of company names in the input array : " + nbrCompNames);

		// Step 3: Sort the array (after copying the data to an array list)
		List<String> arrlstCompNames = new ArrayList<String>(Arrays.asList(arrStrComp));
		System.out.println("The Arraylist of Company names : " + arrlstCompNames);

		Collections.sort(arrlstCompNames);
		System.out.println("The Sorted Array list of the company names : " + arrlstCompNames);

		// Step 4: Iterate it in the reverse order, and print the array
		Collections.reverse(arrlstCompNames);
		System.out.println("The Sorted Array list of the company names in REVERSE order : " + arrlstCompNames);

	}

}
