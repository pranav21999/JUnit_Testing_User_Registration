package userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	// Scanner class for user input
	Scanner sc = new Scanner(System.in);

	// method to check username Valid or Invalid
	public boolean validateUsername(String userName) {
		// regex pattern for username
		String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(userName);
		boolean result = matcher.matches();
		if(result)
			return true;
		else
			return false;
	}

	// method to check LastName Valid or Invalid
	public boolean validateLastname(String lastName) {
		// regex pattern for Lastname
		String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(lastName);
		boolean result = matcher.matches();
		if(result)
			return true;
		else
			return false;
	}

	// method to check Email Valid or Invalid
	public boolean validateEmail(String email) {
		/*
		 * regex pattern for email 1)must contain character before @ 2)must contain @
		 * symbol after char 3)must contain char after @ 4)must contain "." symbol
		 * before com or in
		 */
		String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(email);
		boolean result = matcher.matches();

		if(result)
			return true;
		else
			return false;
	}

	// method to check Phoneno Valid or Invalid
	public boolean validateMobileNo(String mobileno) {
		// regex pattern for email
		String regex = "^[1-9]{2}[0-9]{10}$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(mobileno);
		boolean result = matcher.matches();
		if(result)
			return true;
		else
			return false;
	}

	// method to check password Valid or Invalid
	public boolean validatePassword(String password) {
		/*
		 * regex pattern for password: 1)must contain atleast 8 characters 2)must
		 * contain one UpperCase 3)should have 1 numericno 4)has contain Exactily one
		 * specialSymbol.
		 */
		String regex = "^[A-Z]{1}+[a-zA-z1-9]{5,}[@$^]{1}[1-9]{1}$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(password);
		boolean result = matcher.matches();
		if(result)
			return true;
		else
			return false;


	}
}