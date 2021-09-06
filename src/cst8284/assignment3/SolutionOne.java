package cst8284.assignment3;

/**
 * Author Name: Mesut Kaplan / 040990961 
 * Class Name: CST 8284_300 Object Oriented Programming
 * Oriented Programming Date: 11/08/2021 
 * This is SolutionOne.java class, helps to understand super class exception can handle all sub-classes exception.
 */

public class SolutionOne {

	/*
	 * ExceptionOne inner class to extend the Exception class
	 */
	class ExceptionOne extends Exception {
	}

	/*
	 * ExceptionTwo inner class to extend ExceptionOne class
	 */
	class ExceptionTwo extends ExceptionOne {
	}

	/*
	 * ExceptionThree inner class to extend ExceptionTwo class
	 */
	class ExceptionThree extends ExceptionTwo {
	}

	/*
	 * Main() method to run the program
	 */
	public static void main(String[] args) {
		/*
		 * Try block to throw ExceptionTwo class exception
		 */
		try {
			throw new SolutionOne().new ExceptionTwo();
		} catch (ExceptionOne eo) {
			eo.printStackTrace();
		}

		/*
		 * Try block to throw ExceptionThree class exception
		 */
		try {
			throw new SolutionOne().new ExceptionThree();
		} catch (ExceptionOne eo) {
			eo.printStackTrace();
		}

	}

}

