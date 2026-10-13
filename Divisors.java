/*
    Divisors of a Number
You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.

A number which completely divides another number is called it's divisor.

Example 1:
Input: n = 6

Output = [1, 2, 3, 6]

Explanation: The divisors of 6 are 1, 2, 3, 6.

Example 2:
Input: n = 8

Output: [1, 2, 4, 8]

Explanation: The divisors of 8 are 1, 2, 4, 8.

Example 3:
Input: n = 7

Output:
[1, 7]
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Divisors {

    public int[] divisors(int n) {

        ArrayList<Integer> list = new ArrayList();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        int res[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {

        int n = 8;

        Divisors obj = new Divisors();

        int[] div = obj.divisors(n);

        System.out.println(Arrays.toString(div));
    }

}
