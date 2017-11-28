/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Create a Scanner

		// Prompt the user to enter a password
		System.out.print("Enter a password: ");
		String password = input.nextLine();

		// Display Valid Password if rules are followed, Invalid Password otherwise
		System.out.println(
			(isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
	}

	/** Method isPasswordVaild tests whether a string is a valid password */
	public static boolean isValidPassword(String password) {
		final int LENGTH_OF_VALID_PASSWORD = 8;	// Valid length of password
	   final int MINIMUM_NUMBER_OF_DIGITS = 2;	// Minimum digits it must contain

		boolean validPassword = 
			isLengthValid(password, LENGTH_OF_VALID_PASSWORD) && 
			isOnlyLettersAndDigits(password) &&
			hasNDigits(password, MINIMUM_NUMBER_OF_DIGITS);

		return validPassword;
	}

	/** Method isLengthValid tests whether a string is a valid length */
	public static boolean isLengthValid(String password, int validLength) {
		return password.length() >= validLength;
	}

	/** Method isOnlyLettersAndDigits tests if a string contains only letters
	 and digits */
	public static boolean isOnlyLettersAndDigits(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLetterOrDigit(password.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	/** Method hasNDigits tests if a string contains at least n digits */
	public static boolean hasNDigits(String password, int n) {
		int numberOfDigits = 0;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				numberOfDigits++;
			}
			if (numberOfDigits >= n) {
				return true;
			}
		}
		return false;
    }
    
}
