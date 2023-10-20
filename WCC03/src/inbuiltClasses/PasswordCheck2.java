package inbuiltClasses;

import java.util.Scanner;

public class PasswordCheck2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.nextLine();
		if (password.length() >= 8) {
			if (!password.contains(" ")) {
				char c = password.charAt(0);
				if ((c >= 'A' & c <= 'Z') || (c >= 'a' & c <= 'z') || (c >= '0' & c <= '9')) {
					if(password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"))
						System.out.println("Password is valid");
					else
						System.out.println("Password is invalid, it should have one Uppercase letter, lower case letter, one number and a special character");
				} else
					System.out.println("Password is invalid, password cannot have special character at start");
			} else
				System.out.println("Password is invalid, password should not contain spaces");
		} else
			System.out.println("Password entered is invalid, lenght of the password should be more than 8 characters");

	}
}
