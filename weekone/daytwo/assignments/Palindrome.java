package weekone.daytwo.assignments;

public class Palindrome {
		    public static void main(String[] args) {
	        int input = 121;        // The number we want to check
	        int output = 0;         // To store the reversed number
	        int temp = input;       // Temporary variable to work with

	        // Reverse the number using a loop
	        for (; temp != 0; temp = temp / 10) {
	            int digit = temp % 10;          // Get last digit
	            output = output * 10 + digit;   // Build reversed number
	        }

	        // Compare input and output
	        if (input == output) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }
	    }
	}
