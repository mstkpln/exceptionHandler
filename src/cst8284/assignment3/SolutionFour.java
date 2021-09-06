package cst8284.assignment3;

import java.io.IOException;

/**
 * Author Name: Mesut Kaplan / 040990961 
 * Class Name: CST 8284_300 Object Oriented Programming Oriented Programming 
 * Date: 11/08/2021 
 * This is SolutionFour.java class, helps to show that the order of the catch blocks in the program is important
 */

public class SolutionFour {

	/*
	 * Main() method to run the program
	 */
	public static void main(String[] args) {
		
		/* 
		 * when you try catching the superclass exception type before the subclass exception type, it shows a compilation error 
		  */
		try {
			throw new Exception();
			throw new IOException();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}