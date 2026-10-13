/*
Sum of Array Elements
Given an array arr of size n, the task is to find the sum of all the elements in the array.

Example 1:
Input: n=5, arr = [1,2,3,4,5]

Output: 15

Explanation: Sum of all the elements is 1+2+3+4+5 = 15

Example 2:
Input: n=6, arr = [1,2,1,1,5,1]

Output: 11

Explanation: Sum of all the elements is 1+2+1+1+5+1 = 11
 */
public class Sum_of_Array_Elements {

        public int sum(int arr[], int n) {

            int a = arr.length;
            int sum = 0;

            for (int i = 0; i < a; i++) {
                sum = sum + arr[i];
            }

            return sum;
        }

        public static void main(String[] args) {

            int arr[] = { 1, 2, 3, 4, 5 };
            int n = arr.length;

            Sum_of_Array_Elements obj = new Sum_of_Array_Elements();

            int result = obj.sum(arr, n);

            System.out.println("Sum of array elements = " + result);
        }
    }