/* The sum of the squares of the first ten natural numbers is,
 * 
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * 
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum. */
public class SumSquareDifference {
        public static void main(String[] args) {
                long sumOfSq = 0, sum = 0;
                for (int i = 1; i <= 100; i++) {
                        sumOfSq += i * i;
                        sum += i;
                }
                System.out.println(Math.abs(sumOfSq - sum * sum));
        }
}
