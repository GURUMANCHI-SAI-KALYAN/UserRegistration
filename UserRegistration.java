import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static String firstName;
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter FirstName: ");
        firstName = scanner.next();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z|A-Z]*$", firstName)) {
            System.out.println("Valid First Name");
        } else {
            System.out.println("Invalid First Name");
        }

    }
}




