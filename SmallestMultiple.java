/* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? */
 
public class SmallestMultiple {
	public static void main(String[] args) {
		long lcd = 1;
		for (long i = 2; i <= 20; i++) {
			lcd = lcm(lcd, i);
		}
		System.out.println(lcd);
	}
	public static long gcd(long num1, long num2) {
	/*  Greatest Common Divisor is the largest number that divides the given numbers */
		long temp;
		while (num2 != 0) {
			temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}
	public static long lcm(long num1, long num2) {
	/* Least Common Multiple is the smallest number that is divisible by the given numbers */
		return ((num1 * num2) / gcd(num1, num2));
	}
}