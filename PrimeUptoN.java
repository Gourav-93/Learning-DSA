/*
    Count of Prime Numbers till N
You are given an integer n. You need to find out the number of prime numbers in the range [1, n] (inclusive). Return the number of prime numbers in the range.

A prime number is a number which has no divisors except, 1 and itself.

Example 1:
Input: n = 6

Output: 3

Explanation: Prime numbers in the range [1, 6] are 2, 3, 5.
*/
public class PrimeUptoN {

    public static int isPrimeNumbers(int n) {
        int count = 0;

        for (int i = 2; i <= n; i++) {
            int divisors = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisors++;
                }
            }
            if (divisors == 2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 6;

        int res = isPrimeNumbers(n);
        System.out.println(res);
    }
}

