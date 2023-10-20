package inbuiltClasses;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.nextLine();
		int upper = 0, special = 0, digit = 0;
		if (password.length() >= 8) {
			if (!password.contains(" ")) {
				char c = password.charAt(0);
				if ((c >= 'A' & c <= 'Z') || (c >= 'a' & c <= 'z') || (c >= '0' & c <= '9')) {

					for (int i = 0; i < password.length(); i++) {
						if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
							upper++;
						else if (password.charAt(i) >= '0' && password.charAt(i) <= '9')
							digit++;
						else if (!(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'))
							special++;
					}
				} else
					System.out.println("Password is invalid, password cannot have special character at start");
			} else
				System.out.println("Password is invalid, password should not contain spaces");
			if (upper > 0) {
				if (digit > 0) {
					if (special > 0) {
						System.out.println("Password is valid");
					} else {
						System.out.println("Password entered is invalid, it should contain atleast one special character");
					}
				} else {
					System.out.println("Password entered is invalid, it should contain atleast one digit ");
				}
			} else
				System.out.println("Password entered is invalid, it should contain atleast one Uppercase character");

		} else
			System.out.println("Password entered is invalid, lenght of the password should be more than 8 characters");

	}
}
