package weekone.daytwo.assignments;

public class IsPrime {

	public static void main(String[] args) {
	    int num = 3;              // The number we want to check
	    boolean isPrime = true;   // Assume it's prime at the start

	    if (num <= 1) {           // Prime numbers must be greater than 1
	        isPrime = false;
	    } else {
	        // Try dividing num by numbers from 2 up to num/2
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {   // If divisible, it's not prime
	                isPrime = false;
	                break;            // Stop checking further
	            }
	        }
	    }

	    // Print the result
	    if (isPrime)
	        System.out.println(num + " is a prime number.");
	    else
	        System.out.println(num + " is not a prime number.");
	}
}
