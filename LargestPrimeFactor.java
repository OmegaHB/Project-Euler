/* The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 */

import java.util.Scanner;

public class LargestPrimeFactor {
	public static void main (String[] args) {
		long num;
		boolean prime = true;
		Scanner scan = new Scanner(System.in);
 		System.out.print("Enter number: ");
 		num = scan.nextLong();
		if (num <=1) {
			prime = false;
		} else if (num <= 3) {
			prime = true;
		} else if (num % 2 == 0 || num % 3 == 0) {
			prime = false;
		} else {
			prime = true;
		}
		for (long i = 5; i * i <= num; i = i + 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				prime = false;
				break;
			}
		}
		if (prime == true) {
			System.out.println(num);
			return;
		}
		for (long factor = num/2; factor > 1; factor--) {
			if (num % factor == 0) {
				prime = true;
				for (long i = 2; i <= factor/2; i++) {
					if (factor % i == 0) {
						prime = false;
						break;
					}
				}
				if (prime == true) {
					System.out.println(factor);
					return;
				}
			}
		}
	}
}