import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();

        System.out.println("Welcome to User Registration!");
        System.out.println("Enter First Name: ");
        userRegistration.firstName(input.next());
        System.out.println("Enter Last Name: ");
        userRegistration.lastName(input.next());
        System.out.println("Enter Email id: ");
        userRegistration.email(input.next());
	System.out.println("enter PHONE NUMBER");
	userRegistration.phoneNumber(input.next());
	System.out.println("enter PASSWORD");
        userRegistration.password(input.next());

	}

	public static void firstName( String firstName ) {
        	System.out.println("Enter FirstName: ");
        	if (Pattern.matches("^[A-Z]{1}[a-zA-Z]*$", firstName)) {
            	System.out.println("Valid First Name");
        	}
		else {
           	System.out.println("Invalid First Name");
		}
	    }
	public static void lastName( String lastName ) {
        	if (Pattern.matches("^[A-Z]{1}[a-zA-z]*$", lastName)) {
            	System.out.println("Valid Last Name");
        	}
        	else {
            	System.out.println("Invalid Last Name");
		}
	   }

	 public static void email(String email) {
		System.out.println("Enter Email: ");
                if (Pattern.matches("^[A-Za-Z]+([.\\+_-#@][a-zA-z])*@[0-9a-zA-Z]+.[a-z]{2,4}([.][a-zA-Z]{2, }*$", email)) {
                System.out.println("Valid Email");
                }
                else {
                System.out.println("Invalid Email");
		}
	   }

	 public static void phoneNumber(String phoneNumber) {
                System.out.println("Enter phoneNumber: ");
                if (Pattern.matches("^91[6-9]{1}[0-9]{9}$", phoneNumber)) {
                System.out.println("Valid NUMBER");
                }
                else {
                System.out.println("Invalid NUMBER");
		}
	    }

	  public static void password(String password) {
                System.out.println("Enter pASSWORD: ");
                if (Pattern.matches("[0-9a-zA-Z]{8, }", password)) {
                System.out.println("Valid PASSWORD");
                }
                else {
                System.out.println("Invalid PASSWORD");
                }
            }

     }


