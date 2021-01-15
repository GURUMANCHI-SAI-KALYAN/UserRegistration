import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	static String firstName;
	static String lastName;
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	firstName();
	lastName();

	}

      }
	class static void firstName() {
		while (true) {
        	System.out.println("Enter FirstName: ");
        	firstName = input.nextLine();
        	if (Pattern.matches("^[A-Z]{1}[a-zA-Z]{2, }$", firstName)) {
            	System.out.println("Valid First Name");
        	}
		else {
           	System.out.println("Invalid First Name");
		}
	    }
    	}
	class static void lastName() {
	 	while (true) {
		System.out.println("Enter LastName: ");
        	lastName = input.nextLine();
        	if (Pattern.matches("^[A-Z]{1}[a-zA-z]{2, }$", lastName)) {
            	System.out.println("Valid Last Name");
        	}
        	else {
            	System.out.println("Invalid Last Name");
		}
	   }
	}
	




