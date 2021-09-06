package cst8284.assignment3;

/**
 * Author Name: Mesut Kaplan / 040990961 
 * Class Name: CST 8284_300 Object Oriented Programming Oriented Programming 
 * Date: 11/08/2021 
 * This is SolutionThree.java class, helps to demonstrate to demonstrate rethrowing of an exception
 */
public class SolutionThree {

	/*
	 * Main() method to run the program
	 */
	public static void main(String[] args) {
		
		/*
		 * courseStarting() method is called for throwing exception and catch it and prompt it with printStackTrace
		 */
		try {
			courseStarting();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * courseEnding() method for throwing Exception.
	 */

	public static void courseEnding() throws Exception {
		throw new Exception();
	}

	/*
	 * courseStarting() method is called for catch exception thrown by courseEnding() method again rethrow this Exception.
	 */
	public static void courseStarting() throws Exception {
		try {
			courseEnding();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
