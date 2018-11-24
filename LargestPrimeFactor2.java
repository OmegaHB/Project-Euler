/* The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 */

import java.util.Scanner;

public class LargestPrimeFactor2 {
	/* Any number is a product of prime numbers
	 * This solution continuously divides the input N by F
	 * With F being a number starting from 2, incrementing by 1 if N is not divisible by F 
	 * F is stored as the current largest prime factor whenever N is found to be divisible by F 
	 * The process repeats until N is 1 and cannot be divided further. */
	public static void main(String[] args) {
		long num, factor, currFactor = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		num = scan.nextLong();
		
		for (factor = 2; num > 1; factor++) {
			if (num % factor == 0) {
				num /= factor;
				currFactor = factor;
				factor--;
			}
		}
		System.out.println(currFactor);
	}
}