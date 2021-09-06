package cst8284.assignment3;

import java.io.IOException;

/**
 * Author Name: Mesut Kaplan / 040990961 
 * Class Name: CST 8284_300 Object Oriented Programming Oriented Programming 
 * Date: 11/08/2021 
 * This is SolutionTwo.java class, helps to demonstrate the use of the catch block using catch (Exception exception)
 */

public class SolutionTwo {

	/*
	 * ExceptionBlue inner class to extend the Exception class
	 */
	class ExceptionBlue extends Exception {
	}

	/*
	 * ExceptionYellow inner class to extend the ExceptionBlue class
	 */
	class ExceptionYellow extends ExceptionBlue {
	}

	/*
	 * Main() method to run the program
	 */
	public static void main(String[] args) {

		/*
		 * These static methods called for throwing exception. They are all throwing
		 * different kind of exceptions
		 */
		
		handleExceptionBlue();
		handleExceptionYellow();
		handleNullPointerException();
		handleIOException();
	}

	/*
	 * HandleExceptionBlue() method, it throws and handles ExceptionBlue
	 */
	public static void handleExceptionBlue() {
		try {
			throw new SolutionTwo().new ExceptionBlue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * HandleExceptionYellow() method, it throws and handles ExceptionYellow
	 */
	public static void handleExceptionYellow() {
		try {
			throw new SolutionTwo().new ExceptionYellow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * HandleNullPointerException() method, it throws and handles NullPointerException
	 */
	public static void handleNullPointerException() {
		try {
			String s = null;
			s.length();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	/*
	 * HandleIOException() method, it throws and handles IOException.
	 */
	public static void handleIOException() {
		try {
			throw new IOException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
