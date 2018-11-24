/* A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindromeProduct {
	public static void main(String[] args) {
		int num1, num2,
		     check = 0,
		     result = 0;
		
		for (num1 = 999; num1 >= 100; num1--) {
			for (num2 = 999; num2 >= 100; num2--) {
				check = num1 * num2;
				if (palindrome(check) && check > result) {	
					result = check;
				}
			}
		}
		System.out.println(result);
	}
	public static boolean palindrome(int number) {
		String numString = Integer.toString(number);
		for (int i = 0, j = numString.length() - 1; i < j; i++, j--) {
			if (numString.charAt(i) != numString.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}