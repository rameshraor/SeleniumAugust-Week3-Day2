/**
 * 
 */
package week3.Day2Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desktop implements Hardware, Software {

	public int hardwareResources(String hardwareType) {
		
		System.out.println("In hardwareResources() method::::");
		System.out.println("The Required Hardware Resource Type is : " + hardwareType);
		
		int hardwareNbrUnits = 0;
		
		if (hardwareType.equals("Hard Drive")) {
			hardwareNbrUnits = 15;
		} else if (hardwareType.equals("RAM")) {
			hardwareNbrUnits = 28;
		} else if (hardwareType.equals("Motherboard")) {
			hardwareNbrUnits = 7;
		} else 
			hardwareNbrUnits = 0;
			
		return hardwareNbrUnits;
		
	}
	
	public String[] softwareResources() {
		String swResourceName[] = {"Windows", "Java", "Eclipse", "JDK", "Notepad", "Chrome"};
		return swResourceName;
	}
	
	
	/**
	 * 
	 * @param modelName	:	Gets the model name that has been requested by the user, and prints it
	 */
	
	public void desktopModel(String modelName) {
		
		System.out.println("The requested Desktop model is : " + modelName);

	}

	
	public static void main(String[] args) {

		// Instantiating the object
		Desktop objMyDesktop = new Desktop();
		
		// Assign the hardware requirements, that need to be passed as the parameters
		String[] hwResType = {"RAM", "Hard Drive", "Motherboard", "Monitor", "CPU"};
		
		// Call the hardwareResources method with the parameters
		for (int i=0; i<hwResType.length; i++) {
			
			int hwNbrUnits = 0;
			hwNbrUnits = objMyDesktop.hardwareResources(hwResType[i]);
			System.out.println("Hardware type - " + hwResType[i] + "  ||  # units available : " + hwNbrUnits);
			
		}
		
		
		// Call the softwareResources method with the parameters	
		String[] swResName = objMyDesktop.softwareResources();
		
		List<String> swResNameList = new ArrayList<String>(Arrays.asList(swResName));
		System.out.println("For this project, the Software resources that are required : " + swResNameList);

		
		
		// Call the softwareResources method with the parameters
		String desktopModelName = "Lenovo Thinkpad";
		objMyDesktop.desktopModel(desktopModelName);
		
	}

}
