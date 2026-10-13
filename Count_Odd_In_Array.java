/*
Count of odd numbers in Array
Given an array of n elements. The task is to return the count of the number of odd numbers in the array.

Example 1:
Input: n=5, array = [1,2,3,4,5]

Output: 3

Explanation: The three odd elements are (1,3,5).

Example 2:
Input: n=6, array = [1,2,1,1,5,1]

Output: 5

Explanation: The five odd elements are one 5 and four 1's.
 */
public class Count_Odd_In_Array {
    public int countOdd(int[] arr, int n) {

        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        Count_Odd_In_Array obj = new Count_Odd_In_Array();
        int res = obj.countOdd(arr, n);
        System.out.println(res);

    }
}
