package weekone.daytwo.assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0; // first Fibonacci number
		int b = 1; // second Fibonacci number

		for (int i = 1; i <= 10; i++) {
			System.out.print(a + " "); // print current number

			// calculate next number
			int c = a + b;
			a = b;
			b = c;

		}
	}
}


